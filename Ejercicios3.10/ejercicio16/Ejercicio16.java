/*
 * Descripción: realizar un programa igual que el 14 pero en esta ocasión has de utilizar Arrays.fill()
 * Luego muestra el array por pantalla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		final int TAMAYIO = 55;
		
		int numeros [];
		numeros = new int[TAMAYIO];
		
		int valorInicial = 1, incremento = 1, posicion = 0, indiceInicial, indiceFinal;
		
		for(int indice = 1; indice <= 10; indice++) { //hasta 10
			
			indiceInicial = posicion;
			indiceFinal = posicion + indice; //hasta donde llegar
			
			Arrays.fill(numeros, indiceInicial,indiceFinal,valorInicial);
			
			posicion = indiceFinal;
			
			valorInicial = valorInicial + incremento; //incrementar el valor
		}
		
		for(int indice = 0; indice < numeros.length; indice++) {
		
			System.out.print(numeros[indice] + " ");
		
		}

	}

}
