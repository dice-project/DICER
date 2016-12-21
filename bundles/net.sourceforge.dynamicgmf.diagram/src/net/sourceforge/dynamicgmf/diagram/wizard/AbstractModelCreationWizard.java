package net.sourceforge.dynamicgmf.diagram.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorUtil;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public abstract class AbstractModelCreationWizard extends Wizard {

	/**
	 * @generated
	 */
	public class NewModelFileCreationPage extends WizardNewFileCreationPage {

		/**
		 * @generated
		 */
		private final String fileExtension;

		/**
		 * @generated
		 */
		public NewModelFileCreationPage(String pageName,
				IStructuredSelection selection, String fileExtension) {
			super(pageName, selection);
			this.fileExtension = fileExtension;
		}

		/**
		 * Override to create files with this extension.
		 * 
		 * @generated
		 */
		protected String getExtension() {
			return fileExtension;
		}

		/**
		 * @generated
		 */
		public URI getURI() {
			return URI.createPlatformResourceURI(getFilePath().toString(), false);
		}

		/**
		 * @generated
		 */
		protected IPath getFilePath() {
			IPath path = getContainerFullPath();
			if (path == null) {
				path = new Path(""); //$NON-NLS-1$
			}
			String fileName = getFileName();
			if (fileName != null) {
				path = path.append(fileName);
			}
			return path;
		}

		/**
		 * @generated
		 */
		public void createControl(Composite parent) {
			super.createControl(parent);
			setFileName(EcoreModelDiagramEditorUtil.getUniqueFileName(
					getContainerFullPath(), getFileName(), getExtension()));
			setPageComplete(validatePage());
		}

		/**
		 * @generated
		 */
		protected boolean validatePage() {
			if (!super.validatePage()) {
				return false;
			}
			String extension = getExtension();
			if (extension != null
					&& !getFilePath().toString().endsWith("." + extension)) {
				setErrorMessage(NLS.bind(
						Messages.EcoreModelCreationWizardPageExtensionError, extension));
				return false;
			}
			return true;
		}
	}

	/**
	 * @generated
	 */
	private IWorkbench workbench;
	/**
	 * @generated
	 */
	protected IStructuredSelection selection;
	/**
	 * @generated
	 */
	protected NewModelFileCreationPage diagramModelFilePage;
	/**
	 * @generated
	 */
	protected NewModelFileCreationPage domainModelFilePage;
	/**
	 * @generated
	 */
	protected Resource diagram;
	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	public AbstractModelCreationWizard() {
		super();
	}

	@Override
	public void dispose() {
		workbench = null;
		selection = null;
		
		super.dispose();
	}
	
	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.EcoreModelCreationWizardTitle);
		setDefaultPageImageDescriptor(EcoreModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewEcoreModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	protected abstract String getDiagramModelFileExtension();

	protected abstract String getModelFileExtension();
	
	/**
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new NewModelFileCreationPage(
				"DiagramModelFile", getSelection(), getDiagramModelFileExtension()); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(Messages.EcoreModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.EcoreModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
	
		domainModelFilePage = new NewModelFileCreationPage(
				"DomainModelFile", getSelection(), getModelFileExtension()) { //$NON-NLS-1$
			
			@Override
			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ("." + getDiagramModelFileExtension()).length());
					setFileName(EcoreModelDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, getModelFileExtension()));
				}
				super.setVisible(visible);
			} 
			
		};
		domainModelFilePage
				.setTitle(Messages.EcoreModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.EcoreModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
	
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = createDiagram(
						diagramModelFilePage.getURI(), domainModelFilePage
								.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						EcoreModelDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.EcoreModelCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.EcoreModelCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				EcoreModelDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	protected void registerExtensionToFactory(EditingDomain editingDomain) {
		// Do nothing as default
	}
	
	@SuppressWarnings("unchecked")
	protected Map<Object, Object> getModelResourceSaveOptions() {
		return EcoreModelDiagramEditorUtil.getSaveOptions();
	}
	
	@SuppressWarnings("unchecked")
	protected Map<Object, Object> getDiagramResourceSaveOptions() {
		return EcoreModelDiagramEditorUtil.getSaveOptions();
	}
	
	/**
	 * This method should be called within a workspace modify operation since it creates resources.
	 * @generated NOT
	 */
	private Resource createDiagram(URI diagramURI, URI modelURI, IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		registerExtensionToFactory(editingDomain);
		
		progressMonitor.beginTask(
				Messages.EcoreModelDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);
		final Resource modelResource = editingDomain.getResourceSet()
				.createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				Messages.EcoreModelDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EObject model = createInitialModel();
				attachModelToResource(model, modelResource);
	
				Diagram diagram = ViewService.createDiagram(model,
						RootEditPart.MODEL_ID,
						EcoreModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}
	
				try {
					modelResource
							.save(getModelResourceSaveOptions());
					diagramResource
							.save(getDiagramResourceSaveOptions());
				} catch (IOException e) {
	
					EcoreModelDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		EcoreModelDiagramEditorUtil.setCharset(WorkspaceSynchronizer.getFile(modelResource));
		EcoreModelDiagramEditorUtil.setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected abstract EObject createInitialModel();

	/**
	 * Store model element in the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void attachModelToResource(EObject model, Resource resource) {
		resource.getContents().add(model);
	}

}