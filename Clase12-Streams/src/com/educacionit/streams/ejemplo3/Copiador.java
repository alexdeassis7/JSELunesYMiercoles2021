package com.educacionit.streams.ejemplo3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Copiador {
	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");	
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");
		
//		System.out.println("existe el archivo " + inputFile.getName() +"?"  +  inputFile.exists());
//		System.out.println("Ruta del archivo " + inputFile.getName() + " es: "  + inputFile.getAbsolutePath());
//		System.out.println("tamaño en byte :" + inputFile.length());
//		System.out.println("fecha de modificacion : " + inputFile.lastModified());
//		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int unCaracter ;
		
		System.out.println("El archivo se esta copiando....");
		
		while((unCaracter = in.read()) != -1) {
			out.write(unCaracter);
		}
		
		in.close();
		out.close();
		
		System.out.println("se copia exitosamente el archivo!");
		
	}
}
