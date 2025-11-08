/*
 * Descripción: realizar un programa que dada dos variables se intercambiaran los valores
 * Autora: Nerea
 * Fecha: 01/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int num1, num2, cambio = 0;
		//pido los datos
		System.out.print("Escribe un número para la variable num1: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe un número para la variable num2: ");
		num2 = teclado.nextInt();
		//muestro lo que hay
		System.out.println("El valor de num1 es " + num1 + " y el valor de num2 es " + num2);
		//ahora hago el cambio
		cambio = num1;
		num1 = num2;
		num2 = cambio;
		//muestro el cambio por pantalla
		System.out.println("Después del cambio el valor de num1 es " + num1 + " y el valor de num2 es " + num2);
		

	}

}
