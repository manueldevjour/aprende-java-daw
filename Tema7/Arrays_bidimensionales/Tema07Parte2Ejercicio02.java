/**
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Parte2Ejercicio02 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa.
		System.out.print("En este programa, le pediremos 20 números.");
		System.out.print("\nMostraremos el programa con resultados de sumas parciales, como una hoja de cálculo.");
		System.out.print("\nPulse ENTER para continuar.");
		System.out.print("\n-------------------------------------------------------------------------------------");
		s.nextLine();
		
		//Declaramos las variables y los arrays que necesitamos.
		int[][] array = new int [4][5];
		int i;
		int contador = 20;
		int fila;
		int columna;
		
		//Primer bucle para pedir los números del array.
		for(fila = 0; fila < 4; fila++) {
			for(columna = 0; columna < 5; columna++) {
				System.out.print("Fila " + fila + ", columna " + columna + ": ");
				array[fila][columna] = s.nextInt();
			}
		}//Fin primer bucle
		
		System.out.print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
		//Mostramos los elementos del array y hacemos la suma parciales de las filas
		int sumaFila;
	    for(fila = 0; fila < 4; fila++) {
	      sumaFila = 0;  
	      for(columna = 0; columna < 5; columna++) {
	        System.out.printf("%6d   ", array[fila][columna]);
	        sumaFila += array[fila][columna];
	      }  
	      System.out.printf("┃%6d\n", sumaFila);
	    }
		
	    //Se muestran las sumas parciales de las columnas del array
	    for(columna = 0; columna < 5; columna++) {
	        System.out.print("━━━━━━━━━");
	      }
	      System.out.println("━━━━━━━━");

	      int sumaColumna;
	      int sumaTotal = 0;    
	      for(columna = 0; columna < 5; columna++) {
	        sumaColumna = 0;
	        for(fila = 0; fila < 4; fila++) {
	          sumaColumna += array[fila][columna];
	        }

	        sumaTotal += sumaColumna;
	        System.out.printf("%6d   ", sumaColumna);
	      }
	      System.out.printf("┃%6d   ", sumaTotal);
		
	      System.out.print("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
}
