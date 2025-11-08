/*
 * Descripción: crear un programa que pida veinte números enteros por teclado, los almacene en un array y
 * luego muestre por separado la suma de todos los valores positivos y negativos
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 20; //creo la constante
		
		int sumaPositivos = 0, sumaNegativos = 0; // creo las variables
		
		int numeros [];
		numeros = new int[TAMAYIO]; //creo el array
		
		for(int indice = 0; indice < numeros.length; indice++) { // creo el bucle para almacenar los datos
			System.out.print("Introduce un número para el índice " + indice + ": ");
			numeros[indice] = teclado.nextInt();
		}
		
		for(int indice = 0; indice < numeros.length; indice++) { // creo el bucle para hacer las sumas
			
			if(numeros[indice] > 0) {
				sumaPositivos = sumaPositivos + numeros[indice];
			} else {
				sumaNegativos = sumaNegativos + numeros[indice];
			}
			
		}
		
		System.out.println("La suma de los números positivos es: " + sumaPositivos);
		System.out.println("La suma de los números positivos es: " + sumaNegativos);

	}

}
