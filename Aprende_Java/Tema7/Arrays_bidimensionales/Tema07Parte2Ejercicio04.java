/**
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author Manuel Cerezo;
 *
 */

import java.util.Scanner;

public class Tema07Parte2Ejercicio04 {
public static void main(String[] args) 
		
		throws InterruptedException {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa.
		System.out.print("En este programa, el array se rellenará de un elemento aleatorio entre 100 y 999.");
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
				array[fila][columna] = (int)(Math.random() * 900) + 100;
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
	        Thread.sleep(750);
	      }
	      System.out.printf("┃%6d   ", sumaTotal);
		
	      System.out.print("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
}
