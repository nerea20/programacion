package ejemploFor;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero = teclado.nextInt();
		
		for(int contador = 10; contador >= 1; contador--) {
			System.out.println(numero + " multipilcado por " + contador + " = " + numero*contador);
		}

	}

}
