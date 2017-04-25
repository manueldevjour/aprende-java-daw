/**
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio22 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("En este programa mostraremos todos los numeros primos entre el 2 y el 100");
		System.out.print("\n-------------------------------------------------------------------------\n");
		
		boolean esPrimo = true;

		//Con este bucle vamos comprobando que n esté entre 2 y 100.
	    for (int n = 2; n <= 100; n++) {

	      //Comprobamos si n es primo.
	      esPrimo = true;
	      for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	          esPrimo = false;
	        }
	      }

	      //Una vez comprobado si n es primo, lo escribimos por pantalla.
	      if (esPrimo) {
	        System.out.print(n + ", ");
	      }
	    }
	}
}
