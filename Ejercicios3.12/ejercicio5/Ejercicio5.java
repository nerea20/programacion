/*
 * Descripción: realizar un programa que lea una frase por teclado e indique si la frase es un palíndromo o no 
 * (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
 * Autora: Nerea
 * Fecha: 05/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		
		System.out.print("Introduce una frase: ");
		frase = teclado.nextLine();
		
		String fraseLimpia = frase.toLowerCase().replace(" " , ""); //convierte la frase en minuscula y le quita los espacios
		
		StringBuilder texto = new StringBuilder(fraseLimpia); // crear un StringBuilder a partir del string
		
		
		texto.reverse(); //darle la vuelta al texto 
		
		String textoInvertido = texto.toString(); //convertir de nuevo a string
		
		if((fraseLimpia.equals(textoInvertido))) {
			System.out.println("La frase es un palíndromo");
		} else {
			System.out.println("La frase no es un palíndromo");
		}

	}

}
