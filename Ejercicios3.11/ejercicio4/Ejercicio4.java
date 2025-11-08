/*
 * Descripción: realizar un programa que almacene las notas de 4 alumnos (llamados “Alumno1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 * Autora: Nerea
 * Fecha: 30/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int ALUMNOS = 4;
		final int ASIGNATURAS = 5;
		
		double notas [][];
		notas = new double[ALUMNOS][ASIGNATURAS];
		
		double minima1, maxima1, media1 = 0, minima2, maxima2, media2 = 0, minima3, maxima3, media3 = 0, minima4, maxima4, media4 = 0;
		double suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0;
		
		for(int filas = 0; filas < notas.length; filas++) {
			for(int columnas = 0; columnas < notas[0].length; columnas++) {
				
				System.out.println("Introduce las notas para el alumno " + (filas + 1) + ": ");
				notas[filas][columnas] = teclado.nextDouble();
				
			}
		}
		
		minima1 = notas[0][0];
		maxima1 = notas[0][0];
		minima2 = notas[0][0];
		maxima2 = notas[0][0];
		minima3 = notas[0][0];
		maxima3 = notas[0][0];
		minima4 = notas[0][0];
		maxima4 = notas[0][0];
		
		for(int filas = 0; filas < notas.length; filas++) {
			for(int columnas = 0; columnas < notas[0].length; columnas++) {
				
				if(minima1 > notas[0][columnas]) {
					minima1 = notas[0][columnas];
				} else if(maxima1 < notas[0][columnas]) {
					maxima1 = notas[0][columnas];
				}
				
				if(minima2 > notas[1][columnas]) {
					minima2 = notas[1][columnas];
				} else if(maxima2 < notas[1][columnas]) {
					maxima2 = notas[1][columnas];
				}
				
				if(minima3 > notas[2][columnas]) {
					minima3 = notas[2][columnas];
				} else if(maxima3 < notas[2][columnas]) {
					maxima3 = notas[2][columnas];
				}
				
				if(minima4 > notas[3][columnas]) {
					minima4 = notas[3][columnas];
				} else if(maxima4 < notas[3][columnas]) {
					maxima4 = notas[3][columnas];
				}
				
			}
		}
		
		
		for(int columnas = 0; columnas < notas[0].length; columnas++) {
				
			suma1 =  suma1 + notas[0][columnas];
			suma2 =  suma2 + notas[1][columnas];
			suma3 =  suma3 + notas[2][columnas];
			suma4 =  suma4 + notas[3][columnas];
				
		}
		
		
				
			media1 = suma1 / notas[0].length;
			media2 = suma2 / notas[0].length;
			media3 = suma3 / notas[0].length;		
			media4 = suma4 / notas[0].length;
				
		
		System.out.println("La nota máxima del alumno 1 es: " + maxima1 + " la nota mínima es: " + minima1 + " y su media es de: " + media1);
		System.out.println("La nota máxima del alumno 2 es: " + maxima2 + " la nota mínima es: " + minima2 + " y su media es de: " + media2);
		System.out.println("La nota máxima del alumno 3 es: " + maxima3 + " la nota mínima es: " + minima3 + " y su media es de: " + media3);
		System.out.println("La nota máxima del alumno 4 es: " + maxima4 + " la nota mínima es: " + minima4 + " y su media es de: " + media4);

	}

}
