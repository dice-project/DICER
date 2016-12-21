package net.sourceforge.dynamicgmf.diagram.wizard.contribution;

import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelImporter;

import org.eclipse.jface.wizard.IWizardPage;

public interface IDynamicModelImporterPage extends IWizardPage {
	DynamicModelImporter getModelImporter();
}
