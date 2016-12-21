package net.sourceforge.dynamicgmf.diagram.part;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * @generated
 */
public class EcoreModelDomainModelElementTester extends PropertyTester {

	/**
	 * @generated NOT
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EPackage ePackage = eObject.eClass().getEPackage();
		if (EcoreModelInfoUtil.getAllEClasses(ePackage) != null) {
			return true;
		}
		return false;
	}

}
