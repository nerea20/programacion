/*
 * Descripción: realizar un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tamayio, valorInicial, incremento;
		
		System.out.print("Cuantos valores quieres crear: ");
		tamayio = teclado.nextInt();
		
		int numeros [];
		numeros = new int[tamayio];
		
		System.out.print("Introduce el valor inicial: ");
		valorInicial = teclado.nextInt();
		System.out.print("Introcude el incremento: ");
		incremento = teclado.nextInt();
		
		
		for(int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = valorInicial;
			valorInicial = valorInicial + incremento;
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println(numeros[indice]);
		}

	}

}
