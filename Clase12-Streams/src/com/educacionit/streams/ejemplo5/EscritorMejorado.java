package com.educacionit.streams.ejemplo5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {

	public static void main(String[] args) throws IOException {

		File outputFile = new File(
				"archivosES" + File.separator + "salida" + File.separator + "bufferedWriterOutPut.txt");
		
		String linea1 = "soy la primer linea";
		String linea2 = "soy la segunda linea";
		String linea3 = "soy la tercera linea";
		
		BufferedWriter writermejorado = new BufferedWriter(new FileWriter(outputFile));
 
		// escribimos el archivo a traves del Buffered Writer
		writermejorado.write(linea1, 0, linea1.length()); //escribo el string desde inicio a fin 
		writermejorado.newLine(); //creo una linea en blanco
		
		writermejorado.write(linea2, 0, linea2.length());
		writermejorado.newLine();
		
		writermejorado.write(linea3, 0, linea3.length());
		writermejorado.newLine();
		
		//cierro el Buffered Wirter
		writermejorado.close();
		System.out.println("Se escribio las tres linea en el archivo bufferedWriterOutPut.txt");
			
	}

}
