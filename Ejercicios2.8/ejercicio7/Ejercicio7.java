/*
 * Descripción: realizar un programa que realice un juego para adivinar un número entero
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las varibales
		int numAleatorio, numUsuario = 0;
		//creo el número aleatorio
		numAleatorio = (int)(Math.random() * 50);
	
		System.out.println(numAleatorio);
		//hago el bucle
		do {
			System.out.print("Adivina el número que estoy pensado (está entre 0 y 50): ");
			numUsuario = teclado.nextInt();
			if(numUsuario > numAleatorio) {
				System.out.println("El número que estoy pensando es menor");
			} else if (numUsuario < numAleatorio) {
				System.out.println("El número que estoy pensando es mayor");
			} else {
				System.out.println("Eso es. ");
			}
		}while(numUsuario != numAleatorio);
		System.out.println("Enhoorabuena los has adivinado: " + numAleatorio);

	}

}
