package it.polimi.dice.lwdg.launcher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
/**
 * This class simply draw the configuration tab for DICE-LWDG Launcher
 * @author Giorgio Bartoccioni
 *
 */
public class LWDGLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup{

	/**
	 * Set of configuration tab groups
	 */
    	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		
		setTabs(new ILaunchConfigurationTab[] {new LWDGMainLaunchConfigurationTab(), new CommonTab() });
	}

}
