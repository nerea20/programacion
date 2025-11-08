/*
 * Descripción: realizar un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila)
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int TAMAYIO = 10;
		
		int matriz [][];
		matriz = new int [TAMAYIO][TAMAYIO];
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas = 0; columnas < matriz[0].length; columnas++) {
				
				matriz[filas][columnas] = (filas + 1) * columnas;
				
			}
		}
		
		for(int filas = 0; filas < matriz.length; filas++) {
			for(int columnas = 0; columnas < matriz[0].length; columnas++) {
				
				System.out.println((filas + 1) + " x " + columnas + " = " + matriz[filas][columnas]);
				
			}
		}

	}

}
