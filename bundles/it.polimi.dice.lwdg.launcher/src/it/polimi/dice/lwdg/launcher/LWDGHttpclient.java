package it.polimi.dice.lwdg.launcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.swt.SWT;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;

/**
 * This class give help in http connection for DICE-LWDG Launcher
 * 
 * @author Giorgio Bartoccioni
 *
 */

public class LWDGHttpclient {

    /**
     * This method send the given input file to the given rest URL and write the
     * given output file
     * 
     * @param restURL
     *            URL of the RESTful service
     * @param inputFile
     *            Name of the input file
     * @param outputFile
     *            Name of the output file
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static void PostXmi(String restURL, String inputFile, String outputFile) throws Exception {

	HttpClient client = new HttpClient();
	PostMethod post = new PostMethod(restURL + "/generateToscaBlueprint");

	try {
	    File file = new File(inputFile);
	    RequestEntity entity = new FileRequestEntity(file, "text/plain; charset=\"UTF-8\"");
	    post.setRequestEntity(entity);
	    int responseCode = client.executeMethod(post);
	    if (responseCode == 200) {
		InputStream is = post.getResponseBodyAsStream();
		String filePath = outputFile;
		FileOutputStream fos = new FileOutputStream(new File(filePath));
		int inByte;
		while ((inByte = is.read()) != -1)
		    fos.write(inByte);
		is.close();
		fos.close();
		post.releaseConnection();
		LWDGgui.showDialog(
			"Response Code: " + responseCode + "\nConversion completed.\n Output model is:" + outputFile,
			SWT.ICON_INFORMATION);
	    } else {
		post.releaseConnection();
		LWDGgui.showDialog("LWDGHttpclient: Error!\nResponse Code: " + responseCode, SWT.ICON_ERROR);
	    }

	} catch (HttpException e) {
	    LWDGgui.showDialog("LWDGHttpclient: Fatal protocol violation: " + e.getMessage(), SWT.ICON_ERROR);
	    e.printStackTrace();
	} catch (IOException e) {
	    LWDGgui.showDialog("LWDGHttpclient: Fatal transport error: " + e.getMessage(), SWT.ICON_ERROR);
	    e.printStackTrace();
	} finally {
	    // Release the connection.
	    post.releaseConnection();
	}

    }

    /**
     * This method execute a simple GET at the given URL to check if service is
     * alive
     * 
     * @param url to check
     */
    public static Boolean checkURL(String url) throws Exception {
	if (url != null && !url.isEmpty()) {
	    HttpClient client = new HttpClient();
	    GetMethod method = new GetMethod(url);
	    client.executeMethod(method);
	    return true;
	} else {
	    throw new Exception("Repo not valid");
	}
    }
}
