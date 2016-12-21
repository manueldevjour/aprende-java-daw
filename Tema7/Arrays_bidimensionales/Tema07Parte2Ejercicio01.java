/**
 * 
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Parte2Ejercicio01 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, mostraremos los elementos de un array.");
		System.out.print("\nEste array será bidimensional.");
		System.out.print("\nPulse ENTER para mostrar el array.");
		System.out.print("\n------------------------------------------------------");
		s.nextLine();
		
		//Definimos el array y las variables que vamos a necesitar.
		int[][] num = new int [3][6];
		int fila;
		int columna;
		
		//Introducimos los valores del array
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		//Mostramos el array.
		System.out.print("ArrayNum");
	    for(columna = 0; columna < 6; columna++) {
	      System.out.print("   Columna " + columna);
	    }
	    for(fila = 0; fila < 3; fila++) {

	      System.out.print("\nFila " + fila);
	  
	      for(columna = 0; columna < 6; columna++) {
	        System.out.printf("%9d   ", num[fila][columna]);
	      }   
	    }
	}
}
