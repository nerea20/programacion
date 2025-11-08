/*
 * Descripción: crear un programa que pida veinte números reales por teclado, los almacene en un array y
 * luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 6; //creo la constante
		
		double suma = 0, media = 0; // creo las variables
		
		int numeros[];
		numeros = new int[TAMAYIO]; // creo el array
		
		for(int indice = 0; indice < numeros.length; indice++) { // creo el bucle para almacenar los datos
			System.out.print("Introduce un número para el índice " + indice + ": ");
			numeros[indice] = teclado.nextInt();
		}
		
		for(int indice = 0; indice < numeros.length; indice++) { // creo el bucle para hacer la media
			suma = suma + numeros[indice];
			
			media = suma / TAMAYIO;
		}
		
		System.out.println("La media es: " + media);

	}

}
