/*
 * Descripción: realizar un programa que lea una secuencia de números hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos
 * Autora: Nerea
 * Fecha: 20/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int num, contador = 0, sumaNumerosNegativos = 0, numerosPositivos = 0;
		boolean numeroNegativo = false;
		//hago el bucle
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
					
			if(num < 0) {
				sumaNumerosNegativos = sumaNumerosNegativos + 1;
				numeroNegativo = true;
			} else {
				numerosPositivos = numerosPositivos + 1;
			}			
					
		}while(num != 0);
					
		if (numeroNegativo == true) {
			System.out.println("Has introducido números negativos");
			System.out.println("Has introducido " + sumaNumerosNegativos + " números negativos");
			System.out.println("Has introducido " + numerosPositivos + " números positivos");
		} else {
			System.out.println("No has introducido números negativos");
			System.out.println("Has introducido " + numerosPositivos + " números positivos");
		}
	}

}
