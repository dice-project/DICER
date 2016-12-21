package net.sourceforge.dynamicgmf.diagram.importer;

import java.util.List;

import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class DynamicModelConverter {
	protected List<EPackage> ePackages;
	
	public void dispose() {
		clearEPackagesCollections();
	}
	
	public List<EPackage> getEPackages() {
		if (ePackages == null) {
			ePackages = createEPackagesList();
		}
		return ePackages;
	}
	
	private List<EPackage> createEPackagesList() {
		return new ConverterUtil.EPackageList();
	}

	public void clearEPackagesCollections() {
		if (ePackages != null) {
			ePackages.clear();
			ePackages = null;
		}
	}
	
	public ResourceSet createResourceSet() {
		return ConverterUtil.createResourceSet();
	}
	
}
