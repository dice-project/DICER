package net.sourceforge.dynamicgmf.diagram.part;

import net.sourceforge.dynamicgmf.diagram.wizard.AbstractModelCreationWizard;
import net.sourceforge.dynamicgmf.diagram.wizard.DynamicModelCreationWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

public class CreateDynamicInstanceAction extends ActionDelegate implements IActionDelegate {

	protected static final URI PLATFORM_RESOURCE = URI.createPlatformResourceURI("/", false);

	protected EClass eClass;

	@Override
	public void run(IAction action) {
		URI uri = eClass.eResource().getURI();
		IStructuredSelection selection = StructuredSelection.EMPTY;
		if (uri != null && uri.isHierarchical()) {
	      if (uri.isRelative() || (uri = uri.deresolve(PLATFORM_RESOURCE)).isRelative()) {
	        IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toString()));
	        if (file.exists()) {
	          selection = new StructuredSelection(file);
	        }
	      }
	    }
		
		AbstractModelCreationWizard wizard = new DynamicModelCreationWizard(eClass);
		wizard.init(PlatformUI.getWorkbench(), selection);
	    WizardDialog wizardDialog = 
	        new WizardDialog(
	        		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),  
	        		wizard);

	    wizardDialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object object = ((IStructuredSelection)selection).getFirstElement();
			if (object instanceof EClass) {
				eClass = (EClass)object;

				action.setEnabled(!eClass.isAbstract());
				return;
			}
		}
		eClass = null;
		action.setEnabled(false);
	}

}
