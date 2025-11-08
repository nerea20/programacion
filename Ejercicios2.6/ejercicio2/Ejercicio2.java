/*
 * Descripción: realizar un programa que solicite varios datos y usando als condicinales digamos si ha sido admitido o no
 * Autora: Nerea
 * Fecha: 06/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre;
		byte edad;
		double nota;
		//pido los datos
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tu edad: ");
		edad = teclado.nextByte();
		System.out.print("Escribe tu nota académica: ");
		nota = teclado.nextDouble();
		//compruebo si los datos cumplen las condiciones
		if(edad > 18 && nota > 7) {
			System.out.println(nombre + ", usted ha sido admitido/a en el curso, cumple las condiciones requeridas");
		} else {
			System.out.println(nombre + ", lo sentimos, no ha sido admitido/a en el curso ya que no cumple los requisitos mínimos");
		}

	}

}
