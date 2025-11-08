/*
 * Descripción: realizar un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo la variable
		int num;
		//pido el número
		System.out.print("Introduce el número final: ");
		num = teclado.nextInt();
		//hago el bucle
		for(int contador = 1; contador < num + 1; contador++) {
			System.out.print(contador + " ");
		}

	}

}
