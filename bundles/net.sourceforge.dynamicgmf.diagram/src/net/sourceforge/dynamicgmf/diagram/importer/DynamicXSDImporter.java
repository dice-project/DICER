package net.sourceforge.dynamicgmf.diagram.importer;

import java.util.Collection;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.osgi.util.NLS;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xsd.util.XSDResourceImpl;

public class DynamicXSDImporter extends DynamicModelImporter {

	@Override
	protected Diagnostic doComputeEPackages(Monitor monitor) throws Exception {
		BasicDiagnostic basicDiagnostic = null;
		
		List<URI> locationURIs = getModelLocationURIs();
		if (locationURIs.isEmpty()) {
			basicDiagnostic = new BasicDiagnostic(
					Diagnostic.ERROR,
					EcoreModelDiagramEditorPlugin.ID,
					ConverterUtil.ACTION_DIALOG_NONE | ConverterUtil.ACTION_MESSAGE_SET_ERROR,
					Messages.SpecifyAValidXMLSchema_message,
					null);
		} else {
			monitor.beginTask("", 2);
			monitor.subTask(NLS.bind(Messages.Loading_message, new Object[] { locationURIs }));
			
			XSDEcoreBuilder ecoreBuilder = new XSDEcoreBuilder();
			Collection<Resource> resources = ecoreBuilder.generateResources(locationURIs);
			
			for (Resource resource : resources) {
				if (!(resource instanceof XSDResourceImpl)) {
					URI schemaURI = URI.createURI(ecoreBuilder.getSchema().getSchemaLocation());
					resource.setURI(schemaURI);
					EPackage ePackage = (EPackage) resource.getContents().get(0);
					getEPackages().add(ePackage);
				}
			}
		}
		
		if (basicDiagnostic == null) {
			return Diagnostic.OK_INSTANCE;
		} else {
			return basicDiagnostic;
		}
	}

}
