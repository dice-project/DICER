package net.sourceforge.dynamicgmf.diagram.wizard;



import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.adapters.XSDModelInfoAdapter;
import net.sourceforge.dynamicgmf.diagram.adapters.XSDModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelImporter;
import net.sourceforge.dynamicgmf.diagram.importer.DynamicXSDImporter;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.wizard.IWizardPage;

public class XSDModelCreationImporterWizard extends ModelCreationImporterWizard {

	@Override
	protected IWizardPage createImporterDetailPage() {
		EcoreModelImporterDetailPage result = new EcoreModelImporterDetailPage(getModelImporter(), "XSDModel");
		result.setTitle(Messages.EcoreModelDiagramXSDDetailPage_title);
		result.setDescription(Messages.EcoreModelDiagramXSDDetailPage_description);
		return result;
	}

	@Override
	protected DynamicModelImporter createModelImporter() {
		return new DynamicXSDImporter();
	}

	@Override
	protected String getDiagramModelFileExtension() {
		return "xml_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelFileExtension() {
		return "xml"; //$NON-NLS-1$
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
	protected EObject createInitialModel() {
		// TODO Support multiple EPackages
		EPackage ePackage = getModelImporter().getEPackages().get(0);
		ePackage.eAdapters().add(new XSDModelInfoAdapter(ePackage));
		return EcoreUtil.create(EcoreModelInfoUtil.getRootClass(ePackage));
	}

	private EObject createDocumentRoot(EObject model) {
		EPackage ePackage = model.eClass().getEPackage();
		EObject documentRoot = EcoreUtil.create((EClass) ePackage.getEClassifier("DocumentRoot"));
		attachModelToDocumentRoot(model, documentRoot);
		configureSchemaLocation(documentRoot, ePackage);
		return documentRoot;
	}

	private void attachModelToDocumentRoot(EObject model, EObject documentRoot) {
		EStructuralFeature rootElementContainingFeature =
			XSDModelInfoUtil.getRootElementContainingFeature(documentRoot.eClass());
		documentRoot.eSet(rootElementContainingFeature, model);
	}
	
	@SuppressWarnings("unchecked")
	private void configureSchemaLocation(EObject documentRoot, EPackage ePackage) {
		EMap<String, String> xSISchemaLocationMap =
			(EMap<String, String>) documentRoot.eGet(XSDModelInfoUtil.getXSISchemaLocationMapFeature(documentRoot.eClass()));
		xSISchemaLocationMap.put(ePackage.getNsURI(), ePackage.eResource().getURI().toString());
	}

	@Override
	protected void attachModelToResource(EObject model, Resource resource) {
		resource.getContents().add(createDocumentRoot(model));
	}
	
}
