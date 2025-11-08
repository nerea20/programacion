/*
 * Descripción: realizar un programa que solicite dos números y con un menú de selección elegirá que operación quiere realizar
 * Autora: Nerea
 * Fecha: 09/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		double num1, num2, resultado;
		byte operacion;
		//pido los datos
		System.out.print("Introduzca el valor1: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduzca el valor2: ");
		num2 = teclado.nextDouble();
		System.out.println("Indique la operación que quiere realizar (Inserte un número): ");
		System.out.println("(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) División");
		operacion = teclado.nextByte();
		System.out.println("--------------------------------");
		
		switch (operacion) {
			case 1:{
				resultado = num1 + num2;
				break;
			}
			case 2:{
				resultado = num1 - num2;
				break;
			}
			case 3:{
				resultado = num1 * num2;
				break;
			}
			case 4:{
				resultado = num1 / num2;
				break;
			}
			default:{
				resultado = 0;
			}
		}
		if(operacion < 1 || operacion > 4) {
			System.out.println("Valor incorrecto");
		} else {
			System.out.println("Resultado: " + resultado);
		}

	}

}
