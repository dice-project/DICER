/**
 * 
 */
package net.sourceforge.dynamicgmf.diagram.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.util.DefaultEcoreBuilder;

class DynamicGMFEcoreBuilder extends DefaultEcoreBuilder {

	public DynamicGMFEcoreBuilder(ExtendedMetaData extendedMetaData) {
		super(extendedMetaData);
	}

	@Override
	public Collection<? extends Resource> generate(
			Map<String, URI> targetNamespaceToURI) throws Exception {
		List<URI> unknownURIs = new ArrayList<URI>();
		for (String namespace : targetNamespaceToURI.keySet()) {
			if (extendedMetaData.getPackage(namespace) == null) {
				unknownURIs.add(targetNamespaceToURI.get(namespace));
			}
		}
		return super.generate(unknownURIs);
	}
	
}