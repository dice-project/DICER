package net.sourceforge.dynamicgmf.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EClassCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public EClassCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (getContainmentFeature() == null) {
			if (getEClass() != null) {
				return getEClass().isSuperTypeOf(getEClassToEdit());
			}
			return true;
		} else {
			return super.canExecute();
		}
	}

	/**
	 * @generated NOT
	 */
	protected EReference getContainmentFeature() {
		CreateElementRequest req = (CreateElementRequest) getRequest();
		return req.getContainmentFeature(); 
	}

	/**
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		if (getContainmentFeature() == null) {
			// Uncomment to put "phantom" objects into the diagram file.		
			//Resource resource = ((CreateElementRequest) getRequest()).getContainer().eResource();
			//if (resource == null) {
			//	return null;
			//}
			Resource resource = getElementToEdit().eResource();
			EClass eClass = getElementType().getEClass();
			EObject eObject = eClass.getEPackage().getEFactoryInstance().create(
					eClass);
			resource.getContents().add(eObject);
			return eObject;
		} else {
			return super.doDefaultElementCreation();
		}
	}

	@Override
	protected EClass getEClassToEdit() {
		if (getContainmentFeature() != null) {
			return getContainmentFeature().getEContainingClass();
		}
		return super.getEClassToEdit();
	}

}
