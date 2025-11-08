/*
 * Descripción: realizar una aplicación de senderismo
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre, apellidos, ciudad, ciudadLarga = "";
		int edad, numRutas, numParticipantes;
		double distanciaUltimaRuta, distanciaRuta, suma = 0, media, distanciaLarga;
		
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduce tus apellidos: ");
		apellidos = teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		while(edad < 17 || edad > 45){
			System.out.println("Esa edad no es correcta");
			System.out.print("Introduce tu edad: ");
			edad = teclado.nextInt();
		}
		
		System.out.print("Introduce el número de rutas que has realizado: ");
		numRutas = teclado.nextInt();
		System.out.print("Introduce la distancia de tu última ruta: ");
		distanciaUltimaRuta = teclado.nextDouble();
		
		distanciaLarga = 0;
		for(int contador = 1; contador <= 5; contador++) {
			System.out.print("Distancia de la ruta " + contador + ": ");
			distanciaRuta = teclado.nextDouble();
			System.out.print("Número de participantes de la ruta" + contador + ": ");
			numParticipantes = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Ciudad de la ruta " + contador + ": ");
			ciudad = teclado.nextLine();
			suma = suma + distanciaRuta;
			if (distanciaRuta > distanciaLarga) {
				distanciaLarga = distanciaRuta;
				ciudadLarga = ciudad;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + numRutas);
		media = suma / 5;
		System.out.println("\nDistancia media (5 últimas rutas): " + media);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaLarga);
		System.out.println("Ciudad de la ruta más larga: " + ciudadLarga);
		System.out.println("----------------------------");
		
		
		
	}

}
