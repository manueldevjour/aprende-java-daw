/**
 * 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * Ejemplo:
 * Introduzca la altura de la L: 5
 *    
 *    *
 *    *
 *    *
 *    *
 *    * * *
 *    
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio31 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("En este programa dibujaremos una L con la altura que desee.");
		System.out.print("\n-----------------------------------------------------------");
		
		System.out.print("\nIntroduzca la altura de la letra L: ");
		int altura = Integer.parseInt(s.nextLine());
		
		//Dibujamos la línea vertical
		for (int i = 1; i < altura; i++) {
			System.out.print("*");
			System.out.println();
		}
		
		//Dibujamos la línea horizontal
		for (int j = 1; j <= ((altura/2)+1); j++) {
			System.out.print("*");
			System.out.print(" ");
		}
	}
}
