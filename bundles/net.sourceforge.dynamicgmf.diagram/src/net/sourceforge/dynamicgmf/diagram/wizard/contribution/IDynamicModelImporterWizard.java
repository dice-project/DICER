package net.sourceforge.dynamicgmf.diagram.wizard.contribution;

import java.util.List;

import org.eclipse.ui.INewWizard;

public interface IDynamicModelImporterWizard extends INewWizard {
	List<String> getFileExtensions();
}
