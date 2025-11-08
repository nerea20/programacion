/*
 * Descripción: realizar un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas) 
 * formado por la concatenación de las tres primeras letras de cada uno de ellos
 * Autora: Nerea
 * Fecha: 05/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellido1, apellido2;
		
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduce tu primer apellido: ");
		apellido1 = teclado.nextLine();
		System.out.print("Introduce tu segundo apellido: ");
		apellido2 = teclado.nextLine();
		
		String primerasTresLetrasNombre = nombre.substring(0,3);
		String primerasTresLetrasApellido1 = apellido1.substring(0,3);
		String primerasTresLetrasApellido2 = apellido2.substring(0,3);
		
		String codigo = primerasTresLetrasNombre.concat(primerasTresLetrasApellido1).concat(primerasTresLetrasApellido2);
		
		System.out.println(codigo.toUpperCase());
		

	}

}
