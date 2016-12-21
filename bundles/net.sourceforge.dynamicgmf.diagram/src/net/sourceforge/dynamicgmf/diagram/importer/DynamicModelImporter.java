package net.sourceforge.dynamicgmf.diagram.importer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;

public abstract class DynamicModelImporter extends DynamicModelConverter {
	protected List<String> fileExtensions;
	protected List<URI> modelLocationURIs;
	protected String modelLocation;
	
	public List<String> getFileExtensions() {
		if (fileExtensions == null) {
			fileExtensions = new ArrayList<String>();
		}
		return fileExtensions;
	}
	
	public void setModelLocation(String location) {
		modelLocation = location == null || location.trim().length() == 0 ? null : location;
		modelLocationURIs = null;
	}
	
	public String getModelLocation() {
		return modelLocation;
	}
	
	public List<URI> getModelLocationURIs() {
		if (getModelLocation() == null) {
			return Collections.emptyList();
		} else if (modelLocationURIs == null) {
			modelLocationURIs = new ArrayList<URI>();
			for (StringTokenizer stringTokenizer = new StringTokenizer(getModelLocation()); stringTokenizer.hasMoreTokens();) {
				String uri = stringTokenizer.nextToken();
				modelLocationURIs.add(URI.createURI(uri));
			}
		}
		return modelLocationURIs;
	}
	

	public void setModelFile(IFile file) {
		if (file != null) {
			URI modelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			setModelLocation(modelURI.toString());
		} else {
			setModelLocation(null);
		}
	}
	
	public Diagnostic computeEPackages(Monitor monitor) throws Exception {
		clearEPackagesCollections();
		Diagnostic diagnostic = doComputeEPackages(monitor);
		return diagnostic;
	}
	
	protected Diagnostic doComputeEPackages(Monitor monitor) throws Exception {
		return Diagnostic.OK_INSTANCE;
	}
}
