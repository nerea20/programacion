/*
 * Descripción: crear un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
 * escriba M en todas sus posiciones y lo muestre por pantalla
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n, m; // creo las variables
		
		System.out.print("Introduce un número entero(N): "); //pido el valor para N
		n = teclado.nextInt();
		System.out.print("Introduce un número entero(M): "); //pido el valor para N
		m = teclado.nextInt();
		
		int numeros[];
		numeros = new int[n]; //creo el array con el valor que el usuario a puesto en N
		
		for(int indice = 0; indice < numeros.length; indice++) { //creo el bucle para cargar los datos, es decir el valor de M en todas las posiciones
			numeros[indice] = m;
		}
		
		for(int indice = 0; indice < numeros.length; indice++) { // creo el bucle para mostrarlo por pantalla
			System.out.println("El valor del indice " + indice + " es: " + numeros[indice]);
		}

	}

}
