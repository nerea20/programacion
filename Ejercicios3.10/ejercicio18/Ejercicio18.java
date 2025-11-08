/*
 * Descripción: realizar un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0 y 9 (utiliza Math.random()*10).
 * Luego ordena los valores del array y los mostrará por pantalla
 * Fecha: 30/10/2025
 */
package ejercicio18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		final int TAMAYIO = 30;
		
		int numeros[];
		numeros = new int[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {
			
			numeros[indice] = (int)(Math.random()*10);
			
		}
		
		Arrays.sort(numeros);
		
		for(int indice = 0; indice < numeros.length; indice++) {
			
			System.out.println(numeros[indice]);
			
		}

	}

}
