/*
 * Descripción: realizar un programa que  calcule el valor A elevado a B (A^B) sin hacer uso del operador de
 * potencia (^), siendo A y B valores introducidos por teclado
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int base, exponente, resultado = 1; //creo las variables
		
		System.out.print("Introduce la base: "); // pido los datos
		base = teclado.nextInt();
		System.out.print("Introduce el exponente: ");
		exponente = teclado.nextInt();
		
		for(int contador = 1; contador <= exponente; contador++) { // hago el bucle 
			resultado = resultado * base;
		}
		
		System.out.println(base + " elevado a " + exponente + " es: " + resultado);
		

	}

}
