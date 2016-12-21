package net.sourceforge.dynamicgmf.diagram.edit.commands;

import net.sourceforge.dynamicgmf.diagram.edit.policies.EcoreModelBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EContainmentReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public EContainmentReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientSource() {
		// TODO Weaken the constraint.
		// Return TRUE if newEnd.eClass has an EReference feature 
		//   whose EReferenceType equals oldEnd.eClass.
		// Then, reorientSource() must be fixed accordingly.
		if (referenceOwner.eClass() != newEnd.eClass()) {
			return false;
		}
		return EcoreModelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistReference(newEnd, oldEnd);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (oldEnd.eClass() != newEnd.eClass()) {
			return false;
		}
		return EcoreModelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistReference(oldEnd, newEnd);
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		EStructuralFeature targetFeature = oldEnd.eContainingFeature();
		if (targetFeature.isMany()) {
			EList<EObject> oldReferences = (EList<EObject>) referenceOwner.eGet(targetFeature);
			oldReferences.remove(oldEnd);
			EList<EObject> newReferences = (EList<EObject>) newEnd.eGet(targetFeature);
			newReferences.add(oldEnd);
		} else {
			referenceOwner.eSet(targetFeature, null);
			newEnd.eSet(targetFeature, oldEnd);
		}
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		EStructuralFeature targetFeature = oldEnd.eContainingFeature();
		if (targetFeature.isMany()) {
			EList<EObject> eReferences = (EList<EObject>) referenceOwner.eGet(targetFeature);
			eReferences.remove(oldEnd);
			eReferences.add(newEnd);
		} else {
			referenceOwner.eSet(targetFeature, newEnd);
		}
		return CommandResult.newOKCommandResult(referenceOwner);
	}
}
