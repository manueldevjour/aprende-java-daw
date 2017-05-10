/**
 * 
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor
 * o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio35 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la altura de la X: ");
	    int alturaIntroducida = s.nextInt();

	    int altura = 1;
	    int i = 0;
	    int espaciosInternos = alturaIntroducida - 1;
	    int espaciosPorDelante = 0;

	    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
	      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
	    } else {
	      //Usamos este while para la parte de arriba de la X.
	      while (altura < alturaIntroducida / 2 + 1) {
	        
	        //Insertamos los espacios por delante
	        for (i = 1; i <= espaciosPorDelante; i++) {
	          System.out.print(" ");
	        }
	        
	        //Pintamos la línea
	        System.out.print("*");
	        for (i = 1; i < espaciosInternos; i++) {
	          System.out.print(" ");
	        }
	        System.out.print("*");
	        
	        System.out.println();
	        altura++;
	        espaciosPorDelante++;
	        espaciosInternos -= 2;      
	      }
	      
	      //Pintamos la parte de abajo de la X.
	      espaciosInternos = 0;
	      espaciosPorDelante = alturaIntroducida / 2;
	      altura = 1;
	      while (altura <= alturaIntroducida / 2 + 1) {
	        
	        //Insertamos los espacios por delante.
	        for (i = 1; i <= espaciosPorDelante; i++) {
	          System.out.print(" ");
	        }
	        
	        //P
	        System.out.print("*");
	        for (i = 1; i < espaciosInternos; i++) {
	          System.out.print(" ");
	        }
	        
	        if(altura>1) {
	          System.out.print("*");
	        }
	        
	        System.out.println();
	        altura++;
	        espaciosPorDelante--;
	        espaciosInternos+=2;
	      }  
	    }
	}
}
