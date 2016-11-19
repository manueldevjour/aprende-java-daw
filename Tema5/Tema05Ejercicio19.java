/**
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio19 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Pedimos la información que necesitamos para dibujar la piramide --> Altura, y el caracter con el que vamos a rellenar la piramide. 5
		System.out.print("Por favor, introduzca la altura de la piramide que desea dibujar: ");
		int alturaTeclado = s.nextInt();
		System.out.print("Ahora introduzca el caracter con el que desea dibujar la piramide: ");
		String caracter = s.next();
		
		int altura = 1;
	    int i = 0;
	    int espacios = alturaTeclado - 1;
	    
	    while (altura <= alturaTeclado) {
	      
	      //Con este for, introducimos los espacios.
	      for (i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }

	      //Con este for, usamos los caracteres que deseamos ver en la piramide.
	      for (i = 1; i < altura * 2; i++) {
	        System.out.print(caracter);
	      }

	      System.out.println();

	      altura++;
	      espacios--;
	    }
	}
}

