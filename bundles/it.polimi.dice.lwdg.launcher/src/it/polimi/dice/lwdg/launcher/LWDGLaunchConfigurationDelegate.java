package it.polimi.dice.lwdg.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.swt.SWT;

/**
 * This is the core class of the DICE-LWDG Launcher. Take preferences setting
 * and execute the POST to dicer-service url
 * 
 * @author Giorgio Bartoccioni
 *
 */

public class LWDGLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

    @Override
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
	    throws CoreException {

	// DICER-SERVICE URL
	String restURL = configuration.getAttribute(LWDGLaunchConfigurationAttributes.SERVICE_URL,
		"http://localhost:8176");
	// INPUT XMI
	String fileToConvert = configuration.getAttribute(LWDGLaunchConfigurationAttributes.FILE_TO_CONVERT,
		"someInfile");
	// OUT TOSCA
	String convertedFile = configuration.getAttribute(LWDGLaunchConfigurationAttributes.CONVERTED_FILE,
		"someOutfile");

	try {
		if (restURL.isEmpty()){
			LWDGgui.showDialog("Launcher: URL is null or Empty", SWT.ICON_ERROR);
		} else if (fileToConvert.isEmpty()){
			LWDGgui.showDialog("Launcher: Input file is null or Empty", SWT.ICON_ERROR);
		} else if (convertedFile.isEmpty()){
			LWDGgui.showDialog("Launcher: Output file is null or Empty", SWT.ICON_ERROR);
		} else {
			LWDGHttpclient.PostXmi(restURL, fileToConvert, convertedFile);
		}
	} catch (Exception e) {
	    LWDGgui.showDialog(e.getMessage(), SWT.ICON_INFORMATION);
	}
    }
}
