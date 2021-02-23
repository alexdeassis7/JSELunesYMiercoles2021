package com.educacionit.streams.ejemplo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamFileRemote {

	public static void main(String[] args) {

//		Asi se Setean las configuraciones de proxy , es caso de necesitarlo 
//		Properties systemSettings = System.getProperties();
//		systemSettings.put("proxySet", "true");
//		systemSettings.put("http.proxyHost", "192.168.0.8");
//		systemSettings.put("http.proxyPort", "81");
		try {
			// Construimos un objeto URL
			URL url = new URL(
					"https://www.infodolar.com/");

			// Construimos un Stream contra la url donde voy a leer
			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;
			String unaLinea;

			while (!eof) {
				// leo una linea del archivo remoto
				unaLinea = elBuffer.readLine();

				// muestro la linea por consola
				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}

		} catch (MalformedURLException e) {
			System.out.println("La url no es valida : " + e.toString());
		} catch (IOException e) {
			System.out.println("No se puede leer de Internet : " + e.toString());
		}

	}

}
