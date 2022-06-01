package com.ARM.eed.examen.OptimizacionYDocumentacion;

/**
 * <p>
 * Salta en caso de una fecha erronea
 * @author Andres Rodriguez Machado
 *
 */
public class EdadErroneaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <p>
	 * Salta en caso de que la edad sea erronea
	 * @param message mensaje que se muestra en caso de dar la excepcion
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
