/**
 * 
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio01 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este ejercicio, definimos un array de 12 números");
	    System.out.print("\nPara comenzar, pulse la tecla ENTER.");
	    s.nextLine();
	    
	    int[] num; //Declaramos el array de números enteros.
	    num = new int[12]; //Especificamos el número de enteros que habrá en el array.
	    
	    //Declaramos los números enteros que van en las diferentes posiciones de los arrays.
	    num[0] = 39;
	    num[1] = -2;
	    num[4] = 0;
	    num[6] = 14;
	    num[8] = 5;
	    num[9] = 120;
	    
	    //Dibujamos la tabla e introducimos los valores del array en la misma.
	    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
	    System.out.print("│ Indice ");
	    for (int i = 0; i < 12; i++) {
	      System.out.printf("|%4d ", i);
	    }
	    
	    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
	    System.out.print("│ Valor  ");
	    for(int i = 0; i < 12; i++) {
	      System.out.printf("|%4d ", num[i]);
	    }
	    
	    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
	}
}
