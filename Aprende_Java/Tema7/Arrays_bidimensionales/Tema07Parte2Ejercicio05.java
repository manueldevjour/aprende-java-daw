/**
 * 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.
 * 
 * @author Manuel Cerezo;
 *
 */

import java.util.Scanner;

public class Tema07Parte2Ejercicio05 {
	public static void main(String[] args) 
		    
			
		throws InterruptedException {
	 
	    int[][] array = new int[6][10];
	    int fila;
	    int columna;		 
	    int minimo = Integer.MAX_VALUE;
	    int filaMinimo = 0;
	    int columnaMinimo = 0;		    
	    int maximo = Integer.MIN_VALUE;
	    int filaMaximo = 0;
	    int columnaMaximo = 0;

	    System.out.print("\n      ");
	    for(columna = 0; columna < 10; columna++) {
	      System.out.print("   " + columna + "  ");
	    }
	    System.out.println();
		    
	    System.out.print("    ┏");
	    for(columna = 0; columna < 10; columna++) {
	      System.out.print("━━━━━━");
	    }
	    System.out.println("┓");
		    
	    for(fila = 0; fila < 6; fila++) {
	      System.out.print("  " + fila + " ┃");
	      for(columna = 0; columna < 10; columna++) {
		      array[fila][columna] = (int)(Math.random() * 1001);
		      System.out.printf("%5d ", array[fila][columna]);
		      Thread.sleep(250);
		        
		      //Calculamos el mínimo
		        if (array[fila][columna] < minimo) {
		          minimo = array[fila][columna];
		          filaMinimo = fila;
		          columnaMinimo = columna;
		        }
		        
		        //Calculamos el máximo
		        if (array[fila][columna] > maximo) {
		          maximo = array[fila][columna];
		          filaMaximo = fila;
		          columnaMaximo = columna;
		        }
		      }
		      System.out.println("┃");
		    }
		    System.out.print("    ┗");
		    for(columna = 0; columna < 10; columna++) {
		      System.out.print("━━━━━━");
		    }

		    System.out.println("┛\nEl número máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
		    System.out.println("El número mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
		  }
}
