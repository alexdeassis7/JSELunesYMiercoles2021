package com.educacionit.streams.ejemplo7;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioEjemplos {

	public static void main(String[] args) {
		// crearDirectorio();
		// copyFile();
//		moverArchivo() ;
		borrarArchivo();
	}

	public static void crearDirectorio() {

		Path path = Paths.get("datos");
		try {

			Path nuevoDirectorio = Files.createDirectory(path);
			System.out.println("se creo el directorio datos");
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void copyFile() {
		Path origenArchivo = Paths.get("datos/login.properties");
		Path destinoArchivo = Paths.get("login-copia.properties");

		try {
			Files.copy(origenArchivo, destinoArchivo);
			System.out.println("Se copio el archivo Correctamente ");
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void moverArchivo() {
		Path archivoOrigen = Paths.get("login");
		Path rutaDestino = Paths.get("datos/login-move.properties");
		try {
			Files.move(archivoOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void borrarArchivo() {
		Path path = Paths.get("datos/login-move.properties");

		try {
			Files.delete(path);
			System.out.println("se borro el archivo login-move.properties correctamente");
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
