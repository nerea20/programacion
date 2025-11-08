/*
 * Descripción: realizar un programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €) 
 * mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad
 * Autora: Nerea
 * Fecha: 23/10/2025
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0, resto, contador500 = 0,  contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0;
		
		do {
			System.out.print("Introduce una cantidad en euros (tiene que ser múltiplo de 5): ");
			num = teclado.nextInt();
			
			if(!(num % 5 == 0)) {
				System.out.println("El número tiene que ser múltiplo de 5");
			}
			
		} while(num % 5 != 0);
		
		resto = num;
		
		do {
			
			if(resto >= 500) {
				resto = resto - 500;
				contador500++;
			} else if(resto >= 200) {
				resto = resto - 200;
				contador200++;
			} else if(resto >= 100) {
				resto = resto - 100;
				contador100++;
			} else if(resto >= 50) {
				resto = resto - 50;
				contador50++;
			} else if(resto >= 20) {
				resto = resto - 20;
				contador20++;
			} else if(resto >= 10) {
				resto = resto - 10;
				contador10++;
			} else if(resto >= 5) {
				resto = resto - 5;
				contador5++;
			} 
				
		} while(resto != 0);
		
		System.out.println("Para " + num + " euros, se necesitan ");
		
		if(contador500 > 0) {
			System.out.println(contador500 + " billetes de 500");
		} 
		if (contador200 > 0) {
			System.out.println(contador200 + " billetes de 200");
		} 
		if (contador100 > 0) {
			System.out.println(contador100 + " billetes de 100");
		}
		if (contador50 > 0) {
			System.out.println(contador50 + " billetes de 50");
		}
		if (contador20 > 0) {
			System.out.println(contador20 + " billetes de 20");
		} 
		if (contador10 > 0) {
			System.out.println(contador10 + " billetes de 10");
		}
		if (contador5 > 0) {
			System.out.println(contador5 + " billetes de 5");
		}

	}

}
