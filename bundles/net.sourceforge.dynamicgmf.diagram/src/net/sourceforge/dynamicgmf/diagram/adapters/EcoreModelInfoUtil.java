package net.sourceforge.dynamicgmf.diagram.adapters;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;


public class EcoreModelInfoUtil {
	public static IEcoreModelInfo getEcoreModelInfo(EPackage ePackage) {
		return (IEcoreModelInfo) EcoreUtil.getAdapter(ePackage.eAdapters(), IEcoreModelInfo.class);
	}
	
	public static EClass getRootClass(EPackage ePackage) {
		return getEcoreModelInfo(ePackage).getRootClass();
	}
	
	public static Collection<EClass> getAllEClasses(EPackage ePackage) {
		return getEcoreModelInfo(ePackage).getAllEClasses();
	}

	public static Collection<EReference> getAllEReferences(EPackage ePackage) {
		return getEcoreModelInfo(ePackage).getAllEReferences();
	}
	
}
