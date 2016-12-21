package net.sourceforge.dynamicgmf.diagram.resources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;

public class DynamicGMFXMLResourceFactory extends GenericXMLResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		XMLResource result = (XMLResource) super.createResource(uri);
		
		XMLOptions xmlOptions = (XMLOptions) result.getDefaultLoadOptions().get(XMLResource.OPTION_XML_OPTIONS);
		xmlOptions.setEcoreBuilder(new DynamicGMFEcoreBuilder(ExtendedMetaData.INSTANCE));
		
		return result;
	}

}
