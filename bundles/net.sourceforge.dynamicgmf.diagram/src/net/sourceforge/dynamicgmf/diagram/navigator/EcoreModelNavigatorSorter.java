package net.sourceforge.dynamicgmf.diagram.navigator;

import net.sourceforge.dynamicgmf.diagram.part.EcoreModelVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class EcoreModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 3006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EcoreModelNavigatorItem) {
			EcoreModelNavigatorItem item = (EcoreModelNavigatorItem) element;
			return EcoreModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
