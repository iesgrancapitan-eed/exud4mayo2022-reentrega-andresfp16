package com.ARM.eed.examen.OptimizacionYDocumentacion;
/**
 * <p>
 * En esta clase está Perro.java donde esta clase simula el comportamiento de un perro
 * @author Andrés Rodríguez Machado
 *
 */
public class Perro extends Mascota {
	/**
	 * <p>
	 * Esta constante representa el ladrido de un perro 
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	private int age;
	/**
	 * <p>
	 * El constructor perro crea un objeto perro
	 * @param name nombre del perro
	 * @param age Edad del perro
	 * @throws EdadErroneaException Es una excepción que salta en caso de tener una edad erronea
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	/**
	 * <p>
	 * Cambia la edad del perro por la que se le asigne 
	 * @param age Nueva edad del perro
	 * @throws EdadErroneaException Es una excepción que salta en caso de tener una edad erronea
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}
	/**
	 * <p>
	 * Devuelve la edad del perro
	 * @return
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * <p>
	 * Este método simula un ladrido de un perro
	 * @return
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
