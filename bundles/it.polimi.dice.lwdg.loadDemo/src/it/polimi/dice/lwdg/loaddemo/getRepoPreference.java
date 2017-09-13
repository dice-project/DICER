package it.polimi.dice.lwdg.loaddemo;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
/**
 * This class draw the preferences panel for DICE-LWDG LoadDemo plugin.
 * @author Giorgio Bartoccioni
 *
 */
public class getRepoPreference extends Dialog {
    private Text modelsField;
    private Text metamodelsField;
    private String modelsString;
    private String metamodelsString;

    public getRepoPreference(Shell parentShell) {
        super(parentShell);
    }

    @
    Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Please insert URL");
    }
    
    /**
     * Disable "cancel" button
     */
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, "OK", true);
    }
    
    /**
     * Disable the X button to close the dialog 
     */
    protected boolean canHandleShellCloseEvent() {
	    return false;
	}
    @
    Override
    protected Control createDialogArea(Composite parent) {
        Composite comp = (Composite) super.createDialogArea(parent);

        GridLayout layout = (GridLayout) comp.getLayout();
        layout.numColumns = 2;


        Label modelsLabel = new Label(comp, SWT.RIGHT);
        modelsLabel.setText("URL for models: ");
        modelsField = new Text(comp, SWT.SINGLE | SWT.BORDER);
        modelsField.setText("https://github.com/dice-project/DICER/releases/download/v0.2.1/models.zip");

        Label metamodelsLabel = new Label(comp, SWT.RIGHT);
        metamodelsLabel.setText("URL for metamodels: ");
        metamodelsField = new Text(comp, SWT.SINGLE | SWT.BORDER);
        metamodelsField.setText("https://github.com/dice-project/DICER/releases/download/v0.2.1/metamodels.zip");


        GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
        modelsField.setLayoutData(data);
        metamodelsField.setLayoutData(data);

        return comp;
    }

    @
    Override
    protected void okPressed() {
        modelsString = modelsField.getText();
        metamodelsString = metamodelsField.getText();
        super.okPressed();
    }

    public String getModels() {
        return modelsString;
    }
    public String getMetamodels() {
        return metamodelsString;
    }
}