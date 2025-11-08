/*
 * Descripción: realizar un programa que solicite unos datos y a partir de esos datos clacule el salario neto y lo muestre
 * Autora: Nerea
 * Fecha: 01/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//creo las variables
		String nombre, apellidos, fechaNacimiento;
		double salarioBruto, salarioNeto, aumento, salarioTotal;
		byte tiempoEnLaEmpresa;
		//pido los datos
		System.out.print("Escribe tu nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Escribe tus apellidos: ");
		apellidos = teclado.nextLine();
		System.out.print("Escribe tu fecha de nacimiento: ");
		fechaNacimiento = teclado.nextLine();
		System.out.print("Escribe tu salario bruto: ");
		salarioBruto = teclado.nextInt();
		System.out.print("Escribe los años trabajando en la empresa: ");
		tiempoEnLaEmpresa = teclado.nextByte();
		//hago el cálculo
		salarioNeto = salarioBruto - (salarioBruto * 0.15);
		aumento = salarioBruto * (tiempoEnLaEmpresa * 0.02);
		salarioTotal = salarioNeto + aumento;
		//muestro los datos
		System.out.println("Estimado " + nombre + " " + apellidos + ", su salario bruto es " + salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto);
		System.out.println("Debido a sus " + tiempoEnLaEmpresa + " años trabajando en la empresa su salario se incrementará un 2% por cada año. El aumento es de " + aumento + " y el salario total es " + salarioTotal);

	}

}
