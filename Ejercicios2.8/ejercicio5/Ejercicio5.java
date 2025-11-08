/*
 * Descripción: realizar un programa que pida 10 números y muestre la media de los números positivos, la media de los números negativos y la cantidad de ceros
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		double num, numPositivos = 0, mediaPositivos, mediaNegativos, numNegativos = 0, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		//hago el bucle
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("Introduce un número: ");
			num = teclado.nextDouble();
			if(num > 0){
				numPositivos = numPositivos + num;
				contadorPositivos++;
			}else if(num < 0) {
				numNegativos = numNegativos + num;
				contadorNegativos++;
			}else {
				contadorCeros++;
			}	
		}
		mediaPositivos = numPositivos / contadorPositivos;
		System.out.println("La media de los números positivos es: " + mediaPositivos );
		mediaNegativos = numNegativos / contadorNegativos;
		System.out.println("La media de los números negativos es: " + mediaNegativos );
		System.out.println("El número de ceros es: " + contadorCeros );

	}

}
