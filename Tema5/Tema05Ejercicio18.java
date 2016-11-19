/**
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 * 
 * @author Manuel
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Declaro ambas variables fuera del bucle, porque si las declarase dentro estas solo servirían dentro del mismo bucle y no fuera.
		int primerNumero;
		int segundoNumero;
		
		//Con este bucle, lo que hacemos es pedir los dos números además de comprobar que ambos son diferentes.
		do{
			System.out.print("Introduzca el primer numero: ");
			primerNumero = s.nextInt();
			System.out.print("Introduzca el segundo numero (diferente al primero): ");
			segundoNumero = s.nextInt();
			
			if (primerNumero == segundoNumero) {
				System.out.print("Por favor, vuelva a introducir los numeros. Ambos han de ser diferentes.");
			}
		} while (primerNumero == segundoNumero);
		
		//En el caso de que el primerNumero sea mayor que el segundoNumero, hacemos que los valores se intercambien entre sí.
		
		if (primerNumero > segundoNumero) {
			int aux = primerNumero;
		    primerNumero = segundoNumero;
		    segundoNumero = aux;
		}
		
		//Ahora creamos un bucle for para ir incrementando de 7 en 7
		for (int i = primerNumero; i <= segundoNumero; i += 7) {
			System.out.print(i + ", ");
		}
	}
}
