package net.sourceforge.dynamicgmf.diagram.wizard;


import java.util.Map;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoAdapter;
import net.sourceforge.dynamicgmf.diagram.importer.DynamicEcoreImporter;
import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelConverter;
import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelImporter;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.wizard.IWizardPage;

public class EcoreModelCreationImporterWizard extends ModelCreationImporterWizard {

	private ModelElementSelectionPage diagramRootElementSelectionPage;
	
	private static class RootClassSelectionPage extends ModelElementSelectionPage {
		private DynamicModelConverter modelConverter;
		
		protected RootClassSelectionPage(String pageName, DynamicModelConverter modelConverter) {
			super(pageName);
			this.modelConverter = modelConverter;
		}

		@Override
		protected String getSelectionTitle() {
			return Messages.EcoreModelCreationWizard_RootSelectionPageTitle;
		}

		@Override
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(Messages.EcoreModelCreationWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			if (!(selectedModelElement instanceof EClass) || ((EClass) selectedModelElement).isAbstract()) {
				setErrorMessage(Messages.EcoreModelCreationWizard_RootSelectionPageInvalidSelectionMessage);
				return false;
			}
			
			setErrorMessage(null);
			return true;
		}
		
		@Override
		public void setVisible(boolean visible) {
			if (visible) {
				EObject diagramRoot = modelConverter.getEPackages().get(0);
				setModelElement(diagramRoot);
			}
			super.setVisible(visible);
		}
	}
	
	@Override
	protected IWizardPage createImporterDetailPage() {
		EcoreModelImporterDetailPage result = new EcoreModelImporterDetailPage(getModelImporter(), "EcoreModel");
		result.setTitle(Messages.EcoreModelDiagramDetailPage_title);
		result.setDescription(Messages.EcoreModelDiagramDetailPage_description);
		return result;
	}

	@Override
	public void addPages() {
		super.addPages();
		diagramRootElementSelectionPage = createDiagramRootElementSelectionPage();
		addPage(diagramRootElementSelectionPage);
	}

	protected ModelElementSelectionPage createDiagramRootElementSelectionPage() {
		ModelElementSelectionPage result = new RootClassSelectionPage(
				Messages.EcoreModelCreationWizard_RootSelectionPageName,
				modelImporter);
		result.setTitle(Messages.EcoreModelCreationWizard_RootSelectionPageTitle);
		result.setDescription(Messages.EcoreModelCreationWizard_RootSelectionPageDescription);
		return result;
	}

	@Override
	protected DynamicModelImporter createModelImporter() {
		return new DynamicEcoreImporter();
	}

	@Override
	protected String getDiagramModelFileExtension() {
		return "xmi_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelFileExtension() {
		return "xmi"; //$NON-NLS-1$
	}
	
	@Override
	protected EObject createInitialModel() {
		assert diagramRootElementSelectionPage.getModelElement() instanceof EClass;
		
		EClass rootClass =
			(EClass) diagramRootElementSelectionPage.getModelElement();
		EPackage ePackage = rootClass.getEPackage();
		EcoreModelInfoAdapter ecoreModelInfo = new EcoreModelInfoAdapter(ePackage);
		ecoreModelInfo.setRootClass(rootClass);
		ePackage.eAdapters().add(ecoreModelInfo);
		return EcoreUtil.create(rootClass);
	}

	@Override
	protected Map<Object, Object> getModelResourceSaveOptions() {
		Map<Object, Object> result = super.getModelResourceSaveOptions();
		result.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		result.put(XMLResource.OPTION_LINE_WIDTH, 80);
		return result;
	}

}
