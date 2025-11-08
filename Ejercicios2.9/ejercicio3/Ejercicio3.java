/*
 * Descripción: realizar un programa que muestre los números pares comprendidos entre el 1 y el 200 utiliza un contador sumando de 1 en 1
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio3;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		//hago el bucle
			for(int contador = 1; contador <= 200; contador++) {
				if(contador % 2 == 0) {
					System.out.print(contador + " ");
				}
				
			}
	}

}
