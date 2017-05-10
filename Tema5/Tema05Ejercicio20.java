/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
	    int alturaTeclado = s.nextInt();
	    System.out.print("Introduzca el caracter con el que va a dibujar la imagen: ");
	    String caracter = s.next();
	    
	    int altura = 1;
	    int i = 0;
	    int espaciosPorDelante = alturaTeclado - 1;
	    int espaciosInternos = 0;
	    
	    while (altura < alturaTeclado) {
	      
	      //Insertamos los espacios que tiene que tener la piramide por delante
	      for (i = 1; i <= espaciosPorDelante; i++) {
	        System.out.print(" ");
	      }
	      
	      //Pintamos la linea "x" de la piramide
	      System.out.print(caracter);
	      for (i = 1; i < espaciosInternos; i++) {
	        System.out.print(" ");
	      }
	      
	      if (altura>1) {
	        System.out.print(caracter);
	      }
	      
	      System.out.println();
	      altura++;
	      espaciosPorDelante--;
	      espaciosInternos += 2;
	    }
	    
	    //Dibujamos la base de la piramide
	    for (i = 1; i < altura*2; i++) {
	    System.out.print(caracter);
	    }
	}
}
