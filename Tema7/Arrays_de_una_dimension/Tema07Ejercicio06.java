/**
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("Introduzca 15 números por teclado.");
		System.out.print("\nSe rotarán los elementos del array. La posición 0 a la 1, la 1 a la 2, etc..");
		
		//Declaramos las variables y el array.
		
		int[] num = new int[15];
		
		int i;
		int contador = 15;
		
		//Bucle para introducir los valores del array por teclado.
		for(i = 0; i < 15; i++) {
			System.out.print("\nIntroduzca un número. Le quedan " + contador + " números por introducir: ");
			num[i] = s.nextInt();
			contador--;
		}
		
		//En esta parte del código, mostramos el array creado por la persona que ha introducido los valores.
		System.out.println("Array original:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
	    System.out.print("│ Indice ");
	    for (i = 0; i < 15; i++) {
	      System.out.printf("|%4d ", i);
	    }
	    
	    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
	    System.out.print("│ Valor  ");
	    for(i = 0; i < 15; i++) {
	      System.out.printf("|%4d ", num[i]);
	    }
	    
	    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	    
	    //Hacemos que cada elemento del array rote una posición hacia la derecha
	    int aux = num[14]; //En la variable aux introducimos el valor del elemento de la posición 14 del array
	      for (i = 14; i > 0; i--) {
	        num[i] = num[i-1];//Con esto hacemos que ahora, la posición i del array tenga el valor de la posición anterior
	      }
	      num[0] = aux;//El elemento de la posición 0, que ha pasado a la 1, tiene ahora el valor de la posición 14
	      
	    //Mostramos el array con los elementos rotados a la derecha
	    System.out.println("Array original:");
	       System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		   System.out.print("│ Indice ");
		   for (i = 0; i < 15; i++) {
		     System.out.printf("|%4d ", i);
		   }
		    
		   System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
		   System.out.print("│ Valor  ");
		   for(i = 0; i < 15; i++) {
		     System.out.printf("|%4d ", num[i]);
		   }
		    
		   System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	}
}
