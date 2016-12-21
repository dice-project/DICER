package net.sourceforge.dynamicgmf.diagram.importer;

import java.util.List;

import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.Messages;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;

public class DynamicEcoreImporter extends DynamicModelImporter {

	@Override
	protected Diagnostic doComputeEPackages(Monitor monitor) throws Exception {
	    Diagnostic diagnostic = Diagnostic.OK_INSTANCE;

	    List<URI> locationURIs = getModelLocationURIs();
	    if (locationURIs.isEmpty()) {
	    	diagnostic = new BasicDiagnostic(
	    			Diagnostic.ERROR,
	    			EcoreModelDiagramEditorPlugin.ID,
	    			ConverterUtil.ACTION_DIALOG_NONE | ConverterUtil.ACTION_MESSAGE_SET_ERROR,
	    			Messages.SpecifyAValidCoreModel_message,
	    			null);
	    } else {
			monitor.beginTask("", 2);
			monitor.subTask(NLS.bind(Messages.Loading_message, new Object[] { locationURIs }));
			
			ResourceSet ecoreResourceSet = createResourceSet();
			for (URI ecoreModelLocation : locationURIs) {
				ecoreResourceSet.getResource(ecoreModelLocation, true);
			}
			EcoreUtil.resolveAll(ecoreResourceSet);
			
			for (Resource resource : ecoreResourceSet.getResources()) {
				getEPackages().addAll(EcoreUtil.<EPackage>getObjectsByType(resource.getContents(), EcorePackage.Literals.EPACKAGE));
			}
			
			BasicDiagnostic diagnosticChain =
				new BasicDiagnostic(
						EcoreModelDiagramEditorPlugin.ID,
						ConverterUtil.ACTION_MESSAGE_NONE,
						Messages.ErrorsWereDetectedEcore_message,
						null);
			for (EPackage ePackage : getEPackages()) {
				Diagnostician.INSTANCE.validate(ePackage, diagnosticChain);
			}
			if (diagnosticChain.getSeverity() != Diagnostic.OK) {
				diagnostic = diagnosticChain;
			}
	    }
	    return diagnostic;
	}

}
