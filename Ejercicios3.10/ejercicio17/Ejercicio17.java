/*
 * Descripción: realizar un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y 
 * los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 10;
		
		int array1 [];
		array1 = new int[TAMAYIO];
		
		int array2[];
		array2 = new int[TAMAYIO];
		
		for(int indice = 0; indice < array1.length; indice++) {
			
			System.out.print("Introduce un valor para el array1, índice " + indice + ": ");
			array1[indice] = teclado.nextInt();
			
		}
		
		for(int posicion = 0; posicion < array2.length; posicion++) {
			
			System.out.print("Introduce un valor para el array2, índice " + posicion + ": ");
			array2[posicion] = teclado.nextInt();
			
		}
		
		boolean iguales = false;
		
		for(int indice = 0; indice < array1.length; indice++) {
			for(int posicion = 0; posicion < array2.length; posicion++) {
				
				if(array1[indice] == array2[posicion]) {
					iguales = true;
				} else {
					iguales = false;
				}
				
			}
		}
		
		if(iguales == true) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays no son iguales");
		}
		

	}

}
