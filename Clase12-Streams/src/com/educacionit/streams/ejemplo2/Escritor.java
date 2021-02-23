package com.educacionit.streams.ejemplo2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Escritor {

	public static void main(String[] args) throws IOException{

		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");
		//FileWriter en una clase concreta utilizada para crear un streams y escribir un archivo de texto 
		FileWriter out = new FileWriter(outputFile);
		
		//usando este constructor puedo hacer un append y no me sobreescribe el archivo , solo lo agrega al final 
		//FileWriter out = new FileWriter(outputFile,true);
		
		String info =  JOptionPane.showInputDialog("Escribir la info a guardar en el archivo destino.txt");
		
		for(int i = 0 ; i < info.length() ; i++) {
			out.write(info.charAt(i));
		}
		
		//cierro el stream
		out.close();
		
		System.out.println("El archivo ha sido escrito....");
	}

}
