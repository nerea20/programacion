/*
 * Descripción: realizar un programa que pida la nota media y si supera el 8 hace una cosa y si no otra
 * Autora: Nerea
 * Fecha: 08/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		double notaBd, notaProg, notaLm, notaSis, media;
		//pido los datos
		System.out.print("Escribe la nota que tienes en base de datos: ");
		notaBd = teclado.nextDouble();
		System.out.print("Escribe la nota que tienes en programación: ");
		notaProg = teclado.nextDouble();
		System.out.print("Escribe la nota que tienes en lenguaje de marcas: ");
		notaLm = teclado.nextDouble();
		System.out.print("Escribe la nota que tienes en sistemas: ");
		notaSis = teclado.nextDouble();
		//hago los cálculos
		media = (notaBd + notaProg + notaLm + notaSis)/4;
		System.out.println("Tu nota media es: " + media);
		System.out.println("Tu nota media redondeada hacia arriba es: " + Math.ceil(media));
		System.out.println("Tu nota media redondeada hacia abajo es: " + Math.floor(media));
		//hago la condicional
		if(media > 8) {
			System.out.println("Enhorabuena puedes acceder a los estudios superiores");
		} else {
			System.out.println("Lo siento tu nota no te da para acceder a los estudios superiores");
		}
	}

}
