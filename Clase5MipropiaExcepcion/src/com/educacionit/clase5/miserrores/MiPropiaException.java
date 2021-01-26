package com.educacionit.clase5.miserrores;

public class MiPropiaException extends Exception {

	String mensajeError;

	public MiPropiaException(String msg) {
		mensajeError = msg;
	}

	@Override
	public String getMessage() {
		return mensajeError;
	}
	
}
