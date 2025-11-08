/*
 * Descripción: crear un programa que  pida dos valores enteros P y Q, luego cree un array que contenga
 * todos los valores desde P hasta Q, y lo muestre por pantalla
 * Autora: Nerea
 * Fecha: 27/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int p,q, contador = 0;
		
		System.out.print("Introduce un número de inicio (P): ");
		p = teclado.nextInt();
		System.out.print("Introduce un número para el final (Q): ");
		q = teclado.nextInt();
		
		contador = p;
		do {
			contador++;
		} while(contador <= q);
		
		int numeros [];
		numeros = new int [contador];
		
		for(int posicion = p; posicion < numeros.length; posicion++) {
			numeros[posicion] = posicion; 
		}
		
		for(int posicion = p; posicion < numeros.length; posicion++) {
			System.out.println("El valor de la posicion " + posicion + " es: " + numeros[posicion]); 
		}
		
		

	}

}
