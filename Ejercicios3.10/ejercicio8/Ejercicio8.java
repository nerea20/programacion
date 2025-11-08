/*
 * Descripción: realizar un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 *  y luego le pida al usuario un valor real R, por último, mostrará cuántos valores del array son igual o superiores a R
 * Autora: Nerea
 * Fecha: 27/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMAYIO = 100;
		
		double numAleatorio, numReal;
		int contador = 0;
		
		double numeros [];
		numeros = new double[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = Math.random();
		}
		
		System.out.print("Introduce un número real: ");
		numReal = teclado.nextDouble();
		
		for(int indice = 0; indice < numeros.length; indice++) {
			if(numeros[indice] >= numReal) {
				contador++;
				System.out.println(numeros[indice]);
			} 
		}
		
		System.out.println("Hay " + contador + " valores superiores o iguales a R");

	}

}
