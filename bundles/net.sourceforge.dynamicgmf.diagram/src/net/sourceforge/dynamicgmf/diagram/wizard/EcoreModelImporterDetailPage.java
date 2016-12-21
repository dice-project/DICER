package net.sourceforge.dynamicgmf.diagram.wizard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import net.sourceforge.dynamicgmf.diagram.importer.DynamicModelImporter;
import net.sourceforge.dynamicgmf.diagram.part.EcoreModelDiagramEditorPlugin;
import net.sourceforge.dynamicgmf.diagram.part.Messages;
import net.sourceforge.dynamicgmf.diagram.wizard.contribution.IDynamicModelImporterPage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.converter.util.ConverterUIUtil;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class EcoreModelImporterDetailPage extends WizardPage implements IDynamicModelImporterPage, Listener {

	protected static class PageDiagnosticHandler extends ConverterUIUtil.DiagnosticHandler {
		protected EcoreModelImporterDetailPage modelImporterPage;
		
		public PageDiagnosticHandler(EcoreModelImporterDetailPage modelImporterPage) {
			this.modelImporterPage = modelImporterPage;
		}

		@Override
	    protected boolean doMessages()
	    {
	      return true;
	    }
	    
	    @Override
	    protected void setMessage(String message)
	    {
	      modelImporterPage.setMessage(message);
	    }
	    
	    @Override
	    protected void setMessage(String message, int messageType)
	    {
	      modelImporterPage.setMessage(message, messageType);
	    }
	    
	    @Override
	    protected void setErrorMessage(String message)
	    {
	      modelImporterPage.setErrorMessage(message);
	    }
	}
	
	protected DynamicModelImporter modelImporter;
	protected PageDiagnosticHandler pageDiagnosticHandler;
	
	protected Text uriText;
	protected Button browseFileSystemButton;
	protected Button browseWorkspaceButton;
	protected String[] filterExtensions;
	protected Button loadButton;

	public EcoreModelImporterDetailPage(DynamicModelImporter modelImporter, String pageName) {
		super(pageName);
		this.modelImporter = modelImporter;
		setPageComplete(false);
	}

	public DynamicModelImporter getModelImporter() {
		return modelImporter;
	}
	
	@Override
	public void dispose() {
		modelImporter = null;
		pageDiagnosticHandler = null;
		
		if (uriText != null) {
			uriText.removeListener(SWT.Modify, this);
			uriText = null;
		}
		if (browseFileSystemButton != null) {
			browseFileSystemButton.removeListener(SWT.Selection, this);
			browseFileSystemButton = null;
		}
		if (browseWorkspaceButton != null) {
			browseWorkspaceButton.removeListener(SWT.Selection, this);
			browseWorkspaceButton = null;
		}
		if (loadButton != null) {
			loadButton.removeListener(SWT.Selection, this);
			loadButton = null;
		}
		
		super.dispose();
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_VERTICAL));
	
		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 8;
		composite.setLayout(layout);
	
		createURIControl(composite);
		setControl(composite);
	}

	protected void createURIControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		{
			FormLayout layout = new FormLayout();
			layout.marginTop = 10;
			layout.spacing = 10;
			composite.setLayout(layout);
		}
	
		Label uriLabel = new Label(composite, SWT.LEFT);
		{
			FormData data = new FormData();
			data.left = new FormAttachment(0);
			uriLabel.setLayoutData(data);
		}
		uriLabel.setText(Messages.URITextLabel);
	
		Composite uriComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 5);
			data.left = new FormAttachment(0);
			data.right = new FormAttachment(100);
			uriComposite.setLayoutData(data);
	
			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = -5;
			layout.marginLeft = -5;
			layout.marginRight = -5;
			uriComposite.setLayout(layout);
		}
	
		Composite buttonComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 0, SWT.CENTER);
			data.left = new FormAttachment(uriLabel, 0);
			data.right = new FormAttachment(100);
			buttonComposite.setLayoutData(data);
	
			FormLayout layout = new FormLayout();
			layout.marginTop = 0;
			layout.marginBottom = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.spacing = 5;
			buttonComposite.setLayout(layout);
		}
	
		browseFileSystemButton = new Button(buttonComposite, SWT.PUSH);
		browseFileSystemButton.setText(Messages.BrowseFileSystemButtonLabel);
		browseFileSystemButton.addListener(SWT.Selection, this);
	
		browseWorkspaceButton = new Button(buttonComposite, SWT.PUSH);
		browseWorkspaceButton.setText(Messages.BrowseWorkspaceButtonLabel);
		browseWorkspaceButton.addListener(SWT.Selection, this);
	
		{
			FormData data = new FormData();
			data.right = new FormAttachment(browseWorkspaceButton);
			browseFileSystemButton.setLayoutData(data);
		}
	
		{
			FormData data = new FormData();
			data.right = new FormAttachment(100);
			browseWorkspaceButton.setLayoutData(data);
		}
	
		uriText = new Text(uriComposite, SWT.SINGLE | SWT.BORDER);
		setURIText(getURITextInitialValue());
		if (uriText.getText().length() > 0) {
			uriText.selectAll();
		}
		uriText.addListener(SWT.Modify, this);
	
		addURIControl(uriComposite);
	
		{
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL
					| GridData.GRAB_HORIZONTAL);
			if (uriComposite.getChildren().length == 1) {
				gridData.horizontalSpan = 2;
			}
			uriText.setLayoutData(gridData);
		}
	}

	protected void addURIControl(Composite parent) {
		loadButton = new Button(parent, SWT.PUSH);
		loadButton.setText(Messages.LoadLabel);
		loadButton.setLayoutData(new GridData(GridData.END));
		loadButton.addListener(SWT.Selection, this);
	}

	protected void setURIText(String uri) {
		uri = uri.trim();
		StringBuffer text = new StringBuffer(uriText.getText());
		if (!uri.equals(text)) {
			if (supportMultipleURIs()) {
				Point textSelection = uriText.getSelection();
				text.delete(textSelection.x, textSelection.y);
				uri = text.append(" ").append(uri).toString();
			}
			uriText.setText(uri.trim());
		}
	}

	protected boolean supportMultipleURIs() {
		return false;
	}

	protected String getURITextInitialValue() {
		return "";
	}

	public void handleEvent(Event event) {
		if (event.type == SWT.Selection && event.widget == loadButton) {
			refreshModel();
			getContainer().updateButtons();
		} else if (event.type == SWT.Modify && event.widget == uriText) {
			uriTextModified(uriText.getText().trim());
		} else if (event.type == SWT.Selection
				&& event.widget == browseFileSystemButton) {
			browseFileSystem();
		} else if (event.type == SWT.Selection
				&& event.widget == browseWorkspaceButton) {
			browseWorkspace();
		}
	
		getContainer().updateButtons();
	}

	protected void uriTextModified(String text) {
		setErrorMessage(null);
		setMessage(null);
		
		getModelImporter().setModelLocation(null);
		getModelImporter().clearEPackagesCollections();
		adjustLoadButton();
	}
	
	protected void adjustLoadButton() {
		if (loadButton != null) {
			String text = uriText.getText();
			loadButton.setEnabled(text != null && text.trim().length() > 0);
		}
	}

	protected boolean browseFileSystem() {
		FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN
				| (supportMultipleURIs() ? SWT.MULTI : SWT.SINGLE));
		fileDialog.setFilterExtensions(getFilterExtensions());
	
		if (uriText.getText() != null) {
			fileDialog.setFileName(uriText.getText());
		}
	
		if (fileDialog.open() != null && fileDialog.getFileNames().length > 0) {
			String[] fileNames = fileDialog.getFileNames();
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < fileNames.length; ++i) {
				String filePath = fileDialog.getFilterPath() + File.separator
						+ fileNames[i];
				text.append(URI.createFileURI(filePath).toString());
				text.append(" ");
			}
			setURIText(text.toString());
			refreshModel();
			return true;
		}
		return false;
	}

	protected boolean browseWorkspace() {
		ViewerFilter extensionFilter = null;
		if (!getModelImporter().getFileExtensions().isEmpty()) {
			extensionFilter = new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					return !(element instanceof IFile)
					|| getModelImporter().getFileExtensions().contains(((IFile)element).getFileExtension());
				}
			};
		}
	
		IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(),
				null, null, supportMultipleURIs(), null, Collections
						.singletonList(extensionFilter));
		if (files.length > 0) {
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < files.length; ++i) {
				if (isValidWorkspaceResource(files[i])) {
					text.append(URI.createPlatformResourceURI(files[i]
							.getFullPath().toString(), true));
					text.append("  ");
				}
			}
			setURIText(text.toString());
			refreshModel();
			return true;
		}
		return false;
	}

	protected String[] getFilterExtensions() {
		if (filterExtensions == null) {
			List<String> fileExtensions = getModelImporter().getFileExtensions();
			if (fileExtensions.isEmpty()) {
				filterExtensions = new String[] { "*.*" };
			} else if (fileExtensions.size() == 1) {
				filterExtensions = new String[] { "*." + fileExtensions.get(0) };
			} else {
				StringBuffer allFilterExtensions = new StringBuffer();
				String[] extensions = new String[fileExtensions.size() + 1];
				for (int i = 1, lenght = extensions.length; i < lenght; i++) {
					extensions[i] = "*." + fileExtensions.get(i - 1);
					allFilterExtensions.append(";").append(extensions[i]);
				}
				allFilterExtensions.deleteCharAt(0);
				extensions[0] = allFilterExtensions.toString();
				filterExtensions = extensions;
			}
		}
		return filterExtensions;
	}

	protected boolean isValidWorkspaceResource(IResource resource) {
		if (resource.getType() == IResource.FILE) {
			String[] filterExtensions = getFilterExtensions();
			if (filterExtensions.length > 0) {
				for (int i = 0; i < filterExtensions.length; i++) {
					if (filterExtensions[i].endsWith(".*")
							|| filterExtensions[i].endsWith("."
									+ resource.getFileExtension())) {
						return true;
					}
				}
			}
	
		}
		return false;
	}

	protected void refreshModel() {
		WorkspaceModifyOperation initializeOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor)
					throws CoreException {
				setErrorMessage(null);
				setMessage(null);
	
				Monitor monitor = BasicMonitor.toMonitor(progressMonitor);
				try {
					refreshModel(monitor);
				} catch (Exception exception) {
					EcoreModelDiagramEditorPlugin.getInstance().logError(
							Messages.FailedToRefreshModel, exception);
				} finally {
					monitor.done();
				}
			}
		};
		
		getModelImporter().setModelLocation(uriText.getText());
	
		try {
			getContainer().run(false, false, initializeOperation);
		} catch (Exception exception) {
			EcoreModelDiagramEditorPlugin.getInstance().logError(
					Messages.FailedToRefreshModel, exception);
		}
	
		if (isPageComplete()) {
			setPageComplete(true);
		} else {
			setPageComplete(false);
			uriText.selectAll();
			uriText.setFocus();
		}
	}

	@Override
	public boolean isPageComplete() {
	    return getErrorMessage() == null
	      && !getModelImporter().getEPackages().isEmpty() 
	      && !getModelImporter().getModelLocationURIs().isEmpty();
	}

	protected void refreshModel(Monitor monitor) throws Exception {
		Diagnostic diagnostic = null;
		try {
			diagnostic = getModelImporter().computeEPackages(monitor);
//			getModelImporter().adjustEPackages(monitor);
		} catch (WrappedException wrappedException) {
			if (wrappedException.exception() instanceof FileNotFoundException) {
				setMessage(null);
				setErrorMessage(Messages.FileNotFound);
				setPageComplete(false);
				return;
			} else {
				throw wrappedException.exception();
			}
		}
		
		handleDiagnostic(diagnostic);
	}

	protected String getURIText() {
		return uriText.getText();
	}

	protected void handleDiagnostic(Diagnostic diagnostic)
	{
		handleDiagnostic(diagnostic, null, null, null);
	}
	
	protected final void handleDiagnostic(Diagnostic diagnostic, String message, String dialogTitle, String dialogMessage)
	{
		if (pageDiagnosticHandler == null)
		{
			pageDiagnosticHandler = new PageDiagnosticHandler(this);
		}
		pageDiagnosticHandler.handleDiagnostic(diagnostic, message, dialogTitle, dialogMessage);
	}

}