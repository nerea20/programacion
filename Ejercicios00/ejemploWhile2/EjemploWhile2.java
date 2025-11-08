package ejemploWhile2;

import java.util.Scanner;

public class EjemploWhile2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numInicio, numFinal, contador;
		
		System.out.print("Introduce el inicio: ");
		numInicio = teclado.nextInt();
		System.out.print("Introduce el fin: ");
		numFinal = teclado.nextInt();
		
		contador = numInicio;
		
		if(numInicio < numFinal) {
			while(contador <= numFinal) {
				System.out.print(" "+ contador + " ");
				contador++;
			}
		} else {
			while(contador >= numFinal) {
				System.out.print(" "+ contador + " ");
				contador--;
		}

	}

}
}