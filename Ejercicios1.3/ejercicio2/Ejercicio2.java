/*
 * Descripción: realizar un programa que solicite euros y pasarlos a pesetas y viceversa
 * Autora: Nerea
 * Fecha: 01/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		double euros, pesetas;
		//pido los datos
		System.out.print("Cantidad en euros: ");
		euros = teclado.nextDouble();
		//muestro el calculo pasando los euros a pesetas
		pesetas = euros * 166.386;
		System.out.println(euros + " euros son " + pesetas + " pesetas");
		//ahora hago lo contrario, pido las pesetas
		System.out.print("Cantidad en pesetas: ");
		pesetas = teclado.nextDouble();
		//ahora muestro el calculo de pesetas a euros
		euros = pesetas / 166.386;
		System.out.println(pesetas + " pesetas son " + euros + " euros");

	}

}
