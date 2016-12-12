/**
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema06Ejercicio20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Introduzca la capacidad de la cuba en litros: ");
	    int capacidad = s.nextInt();

	    //Rellena la cuba aleatoriamente sin pasarse de la capacidad
	    int litros = (int)(Math.random() * (capacidad + 1));  
	        
	    for (int i = 0; i < capacidad; i++) {
	      if (i < (capacidad - litros)) {
	        System.out.println("%    %");
	      } else {
	        System.out.println("%----%");
	      }
	    }
	        
	    System.out.println("%%%%%%"); //El fondo de la cuba
	    System.out.print("La cuba tiene una capacidad de " + capacidad);
	    System.out.print(" litros y contiene " + litros + " litros de agua.");
	}
}
