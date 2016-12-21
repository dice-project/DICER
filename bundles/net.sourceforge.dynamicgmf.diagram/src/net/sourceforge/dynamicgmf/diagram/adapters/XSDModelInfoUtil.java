package net.sourceforge.dynamicgmf.diagram.adapters;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xsd.util.XSDResourceImpl;

public class XSDModelInfoUtil {

	public static EStructuralFeature getRootElementContainingFeature(EClass documentRootClass) {
		for (EReference eReference : documentRootClass.getEAllReferences()) {
			if (!"xSISchemaLocation".equals(eReference.getName())
					&& !"xMLNSPrefixMap".equals(eReference.getName())) {
				return eReference;
			}
		}
		return null;
	}

	public static EStructuralFeature getXSISchemaLocationMapFeature(EClass documentRootClass) {
		List<EReference> eAllReferences = documentRootClass.getEAllReferences();
		for (EReference eReference : eAllReferences) {
			if ("xSISchemaLocation".equals(eReference.getName())) {
				return eReference;
			}
		}
		return null;
	}
	
	public static void configureSchemaLocation(EPackage ePackage) {
		Resource packageResource = ePackage.eResource();
		ResourceSet resourceSet = packageResource.getResourceSet();
		
		for (Resource resource : resourceSet.getResources()) {
			if (resource instanceof XSDResourceImpl) {
				packageResource.setURI(resource.getURI());
				return;
			}
		}
	}
	
}
