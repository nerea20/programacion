/*
 * Descripción: realizar un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,cuantas ‘e’, etc.) 
 * en una frase introducida por teclado. No se debe diferenciar entre mayúsculas y minúsculas.
 * Autora: Nerea
 * Fecha: 05/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		
		System.out.print("Introduce una frase: ");
		frase = teclado.nextLine().toLowerCase();
		
		for(int indice = 0; indice < frase.length(); indice++) {
			
			char vocales = frase.charAt(indice); //recorra todas las letras de la frase
			
			if(vocales == 'a') {
				contadorA++;
			} else if (vocales == 'e') {
				contadorE++;
			} else if (vocales == 'i') {
				contadorI++;
			} else if (vocales == 'o') {
				contadorO++;
			} else if (vocales == 'u') {
				contadorU++;
			}
			
			
		}
		
		System.out.println("Nº de A's: " + contadorA);
		System.out.println("Nº de E's: " + contadorE);
		System.out.println("Nº de I's: " + contadorI);
		System.out.println("Nº de O's: " + contadorO);
		System.out.println("Nº de U's: " + contadorU);
		

	}

}
