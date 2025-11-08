/*
 * Descripción: realizar un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe
 * brecha salarial entre ambos
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int COLUMNAS = 2;
		
		int numPersonas;
		
		System.out.print("Introduce el número de personas que quieres: ");
		numPersonas = teclado.nextInt();
		
		int personas[][];
		personas = new int[numPersonas][COLUMNAS];
		
		
		for(int filas = 0; filas < personas.length; filas++) {
			System.out.println("Persona " + (filas + 1) + ": ");
			
			System.out.println("Género (0 = hombre, 1 = mujer): ");
			personas[filas][0] = teclado.nextInt();
				
			System.out.println("Sueldo: ");
			personas[filas][1] = teclado.nextInt();
			
		}
		
		int sumaHombres = 0, sumaMujeres = 0, contadorHombres = 0, contadorMujeres = 0;
		
		for(int filas = 0; filas < personas.length; filas++) {
			
			if(personas[filas][0] == 0) { //hombres
				
				sumaHombres = sumaHombres + personas[filas][1];
				contadorHombres++;
				
			}
			
			if(personas[filas][0] == 1) { //mujeres
				
				sumaMujeres = sumaMujeres + personas[filas][1];
				contadorMujeres++;
				
			}
			
		}
		
		int mediaMujeres, mediaHombres;
		
		mediaMujeres = sumaMujeres / contadorMujeres;
		mediaHombres = sumaHombres / contadorHombres;
		
		System.out.println("La media de los sueldos de las mujeres es: " + mediaMujeres);
		System.out.println("La media de los sueldos de los hombres es: " + mediaHombres);

	}

}
