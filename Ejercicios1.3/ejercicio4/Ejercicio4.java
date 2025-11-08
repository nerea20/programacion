/*
 * Descripción: realizar un programa que pida un número y y le aplique varias funciones math y explique el resultado
 * Autora: Nerea
 * Fecha: 01/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo la variable
		double numero;
		//pido que me den el número
		System.out.print("Escribe un número: ");
		numero = teclado.nextDouble();
		//hago las funciones y las explico
		System.out.println("La función ceil redondea hacia arriba el número: " + Math.ceil(numero));
		System.out.println("La función floor redondea hacia abajo el número: " + Math.floor(numero));
		System.out.println("La función round redondea al entero más cercano: " + Math.round(numero));
	}

}
