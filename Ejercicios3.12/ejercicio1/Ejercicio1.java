/*
 * Descripción: realizar un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta
 * Autora: Nerea
 * Fecha: 05/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		
		System.out.print("Escribe una cadena de texto: ");
		cadena = teclado.nextLine();
		
		String[] palabras = cadena.split(" "); //creas un vector de tipo string para meter la cadena de caracteres "cadena"
		
		for(String listaPalabras : palabras) { //creas una variable string que va mostrar las palabras almacenadas en el vector
			
			System.out.println(listaPalabras);
			
		}

	}

}
