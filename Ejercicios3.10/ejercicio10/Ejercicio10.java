/*
 * Descripción: realizar un programa que realice cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y 
 * luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima 
 * así como cuántas personas miden por encima y por debajo de la media
 * Autora: Nerea
 * Fecha: 27/10/2025
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, contadorEncimaMedia = 0, contadorDebajoMedia = 0;
		double media = 0, maxima, minima;
		
		System.out.print("Introduce un número para el tamaño del array: ");
		num = teclado.nextInt();
		
		double numeros [];
		numeros = new double[num];
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.print("Introduce la altura para el indice " + indice + ": ");
			numeros[indice] = teclado.nextDouble();
		}
		
		
		for(int indice = 0; indice < numeros.length; indice++) {
			
			media = (media + numeros[indice]);	
		}
		
		media = media / numeros.length;
		
		maxima = numeros[0];
		minima = numeros[0];
		
		for(int indice = 0; indice < numeros.length; indice++) {

			if(maxima < numeros[indice]) {
				maxima = numeros[indice];
			}
			
			if(minima > numeros[indice]){
				minima = numeros[indice];
			}
	
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {
			
			if(numeros[indice] > media) {
				contadorEncimaMedia++;
			} else {
				contadorDebajoMedia++;
			}
		}
		
		System.out.println("La media de las alturas es: " + media);
		System.out.println("La altura máxima introducida es: " + maxima + " y la mínima es: " + minima);
		System.out.println("Hay " + contadorEncimaMedia + " personas por encima de la media y " + contadorDebajoMedia + " por debajo de la media");

	}

}
