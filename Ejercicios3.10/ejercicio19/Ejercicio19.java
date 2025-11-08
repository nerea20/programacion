/*
 * Descripción: realizar un programa que muestre el ranking de puntuaciones de un torneo de ajedrez con 8 jugadores. 
 * Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de tipo entero)
 * y luego muestre las puntuaciones en orden descendente (de la más alta a la más baja)
 * Fecha: 30/10/2025
 */
package ejercicio19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 8;
		
		Integer puntuaciones[];
		puntuaciones = new Integer[TAMAYIO];
		
		for(int indice = 0; indice < puntuaciones.length; indice++) {
			
			System.out.print("Introduce la puntuacion (entre 1000 y 2800) para el jugador " + (indice + 1) + ": ");
			puntuaciones[indice] = teclado.nextInt();
			
		}
		
		Arrays.sort(puntuaciones, Collections.reverseOrder());
		
		System.out.println("Las puntuaciones de mayor a menor son: ");
		
		for(int indice = 0; indice < puntuaciones.length; indice++) {
			
			System.out.println(puntuaciones[indice]);
			
		}

	}

}
