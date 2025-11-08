/*
 * Descripción: realizar un programa creando un tipo enumerado y 4 variables y mostrando el valor
 * Autora: Nerea
 * Fecha: 25/09/2025
 */
package ejercicio4;

public class Ejercicio4 {
	public enum Talla{PEQUEÑA, MEDIANA, GRANDE, EXTRA_GRANDE}
	public static void main(String[] args) {
		
		Talla tallaPequena = Talla.PEQUEÑA;
		Talla tallaMediana = Talla.MEDIANA;
		Talla tallaGrande = Talla.GRANDE;
		Talla tallaExtra = Talla.EXTRA_GRANDE;
		
		System.out.println("La variable tallaPequeña tiene el valor: " + tallaPequena);
		System.out.println("La variable tallaMediana tiene el valor: " + tallaMediana);
		System.out.println("La variable tallaGrande tiene el valor: " + tallaGrande);
		System.out.println("La variable tallaExtra tiene el valor: " + tallaExtra);

	}

}
