package net.sourceforge.dynamicgmf.diagram.edit.commands;

import net.sourceforge.dynamicgmf.diagram.edit.policies.EcoreModelBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class EReferenceCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	private final EReference eReference;
	
	/**
	 * @generated
	 */
	public EReferenceCreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target, EReference eReference) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		this.eReference = eReference;
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && !eReference.getEContainingClass().isSuperTypeOf(source.eClass())) {
			return false;
		}
		if (target != null && !eReference.getEReferenceType().isSuperTypeOf(target.eClass())) {
			return false;
		}
		if (source == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return EcoreModelBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateReference(source, target, eReference);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (source != null && target != null) {
			if (eReference.isMany()) {
				EList containings = (EList) source.eGet(eReference);
				containings.add(target);
			} else {
				source.eSet(eReference, target);
			}
		}
		return CommandResult.newOKCommandResult();
	}
}
