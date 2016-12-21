package net.sourceforge.dynamicgmf.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoUtil;
import net.sourceforge.dynamicgmf.diagram.adapters.IEcoreModelInfo;
import net.sourceforge.dynamicgmf.diagram.providers.EcoreModelElementTypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class EcoreModelPaletteFactory {

	private EPackage ePackage;
	
	public EcoreModelPaletteFactory(DiagramDocumentEditor editor) {
		IDiagramDocumentProvider provider = (IDiagramDocumentProvider) editor.getDocumentProvider();
		IDiagramDocument document = provider.getDiagramDocument(editor.getEditorInput());
		this.ePackage = document.getDiagram().getElement().eClass().getEPackage(); 
	}
	
	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(creatNodesGroup());
		paletteRoot.add(createLinksGroup());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer creatNodesGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.NodesGroup_title);
		IEcoreModelInfo ecoreModelInfo = EcoreModelInfoUtil.getEcoreModelInfo(ePackage);
		EClass rootClass = ecoreModelInfo.getRootClass();
		for (EClass eClass : ecoreModelInfo.getAllEClasses()) {
			if (!eClass.isAbstract() && PackageUtil.canContain(rootClass, eClass, true)) {
				paletteContainer.add(createEClassCreationTool(eClass));
			}
		}
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinksGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.LinksGroup_title);
		// Add ContainmentCreationTool if containments exist in the model
		//
		PaletteEntry entry = createContainmentCreationTool();
		if (null != entry) {
			paletteContainer.add(entry);
		}
		// Add ReferenceCreationTool if references exist in the model
		//
		entry = createReferenceCreationTool();
		if (null != entry) {
			paletteContainer.add(entry);
		}
		return paletteContainer;
	}

	private ToolEntry createEClassCreationTool(EClass eClass) {
		List<IElementType> types = 
			new ArrayList<IElementType>();

		Collection<IElementType> rootEContainmentElementTypes =
			EcoreModelElementTypes.getElementTypesOfRootEContainments(eClass);
		if (rootEContainmentElementTypes != null) {
			types.addAll(rootEContainmentElementTypes);
		} else {
			types.add(EcoreModelElementTypes.getElementType(eClass));
		}
		
		NodeToolEntry entry = new NodeToolEntry(
				eClass.getName(),
				"Create new " + eClass.getName(), types);
		entry.setSmallIcon(EcoreModelElementTypes
				.getImageDescriptor(EcoreModelElementTypes.getElementType(eClass)));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	 * @generated NOT
	 */
	private ToolEntry createContainmentCreationTool() {
		Collection<EReference> allEReferences =
			EcoreModelInfoUtil.getAllEReferences(ePackage);
		List<IElementType> types =
			new ArrayList<IElementType>(allEReferences.size());
		for (EReference eReference : allEReferences) {
			if (eReference.isContainment()) {
				types.add(EcoreModelElementTypes.getElementType(eReference));
			}
		}
		
		if (types.size() == 0) {
			return null;
		}
		
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ContainmentCreationTool_title,
				Messages.ContainmentCreationTool_desc, types);
		entry.setSmallIcon(EcoreModelElementTypes
				.getImageDescriptor(types.get(0))
		);
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	/**
	 * @generated NOT
	 */
	private ToolEntry createReferenceCreationTool() {
		Collection<EReference> allEReferences =
			EcoreModelInfoUtil.getAllEReferences(ePackage);
		List<IElementType> types =
			new ArrayList<IElementType>(allEReferences.size());
		for (EReference eReference : allEReferences) {
			if (!eReference.isContainment()) {
				types.add(EcoreModelElementTypes.getElementType(eReference));
			}
		}
		
		if (types.size() == 0) {
			return null;
		}
		
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ReferenceCreationTool_title,
				Messages.ReferenceCreationTool_desc, types);
		entry.setSmallIcon(EcoreModelElementTypes
				.getImageDescriptor(types.get(0))
		);
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated NOT
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated NOT
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
