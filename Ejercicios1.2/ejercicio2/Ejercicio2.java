/*
 * Descripción: realizar un programa que solicite al usuario datos relativos a un equipo de fútbol y mostrarlos por pantalla
 * Autora: Nerea
 * Fecha: 25/09/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaro las variables según su tipo
		String nombreEquipo, nombreEstadio, nombreCapitan;
		int añoFundacion;
		//Pido los datos
		System.out.print("Dame el nombre del equipo: ");
		nombreEquipo = teclado.nextLine();
		System.out.print("Dime el año de fundación: ");
		añoFundacion = teclado.nextInt();
		teclado.nextLine(); //libero el buffer
		System.out.print("Dime el nombre del estadio: ");
		nombreEstadio = teclado.nextLine();
		System.out.print("Dime el nombre del capitán: ");
		nombreCapitan = teclado.nextLine();
		//Muestro por pantalla los datos
		System.out.println("*************************************************");
		System.out.println("*******Nombre del equipo: " + nombreEquipo + "*************");
		System.out.println("*******Fundado en: " + añoFundacion + "*******************");
		System.out.println("*******Estadio: " + nombreEstadio + "********************");
		System.out.println("*******Capitán: " + nombreCapitan + "********************");

	}

}
