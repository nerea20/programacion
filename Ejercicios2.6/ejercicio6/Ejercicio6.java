/*
 * Descripción: realizar un programa que mejore el anterior
 * Autora: Nerea
 * Fecha: 08/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

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
		
		if(nota < 0 || nota > 10) {
			System.out.println("La nota académica indicada es incorrecta");
		} else {
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
			} else if(nota == 9){
				System.out.print("(Sobresaliente)");
			} else {
				System.out.println(" (Matrícula de honor)");
			}
		}
		
		System.out.println("\n-------------------------------------");

	}

}

