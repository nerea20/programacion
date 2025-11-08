/*
 * Descripción: realizar un programa que pida la edad y mostrar si es mayor de edad
 * Autora: Nerea
 * Fecha: 02/10/2025
 */
package estructurasIf;

import java.util.Scanner;

public class EjemploSi {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		System.out.print("Escribe tu edad: ");
		edad = teclado.nextInt();
		
		if ( (edad >= 18) || (edad <= 30) ) {
			System.out.println("Eres joven");
		}

	}

}
