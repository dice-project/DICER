package net.sourceforge.dynamicgmf.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;

public class XMLActionBarContributor extends DiagramActionBarContributor {

	@Override
	protected Class getEditorClass() {
		return EcoreModelDiagramEditor.XML.class;
	}

	@Override
	protected String getEditorId() {
		return "net.sourceforge.dynamicgmf.diagram.part.XMLReflectiveDiagramEditorID";
	}

}
