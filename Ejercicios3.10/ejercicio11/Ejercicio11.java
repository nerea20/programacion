/*
 * Descripción: realizar un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array 
 * todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso,
 * y mostrar ambos por pantalla
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		final int TAMAYIO = 100;
		
		int arrayUno [];
		arrayUno = new int[TAMAYIO];
		
		int arrayDos [];
		arrayDos = new int [TAMAYIO];
		
		for(int indice = 0; indice < arrayUno.length; indice++) {
			arrayUno[indice] = indice;
		}
		
		for(int indice = arrayDos.length - 1; indice >= 0; indice--) {
			arrayDos[indice] = indice;
		}
		
		System.out.println("Primer array");
		System.out.println("---------------------------------------------");
		for(int indice = 0; indice < arrayUno.length; indice++) {
			System.out.println("En el indice " + indice + " esta el valor " + arrayUno[indice]);
		}
		System.out.println("---------------------------------------------");
		System.out.println("Segundo array");
		for(int indice = arrayDos.length - 1; indice >= 0; indice--) {
			System.out.println("En el indice " + indice + " esta el valor " + arrayDos[indice]);
		}
		
	}

}
