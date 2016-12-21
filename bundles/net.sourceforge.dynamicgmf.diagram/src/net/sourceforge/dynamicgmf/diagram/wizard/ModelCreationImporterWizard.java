package net.sourceforge.dynamicgmf.diagram.wizard;

import java.util.List;

import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelImporter;
import net.sourceforge.dynamicgmf.diagram.wizard.contribution.IDynamicModelImporterWizard;

import org.eclipse.jface.wizard.IWizardPage;

public abstract class ModelCreationImporterWizard extends
		AbstractModelCreationWizard implements IDynamicModelImporterWizard {

	protected DynamicModelImporter modelImporter;

	@Override
	public void dispose() {
		if (modelImporter != null) {
			modelImporter.dispose();
			modelImporter = null;
		}
		
		super.dispose();
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(createImporterDetailPage());
	}

	protected abstract IWizardPage createImporterDetailPage();
	
	protected abstract DynamicModelImporter createModelImporter();
	
	protected DynamicModelImporter getModelImporter() {
		if (modelImporter == null) {
			modelImporter = createModelImporter();
		}
		return modelImporter;
	}

	public List<String> getFileExtensions() {
		return getModelImporter().getFileExtensions();
	}

}
