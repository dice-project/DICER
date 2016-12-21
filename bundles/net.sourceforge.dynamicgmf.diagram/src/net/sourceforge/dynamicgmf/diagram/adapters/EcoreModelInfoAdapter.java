package net.sourceforge.dynamicgmf.diagram.adapters;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public class EcoreModelInfoAdapter extends AdapterImpl implements IEcoreModelInfo {

	protected EClass rootClass;
	protected Collection<EClass> allEClasses = new ArrayList<EClass>();
	protected Collection<EReference> allEReferences = new ArrayList<EReference>();
	
	public EcoreModelInfoAdapter(EPackage ePackage) {
		initialize(ePackage);
	}

	protected void initialize(EPackage ePackage) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass)eClassifier;
				allEClasses.add(eClass);
				allEReferences.addAll(eClass.getEReferences());
			}
		}
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type == IEcoreModelInfo.class;
	}

	public Collection<EReference> getAllEReferences() {
		return allEReferences;
	}

	public Collection<EClass> getAllEClasses() {
		return allEClasses;
	}

	public EClass getRootClass() {
		return rootClass;
	}

	public void setRootClass(EClass rootClass) {
		this.rootClass = rootClass;
	}
	
}
