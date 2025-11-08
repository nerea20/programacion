/*
 * Descripción: 
 * Autora: Nerea
 * Fecha: 22/10/2025
 */
package matrices;

public class Temperatura {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS = 30;
		
		int diaMasCalor = 0, tempMasAlta, diaTemp10 = 0;
		
		int [][] temperatura; //Declaración de un array bidimensional
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
		
		for(int mes = 0; mes < temperatura.length; mes++) {       //Inicialización
			for(int dia = 0; dia < temperatura[mes].length; dia++) {
				temperatura[mes][dia] =  (int) (Math.random()*40);
			}
		}
		
		for(int mes = 0; mes < temperatura.length; mes++) {       //Mostrar las temperaturas
			for(int dia = 0; dia < temperatura[mes].length; dia++) {
				System.out.print(temperatura[mes][dia] + "\t");
			}
			System.out.println();
		}
		for(int mes = 0; mes < temperatura.length; mes++) {      //Muestra la temperatura mas alta 
			tempMasAlta = temperatura[mes][0]; // cada mes inicializo la temperatura más alta a la temperatura del primer día
			for(int dia = 1; dia < temperatura[mes].length; dia++) { // empiezo a comprar temperaturas a partir del segundo día
				if(tempMasAlta < temperatura[mes][dia]) {
					tempMasAlta = temperatura[mes][dia];
					diaMasCalor = dia;
				}
			}
			System.out.println("El dia " + diaMasCalor + " hubo " + tempMasAlta + " grados");
		}
		
		//Para cada mes, mostrar el primer día con temperatura inferior a 10 grados
		
		for(int mes = 0; mes < temperatura.length; mes++) {
			diaTemp10 = -1; // se inicializa así para que al entrar al bucle lo compare con la posion 0 no con la 1
			do {
				diaTemp10++;
			}while (temperatura[mes][diaTemp10] >= 10);
				
			System.out.println("Para el mes " + mes + " el dia con menos de 10 grados es " + diaTemp10);
		}
	}

}
