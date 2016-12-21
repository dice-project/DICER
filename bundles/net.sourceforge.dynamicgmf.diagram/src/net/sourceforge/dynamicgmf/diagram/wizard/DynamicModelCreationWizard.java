package net.sourceforge.dynamicgmf.diagram.wizard;

import java.util.Map;

import net.sourceforge.dynamicgmf.diagram.adapters.EcoreModelInfoAdapter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class DynamicModelCreationWizard extends AbstractModelCreationWizard {

	protected EClass eClass;
	
	public DynamicModelCreationWizard(EClass eClass) {
		this.eClass = eClass;
	}
	
	@Override
	protected String getDiagramModelFileExtension() {
		return "xmi_diagram"; //$NON-NLS-1$
	}

	@Override
	protected String getModelFileExtension() {
		return "xmi"; //$NON-NLS-1$
	}

	@Override
	protected Map<Object, Object> getModelResourceSaveOptions() {
		Map<Object, Object> result = super.getModelResourceSaveOptions();
		result.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		result.put(XMLResource.OPTION_LINE_WIDTH, 80);
		return result;
	}

	@Override
	protected EObject createInitialModel() {
		EPackage ePackage = eClass.getEPackage();
		EcoreModelInfoAdapter ecoreModelInfo = new EcoreModelInfoAdapter(ePackage);
		ecoreModelInfo.setRootClass(eClass);
		ePackage.eAdapters().add(ecoreModelInfo);
		return EcoreUtil.create(eClass);
	}

}
