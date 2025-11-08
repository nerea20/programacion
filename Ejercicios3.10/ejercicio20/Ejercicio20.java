/*
 * Descripción: realizar un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99 (utiliza Math.random()*100). 
 * Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el array, además de cuantas veces
 * Fecha: 30/10/2025
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 1000;
		
		int array[];
		array = new int[TAMAYIO];
		
		for(int indice = 0; indice < array.length; indice++) {
			
			array[indice] = (int) (Math.random()*100);	
			
		}
		
		//for(int indice = 0; indice < array.length; indice++) {			//esto es para comprobar que existe mostrando los valores
			//System.out.println("indice " + indice + " valor: " + array[indice]);
		//}
		
		System.out.print("Introduce el valor que quieres comprobar que existe: ");
		int valor = teclado.nextInt();
		
		boolean existe = false;
		int contador = 0;
		
		for(int indice = 0; indice < array.length; indice++) {
			
			if(array[indice] == valor) {
				
				existe = true;
				contador++;
				
			} 
			
		}
		
		
		if(existe == true) {
			System.out.println("El valor existe en el array " + contador +" veces");
		} else {
			System.out.println("El valor no existe en el array");
		}
		
	}

}
