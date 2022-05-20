package com.ARM.eed.examen.OptimizacionYDocumentacion;

/**
 * <p>
 * Excepcion que salta en caso de una fecha erronea
 * @author Andrés Rodríguez Machado
 *
 */
public class EdadErroneaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>
	 * Excepción en caso de que la edad sea erronea
	 * @param message mensaje que se devuelve en caso de dar la excepción
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
