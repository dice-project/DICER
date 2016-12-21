package net.sourceforge.dynamicgmf.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.adapters.IEcoreModelInfo;
import net.sourceforge.dynamicgmf.diagram.edit.helpers.EClassEditHelper;
import net.sourceforge.dynamicgmf.diagram.edit.helpers.EReferenceEditHelperAdvice;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EContainmentEditPart;
import net.sourceforge.dynamicgmf.diagram.edit.parts.EReferenceEditPart;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.type.DynamicGMFHintedMetamodelType;
import net.sourceforge.dynamicgmf.diagram.type.DynamicGMFHintedSpecializationType;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.ClientContextManager;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IClientContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IMetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.NullElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated NOT
 */
public class EcoreModelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private EcoreModelElementTypes() {
	}

	/**
	 * @generated NOT
	 */
	private static Map<IElementType, ENamedElement> elements = new IdentityHashMap<IElementType, ENamedElement>();
	private static Map<ENamedElement, IElementType> elementTypes = new IdentityHashMap<ENamedElement, IElementType>();
	
	private static Map<ENamedElement, Collection<IElementType>> rootEContainmentsToElementTypes =
		new IdentityHashMap<ENamedElement, Collection<IElementType>>();
	private static Map<EClass, Collection<IElementType>> eReferenceTypesToElementTypesOfRootEContainments =
		new IdentityHashMap<EClass, Collection<IElementType>>();

	/**
	 * @generated NOT
	 */
	private static ImageRegistry imageRegistry = new ImageRegistry();

	/**
	 * @generated NOT
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();

	public static void register(EPackage ePackage) {
		IEcoreModelInfo ecoreModelInfo = EcoreModelInfoUtil.getEcoreModelInfo(ePackage);
		registerEClassElementTypes(ecoreModelInfo.getAllEClasses());
		registerEReferenceElementTypes(ecoreModelInfo.getAllEReferences());
		registerRootEContainmentElementTypes(ecoreModelInfo.getRootClass());
		
		configureClientContext(ePackage);
	}

	private static void registerEClassElementTypes(Collection<EClass> allEClasses) {
		// Register elementTypes of EClasses as MetamodelType
		//
		for (EClass eClass : allEClasses) {
//			if (!eClass.isAbstract()) {
			if (!elementTypes.containsKey(eClass)) {
				String id = PackageUtil.getID(eClass);
				IElementType elementType = new DynamicGMFHintedMetamodelType(
						id,
						null,
						eClass.getName(),
						eClass,
						new EClassEditHelper());
				ElementTypeRegistry.getInstance().register((IMetamodelType) elementType);
				
				elements.put(elementType, eClass);
				elementTypes.put(eClass, elementType);
				KNOWN_ELEMENT_TYPES.add(elementType);
			}
//			}
		}
	}
	
	private static void registerEReferenceElementTypes(Collection<EReference> allEReferences) {
		// Register elementTypes of EReferences as SpecializationType
		//
		for (EReference eReference : allEReferences) {
			if (!elementTypes.containsKey(eReference)) {
				String id = PackageUtil.getID(eReference);
				IElementType eTypes[] = {NullElementType.getInstance()};
				String hint = eReference.isContainment() ?
						Integer.toString(EContainmentEditPart.VISUAL_ID) :
							Integer.toString(EReferenceEditPart.VISUAL_ID);
				IElementType specializationType = new DynamicGMFHintedSpecializationType(
						id,
						null,
						eReference.getName(),
						eTypes,
						null,
						null,
						new EReferenceEditHelperAdvice(),
						hint
				);
				ElementTypeRegistry.getInstance().register((ISpecializationType) specializationType);
				elements.put(specializationType, eReference);
				elementTypes.put(eReference, specializationType);
				KNOWN_ELEMENT_TYPES.add(specializationType);
			}
		}
	}

	private static void registerRootEContainmentElementTypes(EClass rootClass) {
		// Register elementTypes of EReferenceTypes of Root's EReferences
		// if the EReferences have a common EReferenceType.
		//
		Map<EClass, Collection<EReference>> eReferenceTypesToRootEContainments = 
			getEReferenceTypesToRootEContainments(rootClass);

		for (EClass eReferenceType : eReferenceTypesToRootEContainments.keySet()) {
			if (eReferenceTypesToRootEContainments.get(eReferenceType).size() > 1) {

				for (EReference eContainment : eReferenceTypesToRootEContainments.get(eReferenceType)) {
					String id = PackageUtil.getID(eReferenceType) + "." + eContainment.getName();
					IElementType elementType = new DynamicGMFHintedMetamodelType(
							id,
							null,
							eContainment.getName() + ": " + eReferenceType.getName(),
							eReferenceType,
							new EClassEditHelper());
					ElementTypeRegistry.getInstance().register((IMetamodelType) elementType);
					elements.put(elementType, eReferenceType);
					KNOWN_ELEMENT_TYPES.add(elementType);
					
					Collection<IElementType> types = rootEContainmentsToElementTypes.get(eContainment);
					if (types == null) {
						types = new ArrayList<IElementType>();
						rootEContainmentsToElementTypes.put(eContainment, types);
					}
					types.add(elementType);
					
					types = eReferenceTypesToElementTypesOfRootEContainments.get(eReferenceType);
					if (types == null) {
						types = new ArrayList<IElementType>();
						eReferenceTypesToElementTypesOfRootEContainments.put(eReferenceType, types);
					}
					types.add(elementType);
				}
			}
		}
	}

	private static Map<EClass, Collection<EReference>> getEReferenceTypesToRootEContainments(
			EClass rootClass) {
		Map<EClass, Collection<EReference>> result = 
			new IdentityHashMap<EClass, Collection<EReference>>();
		for (EReference eContainment : rootClass.getEAllContainments()) {
			for (EClass eClass : EcoreModelInfoUtil.getAllEClasses(rootClass.getEPackage())) {
				if (!eClass.isAbstract() && eContainment.getEReferenceType().isSuperTypeOf(eClass)) {
					Collection<EReference> eContainments = result.get(eClass);
					if (eContainments == null) {
						eContainments = new ArrayList<EReference>();
						result.put(eClass, eContainments);
					}
					eContainments.add(eContainment);
				}
			}
		}
		return result;
	}

	private static void configureClientContext(EPackage ePackage) {
		// Configure ClientContext
		//
		IClientContext clientContext = ClientContextManager.getInstance().getClientContext("EcoreModelClientContext");
		for (EClass eClass : EcoreModelInfoUtil.getAllEClasses(ePackage)) {
			String id = PackageUtil.getID(eClass);
			clientContext.bindId(id);
		}
		for (Collection<IElementType> elementTypes : rootEContainmentsToElementTypes.values()) {
			for (IElementType elementType : elementTypes) {
				clientContext.bindId(elementType.getId());
			}
		}
	}

	/**
	 * @generated NOT
	 */
	private static ImageRegistry getImageRegistry() {
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EcoreModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		return elements.get(type);
	}

	/**
	 * Returns IElementType with the meta model.
	 * 
	 * @param element the meta model
	 * @return corresponding IElementType
	 */
	public static IElementType getElementType(ENamedElement element) {
		return elementTypes.get(element);
	}

	/**
	 * Returns IElementTypes of EReferenceType of the root's EContainment feature.
	 * Note that this returns MetamodelTypes instead of SpecilizationType. <p>
	 * 
	 * Returns null if specified EContainment feature has a unique EReferenceType
	 * among other root's EContainment features.
	 * 
	 * @param eContainment root's EReference with containment=true
	 * @return corresponding Collection of IElementTypes
	 */
	public static Collection<IElementType> getElementTypeOfRootEContainment(EReference eContainment) {
		return rootEContainmentsToElementTypes.get(eContainment);
	}
	
	/**
	 * Returns the collection of IElementTypes of the root's EContainment features
	 * whose EReference equals the specified EClass.
	 * 
	 * Returns null if the root has only one EContainment feature whose EReferenceType
	 * equals the specified EClass.
	 * 
	 * @param eReferenceType EClass
	 * @return corresponding Collection of IElementType
	 */
	public static Collection<IElementType> getElementTypesOfRootEContainments(EClass eReferenceType) {
		return eReferenceTypesToElementTypesOfRootEContainments.get(eReferenceType);
	}
	
	/**
	 * @generated NOT
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
