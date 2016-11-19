/**
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *     
 *     1
 *    121
 *   12321
 *  1234321
 *  
 * @author Manuel
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio24 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa vamos a realizar una pirámide de números.");
	    System.out.print("Introduzca la altura de la pirámide:");
	    int alturaIntroducida = s.nextInt();

	    int altura = 1;
	    int i = 0;
	    int espacios = alturaIntroducida - 1;
	    
	    while (altura <= alturaIntroducida) {
	      
	      //Con este bucle for pintamos los espacios.
	      for (i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
	      
	      //Con este otro bucle pintamos la línea; teniendo en cuenta que este programa es parecido al de las piramides con caracteres.
	      for (i = 1; i < altura; i++) {
	        System.out.print(i);
	      }
	      
	      for (i = altura; i > 0; i--) {
	        System.out.print(i);
	      }
	      
	      System.out.println();
	      
	      altura++;
	      espacios--;
	    }
	}
}
