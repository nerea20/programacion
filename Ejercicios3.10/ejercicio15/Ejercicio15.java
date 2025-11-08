/*
 * Descripción: realizar un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas sus posiciones.
 * Luego muestra el array por pantalla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tamayio, valor;
		
		System.out.print("Introduce el tamaño que quieras que tenga el array: ");
		tamayio = teclado.nextInt();
		System.out.print("Introduce el valor que quieras que tengan las posiciones: ");
		valor = teclado.nextInt();
		
		int numeros [];
		numeros = new int[tamayio];
		
		for(int posicion = 0; posicion < numeros.length; posicion++) {
			numeros[posicion] = valor;
		}
		
		for(int posicion = 0; posicion < numeros.length; posicion++) {
			System.out.println("El valor de la posicion " + posicion + " es: " + numeros[posicion]);
		}


	}

}
