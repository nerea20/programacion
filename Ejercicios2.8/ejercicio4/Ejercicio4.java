/*
 * Descripción: realizar un programa que intoduzca valores y los sume hata que el usuario introduzca un 0
 * Autora: Nerea
 * Fecha: 15/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int  contador = 0;
		double media, numero, suma = 0;
		//hago el bucle 
		System.out.print("Introduce un número positivo: ");
		numero = teclado.nextInt();
		while(numero != 0 && numero > 0) {
			suma = suma + numero;
			System.out.print("Introduce un número positivo: ");
			numero = teclado.nextInt();
			contador++;
		}
		if(numero >= 0) {
			System.out.println("La suma de los números es: " + suma);
			System.out.println("Has intoducido " + contador + " números");
			media = suma / contador;
			System.out.println("La media de los números es: " + media);
		}else {
			System.out.print("He pedido números positivos, no negativos");
		}

	}

}
