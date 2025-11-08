/*
 * Descripción: realizar un programa que cree una matriz de tamaño NxM e introduzca en ella NxM valores  Luego deberá recorrer la matriz y 
 * al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int tamayioFilas, tamayioColumnas, contadorMayor = 0, contadorMenor = 0, contadorIgual = 0;
		
		System.out.print("Introduce el número de filas de la matriz: ");
		tamayioFilas = teclado.nextInt();
		System.out.print("Introduce el número de columnas de la matriz: ");
		tamayioColumnas = teclado.nextInt();
		
		int matriz [][];
		matriz = new int[tamayioFilas][tamayioColumnas];
	
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas = 0; columnas < matriz[0].length; columnas++) {
				
				System.out.print("Introduce los valores de la matriz: ");
				matriz[filas][columnas] = teclado.nextInt();
				
			}
		}
		
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas = 0; columnas < matriz[0].length; columnas++) {
				
				if(matriz[filas][columnas] > 0) {
					contadorMayor++;
				} else if(matriz[filas][columnas] < 0) {
					contadorMenor++;
				} else {
					contadorIgual++;
				}
				
			}
		}
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas = 0; columnas < matriz[0].length; columnas++) {
				
				System.out.println("El valor de la fila " + filas + " y la columna " + columnas + " es: " + matriz[filas][columnas]);
				
			}
		}
		
		System.out.println("Hay " + contadorMayor + " valores mayores que cero");
		System.out.println("Hay " + contadorMenor + " valores menores que cero");
		System.out.println("Hay " + contadorIgual + " valores iguales que cero");

	}

}
