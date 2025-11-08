/*
 * Descripción: realizar un programa que pida el dia de la semana y si es jueves se lo dices
 * Autora: Nerea
 * Fecha: 02/10/2025
 */
package estructurasIf;

import java.util.Scanner;

public class PrimerProgramaIf {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String dia;
		System.out.print("Dime un día de la semana: ");
		dia = teclado.nextLine();
		
		if(dia.equals("jueves") || dia.equals("Jueves") || dia.equals("JUEVES")) {
			System.out.println("Efectivamente hoy es jueves");
		}

	}

}
