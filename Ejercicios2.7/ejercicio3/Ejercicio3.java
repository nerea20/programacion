/*
 * Descripción: realizar un programa que pida una nota e indiquemoc las calificación correspondiente usando switch
 * Autora: Nerea
 * Fecha: 08/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int nota;
		String notaTexto;
		//pido los datos
		System.out.print("Dime la nota: ");
		nota = teclado.nextInt();
		//hago el switch
		switch (nota) {
			case 1,2,3,4:{
				notaTexto = "Insuficiente";
				break;
			}
			case 5:{
				notaTexto = "Suficiente";
				break;
			}
			case 6:{
				notaTexto = "Bien";
				break;
			}
			case 7,8:{
				notaTexto = "Notable";
				break;
			}
			case 9,10:{
				notaTexto = "Sobresaliente";
				break;
			}
			default:{
				notaTexto = "Valor incorrecto";
			}
		}
		if(notaTexto.equals("Valor incorrecto")) {
			System.out.println("Valor incorrecto");
		} else {
			System.out.println("La nota es: " + notaTexto);
		}
		

	}

}
