package it.polimi.dice.lwdg.loaddemo;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;



/**
 * This class give help in http connection for DICE-LWDG LoadDemo
 * 
 * @author Giorgio Bartoccioni
 *
 */

public class LoadDemoHttp {
	
	/**
	 * 
	 * @param repo URL of remote file to download
	 * @return
	 * @throws Exception
	 */
	public static String getFIle(String repo) throws Exception{
	    	
		if (repo != null && !repo.isEmpty()) {
	
		    CloseableHttpClient httpclient = HttpClients.createDefault();
		    HttpGet httpget = new HttpGet(repo);
		    CloseableHttpResponse response;
		    try {
			response = httpclient.execute(httpget);
			int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode == 200) {
				HttpEntity entity = response.getEntity();
		        	InputStream is = entity.getContent();
		        	String out=writeTemp(is);
		    	    	response.close();
		    	    	return out;
			} else {
			    throw new Exception("LoadDemoHttp: Repository not valid.\n"+repo+"\n Response Code:"
					+ responseCode);
			}
			} catch (ClientProtocolException e) {
				throw new Exception("HttpClients: ClientProtocolException. Please check URL syntax");
			} catch (UnsupportedOperationException e) {
			    	throw new Exception("HttpClients: UnsupportedOperationException.");
			} catch (IOException e) {
			    e.printStackTrace();
			    	throw new Exception("HttpClients: IOException. Please check http or https");
			}   
		}else {
			throw new Exception("LoadDemoHttp: Empty Repository");
		}
	}
	
	/**
	 * 
	 * @param is InputStream
	 * @return
	 */
	private static String writeTemp(InputStream is) {

        try {
            File targetFile = File.createTempFile("dice_lwdg_file", ".tmp");
            OutputStream outStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[8 * 1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(outStream);
            return targetFile.getAbsolutePath();
        } catch (IOException e) {
            return null;
        }
    }
  
}
