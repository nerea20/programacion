/*
 * Descripción: realizar un programa que lea un número y mostre su cuadrado hasta que introduzca un número negativo
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int numero = 1, cuadrado;
		//hago el bucle
		do {
			System.out.print("Introduce un número: ");
			numero = teclado.nextInt();
			if(numero > 0){
				cuadrado = numero * numero;
				System.out.println("El cuadrado del " + numero + " es " + cuadrado);
			}else {
				System.out.println("Ha terminado");
			}
			
		}while(numero > 0);

	}

}
