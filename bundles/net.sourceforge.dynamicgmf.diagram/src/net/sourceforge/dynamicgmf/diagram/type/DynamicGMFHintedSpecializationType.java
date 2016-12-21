package net.sourceforge.dynamicgmf.diagram.type;

import java.net.URL;

import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.SpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelperAdvice;

public class DynamicGMFHintedSpecializationType extends SpecializationType implements IHintedType {

	private final String semanticHint;
	
	public DynamicGMFHintedSpecializationType(String id, URL iconURL,
			String displayName, IElementType[] elementTypes,
			IElementMatcher matcher, IContainerDescriptor descriptor,
			IEditHelperAdvice editHelperAdvice, String hint) {
		super(id, iconURL, displayName, elementTypes, matcher, descriptor,
				editHelperAdvice);
		this.semanticHint = hint;
	}

	public String getSemanticHint() {
		return semanticHint;
	}

}
