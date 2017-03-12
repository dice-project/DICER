package it.polimi.dice.lwdg.launcher;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 * This class draw the preferences panel for DICE-LWDG launcher plugin.
 * @author Giorgio Bartoccioni
 *
 */
public class LWDGgui {

    private Text URL;
    private Text inputFile;
    private Text outputFile;
    private String choseinFilepath;
    private String choseoutFilepath;
    private Button inBrowseButton;
    private Text deployText;

    /**
     * This method effectively draw the panel
     * @param comp
     */
    public void drawDialog(Composite comp) {

        GridLayoutFactory.swtDefaults().numColumns(2).applyTo(comp);
        ///////////////////   ENDPOINT SETTINGS   /////////////////////////

        Label label = new Label(comp, SWT.NONE);
        label.setText("dicer-service host:ip");
        GridDataFactory.swtDefaults().applyTo(label);

        URL = new Text(comp, SWT.BORDER);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(URL);
        
        //Input file chose dialog
        inBrowseButton = new Button(comp, SWT.PUSH);
        inBrowseButton.setText("Select input model file");

        inputFile = new Text(comp, SWT.BORDER);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(inputFile);


        inBrowseButton.addSelectionListener(new SelectionListener() {@
            Override
            public void widgetDefaultSelected(SelectionEvent inEvent) {}@
            Override
            public void widgetSelected(SelectionEvent inEvent) {
                FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
                fileDialog.setText("Choose xmi file");
                fileDialog.setFilterExtensions(new String[] {
                    "*.xmi", ".uml"
                });
                choseinFilepath = fileDialog.open();
                if (choseinFilepath != null) {
                    inputFile.setText(Path.fromOSString(choseinFilepath).makeAbsolute().toOSString());
                }
            }
        });

        //Output file chose dialog      
        Button outBrowseButton = new Button(comp, SWT.PUSH);
        outBrowseButton.setText("Select output model file");

        outputFile = new Text(comp, SWT.BORDER);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(outputFile);

        outBrowseButton.addSelectionListener(new SelectionListener() {@
            Override
            public void widgetDefaultSelected(SelectionEvent outEvent) {}@
            Override
            public void widgetSelected(SelectionEvent outEvent) {
                FileDialog filesaveDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
                filesaveDialog.setText("Choose output file");
                choseoutFilepath = filesaveDialog.open();
                if (choseoutFilepath != null) {
                    outputFile.setText(Path.fromOSString(choseoutFilepath).makeAbsolute().toOSString());
                }
            }
        });

        ///////////////////   CHECK IF SERVER IS ALIVE   ///////////////////////     

        Button checkButton = new Button(comp, SWT.PUSH);
        checkButton.setText("Check server");

        checkButton.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                	
            	try {
            	LWDGHttpclient.checkURL(URL.getText());
            	showDialog("Server is alive", SWT.ICON_INFORMATION);
            	}catch (Exception e){
            		showDialog(e.getMessage(), SWT.ICON_ERROR);
            	}               
            }
        });

        
        new Label(comp, SWT.NONE); //DUMMY
 /*       ///////////////////   FOR DEPLOY-SERVICE   /////////////////////////////

        Button checkBox = new Button(comp, SWT.CHECK);
        checkBox.setText("Send TOSCA to Deploy-service ?");

        new Label(comp, SWT.NONE); //DUMMY

        Label deployLabel = new Label(comp, SWT.NONE);
        deployLabel.setText("deploy-service host:ip");
        GridDataFactory.swtDefaults().applyTo(deployLabel);
        deployLabel.setEnabled(false);
        
        deployText = new Text(comp, SWT.BORDER);
        GridDataFactory.fillDefaults().grab(true, false).applyTo(deployText);
        deployText.setEnabled(false);
        
        checkBox.addSelectionListener(new SelectionAdapter() {

            @
            Override
            public void widgetSelected(SelectionEvent event) {
                Button btn = (Button) event.getSource();
                if (!btn.getSelection()) {
                    deployLabel.setEnabled(false);
                    deployText.setEnabled(false);
                } else {
                    deployLabel.setEnabled(true);
                    deployText.setEnabled(true);
                }
            }
        });
*/        //////////////////////////////////////////////////////////////////////// 



    }
    
    /**
     * Simple helper method to show a MessageBox of the given style with the given message
     * @param message The String to show in MessageBox
     * @param style The dialog style as, for example, SWT.ICON_INFORMATION
     */
    public static void showDialog(String message, int style) {

        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
                MessageBox messageBox = new MessageBox(shell, style);
                messageBox.setMessage(message);
                messageBox.open();
            }
        });
    }
    
    /**
     * Return URL Text element
     * @return
     */
    public Text getDicerURL() {
        return URL;
    }

    /**
     * Return inBrowseButton element
     * @return
     */
    public Button getInButton() {
        return inBrowseButton;
    }

    /**
     * Return inputFile Text element
     * @return
     */
    public Text getInputFile() {
        return inputFile;
    }

    /**
     * Return outputFile Text element
     * @return
     */
    public Text getOutputFile() {
        return outputFile;
    }
  
}