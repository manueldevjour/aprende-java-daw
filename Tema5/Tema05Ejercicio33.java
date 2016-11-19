/**
 * 
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio33 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la U: ");
	    int altura = s.nextInt();

	    //Pintamos los palos verticales de la U.
	    for (int i = 1; i < altura; i++) {
	      System.out.print("* ");
	      for (int j = 2; j < altura; j++) {
	        System.out.print("  ");
	      }
	      System.out.println("*");
	    }

	    //Pintamos la base de la U.
	    System.out.print("  ");
	    for (int i = 2; i < altura; i++) {
	      System.out.print("* ");
	    }
	}
}
