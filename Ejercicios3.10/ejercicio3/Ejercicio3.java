/*
 * Descripción: crear un programa que pida diez números reales por teclado, los almacene en un array, y
 * luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 10;  //creo la constante
		
		int maximo, minimo;  //creo las variables
		
		int numeros[];     //creo el array
		numeros = new int[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++){  //creo el bucle para almacenar los datos
			System.out.print("Introduce un número para el índice " + indice + ": ");
			numeros[indice] = teclado.nextInt();
		}
		
		maximo = numeros[0]; //lo inicializo en la primera posición
		minimo = numeros[0]; //lo inicializo en la primera posición
			
		for(int indice = 0; indice < numeros.length; indice++) { //creo el bucle para averiguar el máximo y el mínimo
			
			if(maximo < numeros[indice]) {
				maximo = numeros[indice];
			}
			
			if(minimo > numeros[indice]) {
				minimo = numeros[indice];
			}
		}	
		
		System.out.println("El número máximo introducido es el: " + maximo); //muestro el máximo 
		System.out.println("El número mínimo introducido es el: " + minimo); // muestro el mínimo

	}

}
