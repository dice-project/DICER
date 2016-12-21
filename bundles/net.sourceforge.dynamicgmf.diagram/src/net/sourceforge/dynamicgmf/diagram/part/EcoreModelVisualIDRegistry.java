package net.sourceforge.dynamicgmf.diagram.part;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassNameEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EcoreModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = EcoreModelDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RootEditPart.MODEL_ID.equals(view.getType())) {
				return RootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				EcoreModelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated NOT
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EPackage ePackage = domainElement.eClass().getEPackage();
		if (EcoreModelInfoUtil.getRootClass(ePackage).isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram(domainElement)) {
			return RootEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated NOT
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null
				|| !RootEditPart.MODEL_ID
						.equals(net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry
								.getModelID(containerView))) {
			return -1;
		}
		switch (net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry
				.getVisualID(containerView)) {
		case RootEditPart.VISUAL_ID:
			if (EcoreModelInfoUtil.getAllEClasses(domainElement.eClass().getEPackage()) != null) {
				return EClassEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated NOT
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry
				.getModelID(containerView);
		if (!RootEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EClassEditPart.VISUAL_ID:
			if (EClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RootEditPart.VISUAL_ID:
			if (EClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated NOT
	 */
	private static boolean isDiagram(EObject element) {
		return true;
	}

}
