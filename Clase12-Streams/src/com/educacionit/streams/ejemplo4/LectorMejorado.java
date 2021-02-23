package com.educacionit.streams.ejemplo4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LectorMejorado {

	public static void main(String[] args) throws Exception {

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

		boolean eof = false;
		String lineaLeida = "";

		while (!eof) {
			lineaLeida = readerMejorado.readLine();

			if (lineaLeida != null) {
				System.out.println(lineaLeida);
			} else {
				eof = true;
			}
		}

		readerMejorado.close();
		
	}

}
