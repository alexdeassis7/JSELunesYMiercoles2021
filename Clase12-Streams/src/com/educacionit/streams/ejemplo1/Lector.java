package com.educacionit.streams.ejemplo1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//Leemo un File caracter a caracter
public class Lector {

	public static void main(String[] args) throws IOException{

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");
		System.out.println("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");
		//File Reader genera Streams orientados a caracteres y se encarga de leer el archivo
		FileReader in =  new FileReader(inputFile);
		
		//Declaro la variable que contendra al caracter leido 
		int unCaracter;
	 
		while((unCaracter = in.read()) != -1) {
			System.out.print((char) unCaracter);
		}
		//cerrar el archivo
		in.close();
	}

}
