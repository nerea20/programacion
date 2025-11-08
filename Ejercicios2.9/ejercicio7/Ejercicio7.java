/*
 * Descripción: realizar un programa que  lea 100 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos
 * Autora: Nerea
 * Fecha: 20/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int num, contador = 0, numerosNegativos = 0, numerosPositivos = 0;
		//hago el bucle
		do{
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if(num < 0) {
				numerosNegativos = numerosNegativos + 1;
			} else {
				numerosPositivos = numerosPositivos + 1;
			}
			
			contador++;
			
			if(num == 0) {
				System.out.println("Los valores no pueden ser nulos");
			}
			
		}while(num != 0 && contador < 10);
			
		if (num != 0) {
			System.out.println("Has introducido " + numerosNegativos + " números negativos");
			System.out.println("Has introducido " + numerosPositivos + " números positivos");
		}
	}

}
