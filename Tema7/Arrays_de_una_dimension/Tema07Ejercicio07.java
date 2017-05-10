/**
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio07 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int[] num = new int[100];
		
		
		int i;
		
		//
		for(i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 21);
			System.out.print(num[i] + " ");
		}//Fin del primer bucle for
		
		System.out.print("\nA continuación, escriba un número de los que ha mostrado.");
		int numA = s.nextInt();
		System.out.print("\nEscriba el número por el que quiere sustituirlo.");
		int numB = s.nextInt();
		
		System.out.println();
		
		for(i = 0; i < 100; i++) {
			if(num[i] == numA) {
				num[i] = numB;
				System.out.print("\"" + numB + "\" ");
			} else {
				System.out.print(num[i] + " ");
			}
		}
		
		
	}
}
