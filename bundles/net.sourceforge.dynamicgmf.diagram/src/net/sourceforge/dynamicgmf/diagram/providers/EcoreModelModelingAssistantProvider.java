package net.sourceforge.dynamicgmf.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.adapters.IEcoreModelInfo;
import net.sourceforge.dynamicgmf.diagram.edit.parts.RootEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class EcoreModelModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated NOT
	 */
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RootEditPart) {
			View view = (View) editPart.getModel();
			IEcoreModelInfo ecoreModelInfo =
				EcoreModelInfoUtil.getEcoreModelInfo(view.getElement().eClass().getEPackage());
			EClass rootClass = ecoreModelInfo.getRootClass();
			List<IElementType> types = new ArrayList<IElementType>(
					ecoreModelInfo.getAllEClasses().size());
			for (EClass eClass : ecoreModelInfo.getAllEClasses()) {
				if (!eClass.isAbstract() && PackageUtil.canContain(rootClass, eClass, true)) {
					types.add(EcoreModelElementTypes.getElementType(eClass));
				}
			}
			return types;
		}
		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		View view = (View) sourceEditPart.getModel();
		EObject semanticModel = view.getElement();
		EClass eClass = semanticModel.eClass();

		int size = eClass.getEAllReferences().size();
		if (size > 0) {
			List<IElementType> types = new ArrayList<IElementType>(size);
			for (EReference eReference : eClass.getEAllReferences()) {
				types.add(EcoreModelElementTypes.getElementType(eReference));
			}
			return types;
		}

		return Collections.emptyList();
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		View view = (View) targetEditPart.getModel();
		EObject semanticModel = view.getElement();
		EClass eClass = semanticModel.eClass();

		List<IElementType> types = new ArrayList<IElementType>();
		for (EReference eReference : EcoreModelInfoUtil.getAllEReferences(eClass.getEPackage())) {
			if (eReference.getEReferenceType().isSuperTypeOf(eClass)) {
				types.add(EcoreModelElementTypes.getElementType(eReference));
			}
		}

		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);

		// Identify source model
		//
		View sourceViewModel = (View) sourceEditPart.getModel();
		EObject sourceSemanticModel = sourceViewModel.getElement();
		EClass sourceEClass = sourceSemanticModel.eClass();
		// Identify target model
		//
		View targetViewModel = (View) targetEditPart.getModel();
		EObject targetSemanticModel = targetViewModel.getElement();
		EClass targetEClass = targetSemanticModel.eClass();

		List<IElementType> types = new ArrayList<IElementType>();
		for (EReference eReference : sourceEClass.getEAllReferences()) {
			if (eReference.getEReferenceType().isSuperTypeOf(targetEClass)) {
				types.add(EcoreModelElementTypes.getElementType(eReference));
			}
		}

		return types;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		View viewModel = (View) targetEditPart.getModel();
		EObject semanticModel = viewModel.getElement();
		EClass eClass = semanticModel.eClass();

		List<IElementType> result = new ArrayList<IElementType>();
		for (EReference eReference : EcoreModelInfoUtil.getAllEReferences(eClass.getEPackage())) {
			if (relationshipType == EcoreModelElementTypes.getElementType(eReference)) {
				EClass eContainingClass = eReference.getEContainingClass();
				for (EClass eKlass : EcoreModelInfoUtil.getAllEClasses(eClass.getEPackage())) {
					if (!eKlass.isAbstract() && eContainingClass.isSuperTypeOf(eKlass)) {
						Collection<IElementType> elementTypes =
							EcoreModelElementTypes.getElementTypesOfRootEContainments(eKlass);
						if (elementTypes == null) {
							// eContainment has a unique EReferenceType
							// among other root's EContainment features,
							// or simply eKlass's object is not contained by root.
							//
							result.add(EcoreModelElementTypes.getElementType(eKlass));
						} else {
							result.addAll(elementTypes);
						}
					}
				}
			}
		}
		
		return result;
	}

	/**
	 * @generated NOT
	 */
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		View viewModel = (View) sourceEditPart.getModel();
		EObject semanticModel = viewModel.getElement();
		EClass eClass = semanticModel.eClass();

		List<IElementType> result = new ArrayList<IElementType>();
		for (EReference eReference : eClass.getEAllReferences()) {
			if (relationshipType == EcoreModelElementTypes
					.getElementType(eReference)) {
				EClass eReferenceType = eReference.getEReferenceType();
				for (EClass eKlass : EcoreModelInfoUtil.getAllEClasses(eClass.getEPackage())) {
					if (!eKlass.isAbstract() && eReferenceType.isSuperTypeOf(eKlass)) {
						Collection<IElementType> elementTypes =
							EcoreModelElementTypes.getElementTypesOfRootEContainments(eKlass);
						if (elementTypes == null) {
							// eContainment has a unique EReferenceType
							// among other root's EContainment features,
							// or simply eKlass's object is not contained by root.
							//
							result.add(EcoreModelElementTypes.getElementType(eKlass));
						} else {
							result.addAll(elementTypes);
						}
					}
				}
			}
		}

		return result;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated NOT
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection<IElementType> types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated NOT
	 */
	protected boolean isApplicableElement(EObject element, Collection<IElementType> types) {
		for (IElementType elementType : types) {
			if (elementType.getEClass() == element.eClass()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EcoreModelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.EcoreModelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.EcoreModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
