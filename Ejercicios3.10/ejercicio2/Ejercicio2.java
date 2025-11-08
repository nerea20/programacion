/*
 * Descripción: crear un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo la constante
		final int TAMAYIO = 10;
		//creo las variables
		int suma = 0;
		//creo el array
		int numeros[];
		numeros = new int[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {     //creo el bucle para recorrer y almacenar los datos
			System.out.println("Introduce un número para el índice: " + indice + ": ");
			numeros[indice] = teclado.nextInt();
			
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {    // creo el bucle para hacer la suma
			suma = suma + numeros[indice];
		}
		
		System.out.println("La suma de todos los números es: " + suma);  //muestro el resultado de la suma de todos los valores

	}

}
