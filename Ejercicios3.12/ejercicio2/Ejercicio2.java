/*
 * Descripción: realizar un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales 
 * sin diferenciar entre mayúsculas y minúsculas
 * Autora: Nerea
 * Fecha: 05/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;
		
		System.out.print("Introduce una cadena de texto para la cadena1: ");
		cadena1 = teclado.nextLine();
		System.out.print("Introduce una cadena de texto para la cadena2: ");
		cadena2 = teclado.nextLine();
		
		if(cadena1.equalsIgnoreCase(cadena2) == true) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}

	}

}
