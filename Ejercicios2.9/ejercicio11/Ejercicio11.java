/*
 * Descripción: realizar un programa que suma independientemente los pares y los impares entre 100 y 200 y muestre cada suma
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		//creo las variables
		int sumaPares = 0, sumaImpares = 0;
		//hago el bucle
		for(int contador = 100; contador <= 200; contador++) {
			if(contador % 2 == 0) {
				sumaPares = sumaPares + contador;
				System.out.print(contador);
				if(contador < 200) {
					System.out.print(" + ");
				}	
			}
		}
		System.out.println();
		for(int contador = 100; contador <= 200; contador++) { // hago este bucle para poder mostrar el proceso de suma de los impares
			if(contador % 2 != 0) {
				sumaImpares = sumaImpares + contador;
				System.out.print(contador);
				if(contador < 199) {
					System.out.print(" + ");
				}	
			}
		}
		
		System.out.println("\nLa suma de los pares es: " + sumaPares);
		System.out.println("La suma de los impares es: " + sumaImpares);

	}
}
