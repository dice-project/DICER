package net.sourceforge.dynamicgmf.diagram.part;

import net.sourceforge.dynamicgmf.diagram.wizard.EcoreModelNewDiagramFileWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated
 */
public class EcoreModelInitDiagramFileAction implements IObjectActionDelegate {

	public static class XML extends EcoreModelInitDiagramFileAction {

		@Override
		protected String getModelFileExtension() {
			return "xml"; //$NON-NLS-1$
		}

		@Override
		protected String getDiagramModelFileExtension() {
			return "xml_diagram"; //$NON-NLS-1$
		}

		@Override
		protected void registerExtensionToFactory(EditingDomain editingDomain) {
			editingDomain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(
					getModelFileExtension(), createModelResourceFactory());
		}
		
		protected Factory createModelResourceFactory() {
			return new GenericXMLResourceFactoryImpl();
		}

		@Override
		protected Wizard createNewDiagramFileWizard(URI domainModelURI,
				EObject diagramRoot, TransactionalEditingDomain editingDomain,
				String diagramModelFileExtension) {
			return new EcoreModelNewDiagramFileWizard.XML(domainModelURI, diagramRoot,
					editingDomain, diagramModelFileExtension);
		}
		
	}
	
	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;

	/**
	 * @generated
	 */
	private URI domainModelURI;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		domainModelURI = URI.createPlatformResourceURI(file.getFullPath()
				.toString(), true);
		action.setEnabled(true);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	protected String getModelFileExtension() {
		return "xmi"; //$NON-NLS-1$
	}
	
	protected String getDiagramModelFileExtension() {
		return "xmi_diagram"; //$NON-NLS-1$
	}
	
	protected void registerExtensionToFactory(EditingDomain editingDomain) {
		// Do nothing as default
	}

	protected Wizard createNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain, String diagramModelFileExtension) {
		return new EcoreModelNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain, diagramModelFileExtension);
	}
	
	/**
	 * @generated NOT
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		registerExtensionToFactory(editingDomain);
		
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog
					.openError(
							getShell(),
							Messages.EcoreModelInitDiagramFileAction_InitDiagramFileResourceErrorDialogTitle,
							Messages.EcoreModelInitDiagramFileAction_InitDiagramFileResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = createNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain, getDiagramModelFileExtension());
		wizard.setWindowTitle(NLS.bind(
				Messages.EcoreModelInitDiagramFileAction_InitDiagramFileWizardTitle,
				getModelFileExtension()));
		EcoreModelDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
}
