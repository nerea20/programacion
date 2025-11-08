/*
 * Descripción: realizar un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 10;
		
		int numeros [];
		numeros = new int [TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {	//inicializo a 0
			numeros[indice] = 0;
		}
		
		char opcionElegida = 'a';
		
		while(opcionElegida != 'c') {
		
		System.out.println("Menu");
		System.out.println("---------------------------");
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valor");
		System.out.println("c. Salir");
		System.out.println("---------------------------");
		System.out.println("Elige una opción: ");
		opcionElegida = teclado.next().charAt(0);
		
		if(opcionElegida == 'a') {
			
			for(int indice = 0; indice < numeros.length; indice++) {
				System.out.println("El indide " + indice + " tiene el valor: " + numeros[indice]);
			}
			
		} else if(opcionElegida == 'b') {
			
			System.out.print("Introduce un valor: ");
			int valor = teclado.nextInt();
			System.out.print("Introduce la posicion en la que irá el valor (0-9): ");
			int posicion = teclado.nextInt();
			
			for(int indice = 0; indice < numeros.length; indice++) {
				numeros[posicion] = valor;
			}
		} else if(opcionElegida == 'c') {
			
			System.out.println("Has salido");
			
		} else {
			System.out.println("Valor incorrecto");
		}
	
	}
	}

}
