/*
 * Descripción: realizar un programa cree un array de enteros e introduzca la siguiente secuencia de valores:
 *  1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		final int TAMAYIO = 55;
		
		int valorInicial = 1, incremento = 1, contador = 0;
		
		int numeros [];
		numeros = new int[TAMAYIO];
		
		for(int indice = 0; indice < numeros.length; indice++) {
			numeros[indice] = valorInicial;
			contador++;
			
			if(contador == valorInicial) {
				valorInicial = valorInicial + 1;
				contador = 0;
			}
			
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.print(numeros[indice] + ", ");
		}
		

	}

}
