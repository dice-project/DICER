package net.sourceforge.dynamicgmf.diagram.navigator;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EClassNameEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EContainmentEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EReferenceEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry;
import net.sourceforge.dynamicgmf.diagram.providers.EcoreModelElementTypes;
import net.sourceforge.dynamicgmf.diagram.providers.EcoreModelParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class EcoreModelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EcoreModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EcoreModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EcoreModelNavigatorItem
				&& !isOwnView(((EcoreModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EcoreModelNavigatorGroup) {
			EcoreModelNavigatorGroup group = (EcoreModelNavigatorGroup) element;
			return EcoreModelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EcoreModelNavigatorItem) {
			EcoreModelNavigatorItem navigatorItem = (EcoreModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated NOT
	 */
	public Image getImage(View view) {
		switch (EcoreModelVisualIDRegistry.getVisualID(view)) {
		case RootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://sourceforge.net/dynamicgmf/xml?DocumentRoot", //$NON-NLS-1$
					EcoreModelElementTypes.getElementType(
							view.getElement().eClass()));
		case EClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sourceforge.net/dynamicgmf/xml?EClass", //$NON-NLS-1$
					EcoreModelElementTypes.getElementType(
							view.getElement().eClass()));
		case EContainmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sourceforge.net/dynamicgmf/xml?EContainment", //$NON-NLS-1$
					EcoreModelElementTypes.getElementType(
							EcoreModelInfoUtil.getAllEReferences(view.getDiagram().getElement().eClass().getEPackage()).iterator().next()));
		case EReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sourceforge.net/dynamicgmf/xml?EReference", //$NON-NLS-1$
					EcoreModelElementTypes.getElementType(
							EcoreModelInfoUtil.getAllEReferences(view.getDiagram().getElement().eClass().getEPackage()).iterator().next()));
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EcoreModelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EcoreModelElementTypes.isKnownElementType(elementType)) {
			image = EcoreModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EcoreModelNavigatorGroup) {
			EcoreModelNavigatorGroup group = (EcoreModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EcoreModelNavigatorItem) {
			EcoreModelNavigatorItem navigatorItem = (EcoreModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated NOT
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EcoreModelVisualIDRegistry.getVisualID(view)) {
		case RootEditPart.VISUAL_ID:
			return getRoot_Text(view);
		case EClassEditPart.VISUAL_ID:
			return getEClass_Text(view);
		case EContainmentEditPart.VISUAL_ID:
			return getEContainment_Text(view);
		case EReferenceEditPart.VISUAL_ID:
			return getEReference_Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated NOT
	 */
	private String getRoot_Text(View view) {
		return ""; //$NON-NLS-1$
	}

	private String getEClass_Text(View view) {
		IAdaptable hintAdapter = new EcoreModelParserProvider.HintAdapter(
				EcoreModelElementTypes.getElementType(view.getElement().eClass()),
				(view.getElement() != null ? view.getElement() : view),
				EcoreModelVisualIDRegistry
						.getType(EClassNameEditPart.VISUAL_ID));
		IParser parser = ParserService.getInstance().getParser(hintAdapter);

		if (parser != null) {
			return parser.getPrintString(hintAdapter, ParserOptions.NONE
					.intValue());
		} else {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}

	}

	private String getEContainment_Text(View view) {
		return ""; //$NON-NLS-1$
	}

	private String getEReference_Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RootEditPart.MODEL_ID.equals(EcoreModelVisualIDRegistry
				.getModelID(view));
	}

}
