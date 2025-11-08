package entradaDatos;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dame tu edad: ");
		edadAlumno = teclado.nextInt();
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine(); // Después de pedir valor numérico y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.print("Dame tu nombre: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		double pesoAlumno;
		System.out.println("Dame tu peso: ");
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso es: " + pesoAlumno);

	}

}
