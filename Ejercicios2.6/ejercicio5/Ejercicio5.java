/*
 * Descripción: realizar un programa en el pide una nota y le dice el tipo de nota que tiene
 * Autora: Nerea
 * Fecha: 06/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre, apellidos, cicloFormativo;
		int nota;
		//pido los datos
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe en que ciclo formativo estas: ");
		cicloFormativo = teclado.nextLine();
		System.out.print("Escribe la nota que tienes: ");
		nota = teclado.nextInt();
		//indico cual es la nota
		System.out.println("-------------------------------------");
		System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo Formativo: " + cicloFormativo + "\nNota Académica: " + nota);
		if(nota <= 4) {
			System.out.print("(Insuficiente)");
		} else if(nota == 5){
			System.out.print("(Aprobado)");
		} else if(nota == 6) {
			System.out.print("(Bien)");
		} else if(nota >= 7 && nota < 9) {
			System.out.print("(Notable)");
		} else{
			System.out.print("(Sobresaliente)");
		}
		System.out.println("\n-------------------------------------");

	}

}
