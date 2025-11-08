/*
 * Descripción: realizar un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y luego muestre la matriz por pantalla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		final int TAMAYIO_UNO = 5;
		final int TAMAYIO_DOS = 5;
		
		int numeros [][];
		numeros = new int[TAMAYIO_UNO][TAMAYIO_DOS];
		
		int valorInicial = 1;
		
		for(int fila = 0; fila < numeros.length; fila++) {
			for(int columna = 0; columna < numeros[0].length; columna++) {
				numeros[fila][columna] = valorInicial;
				valorInicial++;
			}
		}
		
		for(int fila = 0; fila < numeros.length; fila++) {
			for(int columna = 0; columna < numeros[0].length; columna++) {
				System.out.println("En la fila " + fila + " y columna " + columna + " el valor es: " + numeros[fila][columna]);
			}
		}

	}

}
