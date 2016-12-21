package net.sourceforge.dynamicgmf.diagram.wizard;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoAdapter;
import net.sourceforge.dynamicgmf.diagram.adapters.XSDModelInfoAdapter;
import net.sourceforge.dynamicgmf.diagram.adapters.XSDModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorUtil;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class EcoreModelNewDiagramFileWizard extends Wizard {

	public static class XML extends EcoreModelNewDiagramFileWizard {

		private EObject documentRoot;
		
		public XML(URI domainModelURI, EObject diagramRoot,
				TransactionalEditingDomain editingDomain,
				String diagramModelFileExtension) {
			super(domainModelURI, diagramRoot, editingDomain, diagramModelFileExtension);
			documentRoot = diagramRoot;
		}

		@Override
		public void addPages() {
			addPage(myFileCreationPage);
		}

		@Override
		protected EObject getRootElement() {
			EPackage ePackage = documentRoot.eClass().getEPackage();

			XSDModelInfoUtil.configureSchemaLocation(ePackage);

			ePackage.eAdapters().add(new XSDModelInfoAdapter(ePackage));

			EStructuralFeature rootElementContainingFeature =
				XSDModelInfoUtil.getRootElementContainingFeature(documentRoot.eClass());
			EObject rootElement = (EObject) documentRoot.eGet(rootElementContainingFeature);
			return rootElement;
		}
		
	}
	
	/**
	 * @generated NOT
	 */
	protected WizardNewFileCreationPage myFileCreationPage;

	/**
	 * @generated NOT
	 */
	protected ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	 * @generated
	 */
	private TransactionalEditingDomain myEditingDomain;

	/**
	 * @generated NOT
	 */
	public EcoreModelNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain, String diagramModelFileExtension) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				Messages.EcoreModelNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle(Messages.EcoreModelNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(
				Messages.EcoreModelNewDiagramFileWizard_CreationPageDescription,
				RootEditPart.MODEL_ID));
		IPath filePath;
		String fileName = domainModelURI.trimFileExtension().lastSegment();
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1)
					.toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException(
					"Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(EcoreModelDiagramEditorUtil.getUniqueFileName(
				filePath, fileName, diagramModelFileExtension));

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				Messages.EcoreModelNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage
				.setTitle(Messages.EcoreModelNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage
				.setDescription(Messages.EcoreModelNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	 * @generated
	 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	protected EObject getRootElement() {
		EObject result = diagramRootElementSelectionPage.getModelElement();
		
		EClass rootClass = result.eClass();
		EPackage ePackage = rootClass.getEPackage();
		EcoreModelInfoAdapter ecoreModelInfo = new EcoreModelInfoAdapter(ePackage);
		ecoreModelInfo.setRootClass(rootClass);
		ePackage.eAdapters().add(ecoreModelInfo);
		return result;
	}
	
	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		List<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		EcoreModelDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		final URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet
				.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				myEditingDomain,
				Messages.EcoreModelNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				EObject model = getRootElement();
				int diagramVID = EcoreModelVisualIDRegistry
						.getDiagramVisualID(model);
				if (diagramVID != RootEditPart.VISUAL_ID) {
					return CommandResult
							.newErrorCommandResult(Messages.EcoreModelNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(
						model,
						RootEditPart.MODEL_ID,
						EcoreModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
			diagramResource.save(EcoreModelDiagramEditorUtil.getSaveOptions());
			EcoreModelDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	 * @generated
	 */
	private static class DiagramRootElementSelectionPage extends
			ModelElementSelectionPage {

		/**
		 * @generated
		 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		 * @generated
		 */
		protected String getSelectionTitle() {
			return Messages.EcoreModelNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		 * @generated NOT
		 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(Messages.EcoreModelNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			
			setErrorMessage(null);
			return true;
		}
	}
}
