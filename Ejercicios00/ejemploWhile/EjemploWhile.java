package ejemploWhile;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, suma = 0, contador;
		System.out.print("Dame un número: ");
		num = teclado.nextInt();
		contador = 1;
		suma = num;
		
		while(num != 0 && contador != 3) {
			System.out.print("Dame un número: ");
			num = teclado.nextInt();
			contador++;
			suma = suma + num; //acumulador
		}
		System.out.println("La suma es: " + suma);

	}

}
