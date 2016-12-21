package it.polimi.dice.lwdg.loaddemo;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.eclipse.ui.wizards.datatransfer.ZipFileStructureProvider;
import org.eclipse.jface.dialogs.MessageDialog;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * This class create a demo project to show the power of DICER !
 * After create the project in the workspace, a complete collection of ready to use model for some DIA will be available in the Workspace.
 * Also the ecore metamodels is downloaded and registered on Eclipse EMF.  
 * 
 * @author Giorgio Bartoccioni
 *
 */

public class loadDemoHandler extends AbstractHandler {

    /**
     * Create a project in workspace and return a boolean
     * @param projectName The name of the project to be created
     * @return Boolean
     */
    private Boolean createProject(String projectName) {
        IProgressMonitor progressMonitor = new NullProgressMonitor();
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject(projectName);
        if(!project.exists()){
            try {
                project.exists();
                project.create(progressMonitor);
                return true;
            } catch (CoreException e) {
            	return false;
            }
        } else{
            return false;  
        }
        
    }

 
    /**
     * Registers given ecore file in EcoreResourceFactory
     * @param workspaceEcorePath Path of the ecore file relative to the workspace
     * @return Boolean
     */
    private Boolean registerEcore(String workspaceEcorePath) {

        try {
            Path path = new Path(workspaceEcorePath);
            IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
            String osfile = file.getRawLocation().toOSString();

            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
            ResourceSet rs = new ResourceSetImpl();

            final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
            rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

            URI fileURI = URI.createFileURI(osfile);
            Resource r = rs.getResource(fileURI, true);
            EObject eObject = r.getContents().get(0);
            if (eObject instanceof EPackage) {
                EPackage p = (EPackage) eObject;
                EPackage.Registry.INSTANCE.put(p.getNsURI(), p);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Import a ZIP file in the project.
     * @param myfilepath Absolute path of the Zip file to import 
     * @param myproject Project name
     * @return Boolean
     * @throws Exception 
     */
    private Boolean importZip(String myfilepath, String myproject) throws Exception {

        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject(myproject);
        IProgressMonitor progressMonitor = new NullProgressMonitor();
        try {
            project.open(progressMonitor);
            ZipFile zipFile = new ZipFile(myfilepath);
            IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
                public String queryOverwrite(String file) {
                    return ALL;
                }
            };

            ZipFileStructureProvider structureProvider = new ZipFileStructureProvider(zipFile);
            ImportOperation op = new ImportOperation(project.getFullPath(), structureProvider.getRoot(), structureProvider, overwriteQuery);
            op.run(new NullProgressMonitor());
            return true;
        	} catch (ZipException e) {
        	    e.printStackTrace();
        	    throw new Exception("loadDemoHandler: ZipException.\n"+myfilepath+"\nIs zip valid?");
        	} catch (CoreException e) {
        	    e.printStackTrace();
        	    throw new Exception("loadDemoHandler: CoreException");
        	} catch (IOException e) {
        	    e.printStackTrace();
        	    throw new Exception("loadDemoHandler: IOException.\nIs zip valid ?");
        	} catch (InvocationTargetException e) {
        	    e.printStackTrace();
        	    throw new Exception("loadDemoHandler: InvocationTargetException"); 
        	} catch (InterruptedException e) {
        	    e.printStackTrace();
        	    throw new Exception("loadDemoHandler: InterruptedException"); 
        	}
        }

    /**
     * {@inheritDoc}
     */
    @
    Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

        getRepoPreference dialog = new getRepoPreference(window.getShell());
        dialog.open();

        boolean confirm = MessageDialog.openConfirm(
            window.getShell(), "DICE-LWDG",
            "A sample DICER project will be created\n" + "This will take a while...");

        if (confirm) {

            String dicerProject = "Dicer_demo_project";
            String dicerEcore = "/Dicer_demo_project/metamodels/ddsm.ecore";
            String dicermodel = dialog.getModels();
            String dicermetamodel = dialog.getMetamodels();

            try {          	
                if(createProject(dicerProject)){
                    String models = LoadDemoHttp.getFIle(dicermodel);

                    String metamodels = LoadDemoHttp.getFIle(dicermetamodel);
                    
                    importZip(models, dicerProject);

                    importZip(metamodels, dicerProject);

                    registerEcore(dicerEcore);

                    MessageDialog.openInformation(window.getShell(),
                	    "DICE-LWDG",
                	    "Ready to go!");                    
                }else {
                    MessageDialog.openInformation(window.getShell(),
                	    "DICE-LWDG",
                	    "A project with name Dicer_demo_project already exists");
                }
                  
                

            } catch (Exception e) {

                String message = e.getMessage() != null ? e.getMessage() : "Ops! Generic error";

                MessageDialog.openError(window.getShell(), "DICE-LWDG", message);
            }
        }
        return null;
    }
}