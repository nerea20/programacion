/*
 * Descripción: realizar un programa que lea una secuencia de notas hasta poner un -1 y que diga si hubo alguna nota con valor 10 o no
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		byte nota = 0;
		boolean notaDiez = false;
		//hago el bucle
		do {
			System.out.print("Introduce una nota (de 0 a 10): ");
			nota = teclado.nextByte();
			
			if(nota > 10) {
				System.out.println("Las notas tienen que estar entre 0 y 10");
			} else if(nota == 10) {
				notaDiez = true;
			}
			
		} while(nota > -1 && nota <= 10);
		
		if(notaDiez == true) {
			System.out.print("Si hubo alguna nota con un 10");
		} else {
			System.out.print("No se introdujo ninguna nota con un 10");
		}

	}

}
