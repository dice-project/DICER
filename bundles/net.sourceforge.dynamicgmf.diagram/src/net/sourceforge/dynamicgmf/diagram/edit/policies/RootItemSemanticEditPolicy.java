package net.sourceforge.dynamicgmf.diagram.edit.policies;

import java.util.Collection;

import net.sourceforge.dynamicgmf.diagram.edit.commands.EClassCreateCommand;
import net.sourceforge.dynamicgmf.diagram.providers.EcoreModelElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RootItemSemanticEditPolicy extends
		EcoreModelBaseItemSemanticEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (req.getContainmentFeature() == null) {
			View view = (View) getHost().getModel();
			EObject semanticModel = view.getElement();
			EClass rootClass = semanticModel.eClass();
			
			for (EReference eContainment : rootClass.getEAllContainments()) {
				Collection<IElementType> elementTypes = 
					EcoreModelElementTypes.getElementTypeOfRootEContainment(eContainment);
				if (elementTypes == null) {
					// eContainment has a unique EReferenceType
					// among other root's EContainment features.
					//
					if (eContainment.getEReferenceType().isSuperTypeOf(req.getElementType().getEClass())) {
						req.setContainmentFeature(eContainment);
						break;
					}
				} else {
					if (elementTypes.contains(req.getElementType())) {
						req.setContainmentFeature(eContainment);
						break;
					}
				}
			}
		}
		
		return getGEFWrapper(new EClassCreateCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
