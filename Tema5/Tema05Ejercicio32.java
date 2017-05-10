/**
 * 
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio32 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
	    long numeroIntroducido = Long.parseLong(System.console().readLine());

	    //Le damos la vuelta al número y calculamos la longitud.
	    long numero = numeroIntroducido;
	    long volteado = 0;
	    int longitud = 0;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } 

	    //Mostramos los dígitos pares.
	    System.out.print("Dígitos pares: ");

	    int digito;
	    int sumaPares = 0;
	    
	    for (int i = 0; i < longitud; i++) {

	      digito = (int)(volteado % 10);

	      if ((digito % 2) == 0) {
	        System.out.print(digito + " ");
	        sumaPares += digito;
	      }

	      volteado /= 10;
	    }
	    
	    //Aquí mostramos la suma de los dígitos pares 
	    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
		
	}
}
