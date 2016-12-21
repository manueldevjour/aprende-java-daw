/**
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 * 
 * @author Manuel Cerezo
 *
 */
import java.util.Scanner;

public class Tema07Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa generaremos 20 números aleatorios entre 0 y 100. Se almacenarán en un array.");
		System.out.print("\nEl programa pasará los numeros pares a las primeras posiciones");
		System.out.print("\nLos impares irán a las celdas restantes.");
		System.out.print("\nPulse ENTER para comenzar el programa.");
		System.out.print("\n--------------------------------------------------------------------------------------------");
		s.nextLine();
		
		//Declaramos los arrays y las variables que nos harán falta.
		int[] num = new int[20];
	    int[] par = new int[20];
	    int[] impar = new int[20];
	    int i;
	    int pares = 0;
	    int impares = 0;
	    
	    for (i = 0; i < 20; i++) {
	      num[i] = (int)(Math.random() * 101);
	      //Separa los números metiendo los pares en un array y los impares en otro.
	      if (num[i] % 2 == 0) {
	        par[pares++] = num[i];
	      } else {
	        impar[impares++] = num[i];
	      }
	    }
	    
	    //Muestra el array original
	    System.out.println("Array original:");
	    for (i = 0; i < 20; i++) {
	      System.out.print(num[i] + " ");
	    }
	    System.out.println();
	    
	    //Se introducen los números pares en las primeras posiciones del array original.
	    for (i = 0; i < pares; i++) {
	      num[i] = par[i];
	    }
	    
	    //Se introducen los impares en los huecos que quedan.
	    for (i = pares; i < 20; i++) {
	      num[i] = impar[i - pares];
	    }

	    //Se muestra el resultado (array final)
	    System.out.println("\nArray con los pares al principio e impares al final:");
	    for (i = 0; i < 20; i++) {
	      System.out.print(num[i] + " ");
	}
	}
}
