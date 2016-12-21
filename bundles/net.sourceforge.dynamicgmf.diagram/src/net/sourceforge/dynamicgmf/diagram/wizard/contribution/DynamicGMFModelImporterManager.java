package net.sourceforge.dynamicgmf.diagram.wizard.contribution;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.converter.ui.contribution.ModelConverterManager;
import org.eclipse.jface.wizard.IWizard;

public class DynamicGMFModelImporterManager extends ModelConverterManager<DynamicModelImporterDescriptor> {

	public final static DynamicGMFModelImporterManager INSTANCE = new DynamicGMFModelImporterManager();

	public static class DynamicModelImporterDescriptorImpl extends ModelConverterDescriptorImpl implements DynamicModelImporterDescriptor {
		protected List<String> extensions;
		
		public IDynamicModelImporterWizard createWizard() {
			Object object = createExecutableExtension("wizard");
			return object instanceof IDynamicModelImporterWizard ? (IDynamicModelImporterWizard)object : null;
		}

		public List<String> getExtensions() {
			if (extensions == null) {
				extensions = new ArrayList<String>();
			}
			return extensions;
		}
	}

	public static class DynamicModelImporterDescriptorWizardNode extends ModelConverterDescriptorWizardNode {
		public DynamicModelImporterDescriptorWizardNode(
				DynamicModelImporterDescriptor descriptor) {
			super(descriptor);
		}

		@Override
		protected IWizard createWizard() {
			return ((DynamicModelImporterDescriptor)descriptor).createWizard();
		}
	}

	@Override
	protected String getPluginId() {
		return EcoreModelDiagramEditorPlugin.ID;
	}
	
	@Override
	protected String getExtensionPointId() {
		return "modelImporterDescriptors";
	}
	
	@Override
	protected String getElementName() {
		return "modelImporterDescriptor";
	}

	@Override
	protected ModelConverterDescriptorImpl createModelConverterDescriptorImpl() {
		return new DynamicModelImporterDescriptorImpl();
	}

	@Override
	protected ModelConverterDescriptorWizardNode createModelConverterDescriptorWizardNode(
			DynamicModelImporterDescriptor descriptor) {
		return new DynamicModelImporterDescriptorWizardNode(descriptor);
	}

	public DynamicModelImporterDescriptor getModelImporterDescriptor(String id) {
		return getModelConverterDescriptor(id);
	}
	
	@Override
	protected DynamicModelImporterDescriptor createFromContribution(
			IConfigurationElement configurationElement) {
		DynamicModelImporterDescriptorImpl descriptorImpl = (DynamicModelImporterDescriptorImpl)super.createFromContribution(configurationElement);
		if (descriptorImpl != null) {
			String extensions = configurationElement.getAttribute("extensions");
			if (extensions != null) {
				String[] exts = extensions.split(",");
				for (int i = 0; i < exts.length; i++) {
					String ext = exts[i].trim();
					if (ext.length() > 0) {
						descriptorImpl.getExtensions().add(ext);
					}
				}
			}
		}
		return descriptorImpl;
	}

	public List<DynamicModelImporterDescriptor> filterModelImporterDescriptors(String extension) {
		List<DynamicModelImporterDescriptor> result = new ArrayList<DynamicModelImporterDescriptor>();
		for (DynamicModelImporterDescriptor descriptor : getModelConverterDescriptors()) {
			if (descriptor.getExtensions().contains(extension)) {
				result.add(descriptor);
			}
		}
		return result;
	}
}
