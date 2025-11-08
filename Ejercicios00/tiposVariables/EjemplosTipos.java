/*
 * Descripción: ejemplos de tipos de variables
 * Autora: Nerea
 * Fecha: 22/09/2025
 */
package tiposVariables;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; //Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		double alturaAlumno = 1.75;
		System.out.println("Valor de la variable: " + alturaAlumno + " cms");
		
		char letraDni;
		letraDni = 'a';
		System.out.println("Valor de la variable: " + letraDni);
		
		String nombreAlumno = "Paco";
		System.out.println("Valor de la variable: " + nombreAlumno);
		
		final int NUM_MAX_ALUMNOS = 25; //Declaramos una constante
		System.out.println("Valor de la constante: " + NUM_MAX_ALUMNOS);
		
		final String GRUPO_ALUMNOS = "DAW 1";
		System.out.println("Valor del grupo constante: " + GRUPO_ALUMNOS);

	}

}
