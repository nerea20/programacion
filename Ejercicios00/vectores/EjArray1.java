/*
 * 
 */
package vectores;

public class EjArray1 {

	public static void main(String[] args) {
		final int TAMAYIO = 20;
		
		int[] numeros; // Declaramos array de enteros
		numeros = new int[TAMAYIO]; // Instanciamos el array
		
		
		for (int posicion = 0; posicion < numeros.length; posicion++) {
			numeros[posicion] =  (int) (Math.random()*50); // Inicializamoscon numeros random las posiciones
		}
		
		for(int posicion = 0; posicion < numeros.length; posicion++) {
			System.out.println("El valor de la posicion " + posicion + " es: " + numeros[posicion]); 
		}

	}

}
