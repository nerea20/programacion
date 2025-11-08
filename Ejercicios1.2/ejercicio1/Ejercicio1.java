/*
 * Descripción: realizar un programa en java el cual haciendo uso de la entrada estándar solicite datos se almacenaran en una variable del tipo
Y mostraremos por pantalla los valores 
 * Autora: Nerea
 * Fecha: 25/09/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Declaro las variables según su tipo
		String nombre, apellidos, direccion;
		int edad;
		double altura,peso;
		// Pido que me den los datos
		System.out.print("Dame tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Dame tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Dame tu dirección: ");
		direccion = teclado.nextLine();
		System.out.print("Dame tu edad: ");
		edad = teclado.nextInt();
		System.out.print("Dame tu altura: ");
		altura = teclado.nextDouble();
		System.out.print("Dame tu peso: ");
		peso = teclado.nextDouble();
		//Muestro por pantalla los valores
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Dirección: " + direccion);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		

	}

}
