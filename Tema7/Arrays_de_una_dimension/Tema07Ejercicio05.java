/**
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 * 
 * @author Manuel Cerezo
 *
 */
import java.util.Scanner;

public class Tema07Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, le pediremos que introduzca 10 números por teclado.");
		System.out.print("\nLe mostraremos los 10 números que ha introducido y también el valor máximo y mínimo.");
		System.out.print("\n-------------------------------------------------------------------------------------");
		
		//Declaramos variables y array.
		int[] num = new int[10];
		
		int i;
		int contador = 10;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		//Empezamos con los bucles para pedir los números y comprobar el máximo y el mínimo.
		for(i = 0; i < 10; i++) {
			System.out.print("\nInserte un número. Le quedan " + contador + " números: ");
			num[i] = s.nextInt();
			contador--;
			
			if (num[i] < minimo) {
				minimo = num[i];
			} 
			
			if(num[i] > maximo) {
				maximo = num[i];
			}
			
			
		}
		
		
		//Mostramos por pantalla los valores del array introducidos por teclado y el máximo y mínimo
		for(i = 0; i < 10; i++) {
			System.out.print("\n " + num[i]);
			
			if (num[i] == minimo) {
		        System.out.print(" mínimo");
		    }
		      
		    if (num[i] == maximo) {
		        System.out.print(" máximo");
		    }
		}
		
		
	}
}
