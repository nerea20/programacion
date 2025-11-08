package ejemploFor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numInicio, numFinal;
		System.out.print("Introduce el número de inicio: ");
		numInicio = teclado.nextInt();
		System.out.print("Introduce el número del final: ");
		numFinal = teclado.nextInt();
		
		for(int contador = numInicio; contador <= numFinal; contador++) {
			System.out.println("Analizando el valor " + contador);
			if(contador % 5 == 0) {
				System.out.println("       "+contador + " es múltiplo de 5 ");
			}
			
		}

	}

}
