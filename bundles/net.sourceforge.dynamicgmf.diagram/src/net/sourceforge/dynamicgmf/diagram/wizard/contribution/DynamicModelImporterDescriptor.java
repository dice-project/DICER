package net.sourceforge.dynamicgmf.diagram.wizard.contribution;

import java.util.List;

import org.eclipse.emf.converter.ui.contribution.ModelConverterDescriptor;

public interface DynamicModelImporterDescriptor extends
		ModelConverterDescriptor {
	List<String> getExtensions();
	IDynamicModelImporterWizard createWizard();
}
