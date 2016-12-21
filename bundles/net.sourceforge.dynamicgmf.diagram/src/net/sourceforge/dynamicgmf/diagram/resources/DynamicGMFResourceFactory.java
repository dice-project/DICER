package net.sourceforge.dynamicgmf.diagram.resources;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;

public class DynamicGMFResourceFactory extends GMFResourceFactory {

	static {
		XMLOptions xmlOptions = new XMLOptionsImpl();
		xmlOptions.setProcessSchemaLocations(true);
		xmlOptions.setEcoreBuilder(new DynamicGMFEcoreBuilder(ExtendedMetaData.INSTANCE));
		getDefaultLoadOptions().put(XMLResource.OPTION_XML_OPTIONS, xmlOptions);
		getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
	}
	
	@Override
	public Resource createResource(URI uri) {
		XMIResource result = (XMIResource) super.createResource(uri);
		
		result.getDefaultLoadOptions().putAll(getDefaultLoadOptions());
		
		return result;
	}

}
