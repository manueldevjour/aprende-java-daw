/**
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio09 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, le pediremos 8 números enteros.");
		System.out.print("\nEl programa mostrará por pantalla los números y especificará si es par o impar.");
		System.out.print("\n-----------------------------------------------------------------------------");
		s.nextLine();
		
		//Declaramos el array y las variables que vamos a necesitar.
		int[] num = new int[8];
		int i;
		int contador = 8;
		
		//Primer bucle para pedir los números necesarios. El contador es algo estético.
		for(i = 0; i < 8; i++) {
			System.out.print("Introduzca el número que desee. Le quedan " + contador + " números por introducir:");
			num[i] = s.nextInt();
			contador--;
		}
		
		//Este segundo bucle muestra los valores del array por pantalla, además de especificar si el número es par o impar.
		for(i = 0; i < 8; i++) {
			System.out.print("\n" + num[i]);
			if (num[i] % 2 == 0) {
				System.out.print(" --> Par");
			} else {
				System.out.print(" --> Impar");
			}
		}
	}
}
