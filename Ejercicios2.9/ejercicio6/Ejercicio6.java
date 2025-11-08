/*
 * Descripción: realizar un programa que  lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no
 * Autora: Nerea
 * Fecha: 20/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int num, contador = 0;
		boolean numerosNegativos = false;
		//hago el bucle
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if(num < 0) {
				numerosNegativos = true;
			}
			contador++;
			if(num == 0) {
				System.out.println("Los valores no pueden ser nulos");
			}
		}while(num != 0 && contador < 10);
		
		if (num != 0) {
			
			if(numerosNegativos == true) {
				System.out.println("Has introducido números negativos");
			} else {
				System.out.println("No has introducido ningún número negativo");
			}
		}

	}

}
