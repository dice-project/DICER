package net.sourceforge.dynamicgmf.diagram.providers;

import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassNameEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EContainmentEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EReferenceEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry;
import net.sourceforge.dynamicgmf.diagram.view.factories.EClassNameViewFactory;
import net.sourceforge.dynamicgmf.diagram.view.factories.EClassViewFactory;
import net.sourceforge.dynamicgmf.diagram.view.factories.EContainmentViewFactory;
import net.sourceforge.dynamicgmf.diagram.view.factories.EReferenceViewFactory;
import net.sourceforge.dynamicgmf.diagram.view.factories.RootViewFactory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EcoreModelViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (RootEditPart.MODEL_ID.equals(diagramKind)
				&& EcoreModelVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return RootViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = EcoreModelVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = EcoreModelVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!EcoreModelElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != EcoreModelVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!RootEditPart.MODEL_ID.equals(EcoreModelVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case EClassEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != EcoreModelVisualIDRegistry.getNodeVisualID(
									containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case EClassNameEditPart.VISUAL_ID:
					if (EClassEditPart.VISUAL_ID != EcoreModelVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated NOT
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !EcoreModelVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case EClassEditPart.VISUAL_ID:
			return EClassViewFactory.class;
		case EClassNameEditPart.VISUAL_ID:
			return EClassNameViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!EcoreModelElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = EcoreModelVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != EcoreModelVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated NOT
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case EContainmentEditPart.VISUAL_ID:
			return EContainmentViewFactory.class;
		case EReferenceEditPart.VISUAL_ID:
			return EReferenceViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
