/*
 * Descripción: realizar un programa que mejore el anterior
 * Autora: Nerea
 * Fecha: 08/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre, apellidos;
		byte edad, añosExperiencia;
		int  proyectosTrabajados;
		double salarioDeseado;
		//pido los datos
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe tu edad: ");
		edad = teclado.nextByte();
		System.out.print("Escribe cual sería tu salario deseado: ");
		salarioDeseado = teclado.nextDouble();
		//hago las condicionales
		if(salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			System.out.print("Escribe tus años de experiencia: ");
			añosExperiencia = teclado.nextByte();
			System.out.print("Escribe en que proyectos has trabajado anteriormente: ");
			proyectosTrabajados = teclado.nextInt();
			if (añosExperiencia > 2 && proyectosTrabajados > 3) {
				System.out.println("Enhorabuena. Ha sido contratado.");
				if(añosExperiencia > 5 || proyectosTrabajados > 5) {
					System.out.println("Su salario será de 30.000 euros");
				} else {
					System.out.println("Su salario será de 25.000 euros");
				}
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
			}
		}

	}
}
