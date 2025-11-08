/*
 * Descripción: realizar un programa que cree un array de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 
 * Luego pedirá un valor N y mostrará en qué posiciones del array aparece N
 * Autora: Nerea
 * Fecha: 27/10/2025
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 100;
		
		int num, posicion;
		
		int numeros [];
		numeros = new int[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = (int) (1 + Math.random() * 10);
		}
		
		System.out.print("Introduce un número entero: ");
		num = teclado.nextInt();
		
		for(int indice = 0; indice < numeros.length; indice++) {
			if(numeros[indice] == num) {
				posicion = indice;
				System.out.println("En la posicion " + posicion + " está el valor " + numeros[indice]);
			}
		}

	}

}
