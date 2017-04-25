/**
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio03 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int[] n = new int[10];
	    int i;
	    
	    //Presentamos el programa
	    System.out.println("Introduzca 10 números enteros.");
	    System.out.println("Pulse la tecla INTRO después de introducir cada número.");

	    for (i = 0; i < 10; i++) {
	      n[i] = s.nextInt();
	    }
	    
	    System.out.println("\nLos números introducidos, en orden inverso, son los siguientes: ");
	    for (i = 9; i >= 0; i--) {
	      System.out.println(n[i]);
	    }
	}
}
