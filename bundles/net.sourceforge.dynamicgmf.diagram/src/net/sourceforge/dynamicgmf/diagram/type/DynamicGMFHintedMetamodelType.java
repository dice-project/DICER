package net.sourceforge.dynamicgmf.diagram.type;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.MetamodelType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;

public class DynamicGMFHintedMetamodelType extends MetamodelType implements IHintedType {

	private static final String semanticHint = "1003";
	
	public DynamicGMFHintedMetamodelType(String id, URL iconURL,
			String displayName, EClass class1, IEditHelper editHelper) {
		super(id, iconURL, displayName, class1, editHelper);
	}

	public String getSemanticHint() {
		return semanticHint;
	}

}
