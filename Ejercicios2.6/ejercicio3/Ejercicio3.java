/*
 * Descripción: realizar un programa que solicite varios datos y usando las condicinales vemos si es admitido o no
 * Autora: Nerea
 * Fecha: 06/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		byte edad;
		String nombre, apellidos;
		//pido los datos
		System.out.print("¿Cuál es tu edad?: ");
		edad = teclado.nextByte();
		//limpio el scanner
		teclado.nextLine();
		//compruebo si es mayor de edad
		if(edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios");
		} else {
			System.out.print("Escribe tu nombre: ");
			nombre = teclado.nextLine();
			System.out.print("Escribe tus apellidos: ");
			apellidos = teclado.nextLine();
			System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nUsted ha sido admitido");
		}

	}

}
