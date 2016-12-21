package it.polimi.dice.lwdg.launcher;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

/**
 * This is the main configuration tab for the DICE-LWDG Launcher.
 * @author Giorgio Bartoccioni
 *
 */
public class LWDGMainLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    private Text URL;
    private Text inputFile;
    private Text outputFile;  
    
    @
    Override
    /**
     * This method create the config tab
     */
    public void createControl(Composite parent) {

        Composite comp = new Group(parent, SWT.BORDER);
        setControl(comp);

        LWDGgui PD = new LWDGgui();
        PD.drawDialog(comp);

        ModifyListener PDlistener = new ModifyListener() {
            /** {@inheritDoc} */
            public void modifyText(ModifyEvent e) {        
            	updateLaunchConfigurationDialog();
            }
        };
        
        URL = PD.getDicerURL();

        inputFile = PD.getInputFile();

        outputFile = PD.getOutputFile();

        inputFile.setEditable(false);
        
        outputFile.setEditable(false);

        URL.addModifyListener(PDlistener);

        inputFile.addModifyListener(PDlistener);

        outputFile.addModifyListener(PDlistener);

    }

    /**
     * This set the name of the config tab
     */
    @
    Override
    public String getName() {

        return "DICER-SERVICE launch tab";
    }

    /**
     * This initialize the configuration tab parameter to some value
     */
    @
    Override
    public void initializeFrom(ILaunchConfiguration configuration) {

        try {
            URL.setText(configuration.getAttribute(LWDGLaunchConfigurationAttributes.SERVICE_URL, "http://localhost:8176"));
            inputFile.setText(configuration.getAttribute(LWDGLaunchConfigurationAttributes.FILE_TO_CONVERT, ""));
            outputFile.setText(configuration.getAttribute(LWDGLaunchConfigurationAttributes.CONVERTED_FILE, ""));
        } catch (CoreException e) {
            e.printStackTrace();

        }
    }

    /**
     * @This apply given value to the launch config
     * {@inheritDoc}
     * 
     */
    @
    Override
    public void performApply(ILaunchConfigurationWorkingCopy configuration) {

        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.SERVICE_URL, URL.getText());
        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.FILE_TO_CONVERT, inputFile.getText());
        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.CONVERTED_FILE, outputFile.getText());
    }

    /**
     * This apply some default value to the launch config
     */
    @
    Override
    public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.SERVICE_URL, "http://localhost:8176");
        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.FILE_TO_CONVERT, "");
        configuration.setAttribute(
            LWDGLaunchConfigurationAttributes.CONVERTED_FILE, "");

    }

}
