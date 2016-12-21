package net.sourceforge.dynamicgmf.diagram.providers;

import java.util.HashMap;
import java.util.Map;

import net.sourceforge.dynamicgmf.diagram.parsers.MessageFormatParser;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;

/**
 * @generated
 */
public class EcoreModelParserProvider extends AbstractProvider implements
		IParserProvider {

	private Map<EClass, IParser> parserMap = new HashMap<EClass, IParser>();
	
	private EAttribute getLabelFeature(EClass eClass) {
	    EAttribute result = null;
	    for (EAttribute eAttribute : eClass.getEAllAttributes())
	    {
	      if (!eAttribute.isMany() && eAttribute.getEType().getInstanceClass() != FeatureMap.Entry.class)
	      {
	        if ("name".equalsIgnoreCase(eAttribute.getName()))
	        {
	          result = eAttribute;
	          break;
	        }
	        else if (result == null)
	        {
	          result = eAttribute;
	        }
	        else if (eAttribute.getEAttributeType().getInstanceClass() == String.class && 
	                 result.getEAttributeType().getInstanceClass() != String.class)
	        {
	          result = eAttribute;
	        }
	      }
	    }
	    return result;
	}
	
	private IParser createEClassName_Parser(EClass eClass) {
		EAttribute labelFeature = getLabelFeature(eClass);
		if (null == labelFeature) {
			return null;
		}
		
		EAttribute[] features = new EAttribute[] {
				labelFeature,
		};
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("{0} :" + eClass.getName());
		parser.setEditorPattern("{0}");
		parser.setEditPattern("{0}");
		
		parserMap.put(eClass, parser);
		
		return parser;
	}
	
	protected IParser getParser(EObject eObject) {
		EClass eClass = eObject.eClass();
		IParser result = parserMap.get(eClass);
		if (null == result) {
			result = createEClassName_Parser(eClass);
		}
		
		return result;
	}
	
	/**
	 * @generated NOT
	 */
	public IParser getParser(IAdaptable hint) {
		EObject semanticModel = (EObject) hint.getAdapter(EObject.class);
		if (semanticModel != null) {
			return getParser(semanticModel);
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EcoreModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
