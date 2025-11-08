/*
 * Descripción: realizar un programa que calcula y escribe la suma y el producto de los 10 primeros números naturales
 * Autora: Nerea
 * Fecha: 20/10/2025
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		//creo las variables
		int suma = 0, producto = 1;
		//hago el bucle
		for(int contador = 1; contador <= 10; contador++) {
			suma = suma + contador;
			System.out.print(contador);
			if(contador < 10) {
				System.out.print(" + ");
			}
		}
		System.out.print("\n");
		for(int contador = 1; contador <= 10; contador++) {
			producto = producto * contador;
			System.out.print(contador);
			if(contador < 10) {
				System.out.print(" * ");
			}
		}
		
		System.out.println("\nEl total de la suma es: " + suma);
		System.out.println("El total del producto es: " + producto);

	}

}
