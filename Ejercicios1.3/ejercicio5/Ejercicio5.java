/*
 * Descripción: realizar un programa que pida dos números y calcule ciertas cosas con las funciones de la clase Math
 * Autora: Nerea
 * Fecha: 01/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		double num1, num2, menor, elevado, raizCuadrada, valorAleatorio;
		//pido los datos
		System.out.print("Escribe un número para la variable num1: ");
		num1 = teclado.nextDouble();
		System.out.print("Escribe un número para la variable num2: ");
		num2 = teclado.nextDouble();
		//hago los cálculos
		menor = Math.min(num1, num2);
		System.out.println("El número más pequeño es " + menor);
		elevado = Math.pow(num1, num2);
		System.out.println("El valor de num1 elevado al valor de num2 es: " + elevado);
		raizCuadrada = Math.sqrt(num1);
		System.out.println("La raíz cuadrada de num1 es: " + raizCuadrada);
		valorAleatorio = Math.random()*num2;
		System.out.println("Un número aleatorio ente 0 y num2 es: " + valorAleatorio);

	}

}
