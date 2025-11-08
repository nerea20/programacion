/*
 * Descripción: realizar un programa que solicite dos números, los compare y muestre cada resultado
 * Autora: Nerea
 * Fecha: 06/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int num1, num2;
		//pido los números
		System.out.print("Escribe un número: ");
		num1 = teclado.nextInt();
		System.out.print("Escribe otro número: ");
		num2 = teclado.nextInt();
		//comparo y muestro los resultados
		if (num1 > num2) {
			System.out.println("num1 es mayor que num2");
		} else if (num2 > num1){
			System.out.println("num2 es mayor que num1");
		} else {
			System.out.println("son iguales");
		}

	}

}
