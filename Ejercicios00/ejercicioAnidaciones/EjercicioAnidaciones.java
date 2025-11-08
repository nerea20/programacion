package ejercicioAnidaciones;

import java.util.Scanner;

public class EjercicioAnidaciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		int numAciertos, numFallos, preguntasTotales;
		double restaFallos, notaFinal;
		System.out.print("Escribe el número de preguntas acertadas: ");
		numAciertos = teclado.nextInt();
		System.out.print("Escribe el número de preguntas falladas: ");
		numFallos = teclado.nextInt();
		
		preguntasTotales = numAciertos + numFallos;

		if(preguntasTotales <= 20) {
			notaFinal = (numAciertos * 0.5) - (numFallos * 0.25);
			System.out.print("La nota final es: " + notaFinal);
			if(notaFinal < 10){
				System.out.print(" Suspenso");
			}else if(notaFinal >= 10){
				System.out.print(" Aprobado");
			}
		}else {
			System.out.println("Datos errroneos");
		}
	}

}
