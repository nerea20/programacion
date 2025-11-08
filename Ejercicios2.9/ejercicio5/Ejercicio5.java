/*
 * Descripción: realizar un programa que lea un número positivo N y calcule y visualice su factorial
 * Autora: Nerea
 * Fecha: 20/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, factorial = 1;
		
		System.out.print("Introduce un número positivo para calcular su factorial: ");
		num = teclado.nextInt();
		
		for(int contador = 1; contador < num + 1; contador++) {
			factorial = factorial * contador ;
			
		}
		System.out.println(num + "! = " + factorial);

	}

}
