/*
 * Descripción: crear un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo la constante
		final int NUMERO = 10;
		//creo el array
		int numeros [];
		numeros = new int[NUMERO];
		// creo el bucle para recorrer y almacenar los datos
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.print("Escribe un número para el índice " + indice + ": ");
			numeros[indice] = teclado.nextInt();
		}
		//creo otro bucle para mostrar sus valores
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("El número almacenado en el índice " + indice + " es: " + numeros[indice]);
		}

	}

}
