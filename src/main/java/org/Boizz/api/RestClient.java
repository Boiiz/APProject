package org.Boizz.api;

import jakarta.xml.bind.JAXBContext;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClient {

	public RestClient() {
		try {
			URL url = new URL("http://www.example.com/customers");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("PUT");
			connection.setRequestProperty("Content-Type", "application/xml");

			OutputStream os = connection.getOutputStream();
			JAXBContext jaxbContext;

			os.flush();

			connection.getResponseCode();
			connection.disconnect();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
