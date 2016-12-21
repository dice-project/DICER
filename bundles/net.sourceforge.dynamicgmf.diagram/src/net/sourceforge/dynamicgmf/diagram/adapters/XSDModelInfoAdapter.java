package net.sourceforge.dynamicgmf.diagram.adapters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class XSDModelInfoAdapter extends EcoreModelInfoAdapter {

	public XSDModelInfoAdapter(EPackage ePackage) {
		super(ePackage);
	}

	@Override
	protected void initialize(EPackage ePackage) {
		super.initialize(ePackage);

		EClass documentRootClass = (EClass) ePackage.getEClassifier("DocumentRoot");
		allEClasses.remove(documentRootClass);
		allEReferences.removeAll(documentRootClass.getEAllReferences());

		EStructuralFeature rootElementContainingFeature =
			XSDModelInfoUtil.getRootElementContainingFeature(documentRootClass);
		setRootClass((EClass) rootElementContainingFeature.getEType());
	}
	
}
