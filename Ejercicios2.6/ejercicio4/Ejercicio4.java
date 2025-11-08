/*
 * Descripción: realizar un programa en el que un supermercado quiere premiar a los clientes que mayor desembolso hacen en sus tienda
 * Autora: Nerea
 * Fecha: 06/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre, apellidos;
		double ImporteGastado1, ImporteGastado2, ImporteGastado3, ImporteGastado4, sumaImportes, media;
		//pido los datos
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe el importe gastado en la primera compra: ");
		ImporteGastado1 = teclado.nextDouble();
		System.out.print("Escribe el importe gastado en la segunda compra: ");
		ImporteGastado2 = teclado.nextDouble();
		System.out.print("Escribe el importe gastado en la tercera compra: ");
		ImporteGastado3 = teclado.nextDouble();
		System.out.print("Escribe el importe gastado en la cuarta compra: ");
		ImporteGastado4 = teclado.nextDouble();
		//realizo las acciones
		sumaImportes = ImporteGastado1 + ImporteGastado2 + ImporteGastado3 + ImporteGastado4;
		media = sumaImportes / 4;
		//comprobar si el importe es mayor o igual a 300
		System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nImporte Gastado1: " + ImporteGastado1 + "\nImporte Gastado2: " + ImporteGastado2 + "\nImporte Gastado3: " + ImporteGastado3 + "\nImporte Gastado4: " + ImporteGastado4 + "\nImporte medio: " + media);
		if(sumaImportes >= 300) {
			System.out.println("Has alanzado los 300 euros. Enhorabuena has ganado un vale de descuento de 50 euros");
		} else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone del descuento");
		}

	}

}
