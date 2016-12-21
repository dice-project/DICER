package net.sourceforge.dynamicgmf.diagram.wizard;

import java.util.List;

import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.Messages;
import net.sourceforge.dynamicgmf.diagram.wizard.contribution.DynamicGMFModelImporterManager;
import net.sourceforge.dynamicgmf.diagram.wizard.contribution.DynamicModelImporterDescriptor;
import net.sourceforge.dynamicgmf.diagram.wizard.contribution.IDynamicModelImporterWizard;

import org.eclipse.emf.converter.ui.ModelConverterDescriptorSelectionPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class DynamicGMFModelWizard extends Wizard implements INewWizard {

	public class SelectionPage extends ModelConverterDescriptorSelectionPage {
		public SelectionPage(String pageId, IWorkbench workbench, IStructuredSelection selection) {
			super(pageId, DynamicGMFModelImporterManager.INSTANCE, workbench, selection);
		}

		@Override
		protected Object[] getTableInput() {
			return getModelImporterDescriptors().toArray();
		}

		@Override
		protected String getSelectModelConverterLabel() {
			return Messages.ModelCreationWizard_SelectionPage_label;
		}

		public DynamicModelImporterDescriptor getModelImporterDescriptor() {
			return (DynamicModelImporterDescriptor)getModelConverterDescriptor();
		}
		
		@Override
		protected void adjustModelConverterWizard(IWizard modelConverterWizard) {
			adjustModelImporterWizard((IDynamicModelImporterWizard)modelConverterWizard, getModelImporterDescriptor());
		}
	}
	
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	
	protected ModelConverterDescriptorSelectionPage selectionPage;
	
	
	public IWorkbench getWorkbench() {
		return workbench;
	}
	
	public IStructuredSelection getSelection() {
		return selection;
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.EcoreModelCreationWizardTitle);
		setDefaultPageImageDescriptor(getDefaultImageDescriptor());
		setNeedsProgressMonitor(true);
	}

	protected List<DynamicModelImporterDescriptor> getModelImporterDescriptors() {
		return DynamicGMFModelImporterManager.INSTANCE.getModelConverterDescriptors();
	}
	
	@Override
	public void dispose() {
		workbench = null;
		selection = null;
		
		super.dispose();
	}

	protected ImageDescriptor getDefaultImageDescriptor() {
		return EcoreModelDiagramEditorPlugin
		.getBundledImageDescriptor("icons/wizban/NewEcoreModelWizard.gif"); //$NON-NLS-1$
	}
	
	@Override
	public void addPages() {
		addSelectionPage();
	}

	protected void addSelectionPage() {
		selectionPage = new SelectionPage("ModelImporterDescriptorSelectionPage", workbench, selection);
		selectionPage.setTitle(Messages.ModelCreationWizard_SelectionPage_title);
		selectionPage.setModeConverterWizardDefaultImageDescriptor(getDefaultImageDescriptor());
		addPage(selectionPage);
	}

	protected void adjustModelImporterWizard(IDynamicModelImporterWizard modelImporterWizard, DynamicModelImporterDescriptor modelImporterDescriptor) {
		modelImporterWizard.getFileExtensions().clear();
		modelImporterWizard.getFileExtensions().addAll(modelImporterDescriptor.getExtensions());
	}
	
	@Override
	public boolean canFinish() {
		return false;
	}
	
	@Override
	public boolean performFinish() {
		selectionPage.performFinish();
		return true;
	}


}
