/*
 * Descripción: realizar un programa que  el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numUsuario, numOrdenador, mayor = 100, menor = 0;
		String respuesta;
		
		do {
			numOrdenador = (mayor + menor) / 2 ;
			System.out.println("¿Es el número?: " + numOrdenador);
			System.out.print("Dime si es mayor, menor o igual: ");
			respuesta = teclado.nextLine().toLowerCase();
			
			if(respuesta.equals("mayor")) {
				menor = numOrdenador + 1;
			} else if (respuesta.equals("menor")){
				mayor = numOrdenador - 1;
			} else if(!respuesta.equals("igual")) {
				System.out.println("Respuesta no válida");
			} 
			
		}while(!respuesta.equalsIgnoreCase("igual"));
		
		System.out.println("Tomaaaa he acertado");
	}

}
