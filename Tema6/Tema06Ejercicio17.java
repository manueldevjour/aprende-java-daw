/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro
 * de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner; 

public class Tema06Ejercicio17 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa y pedimos que introduzca la altura de la pecera.
		System.out.print("Introduzca la altura de la pecera (ha de ser mínimo 4 de altura): ");
	    int alto = s.nextInt();

	    System.out.print("Introduzca la anchura (ha de tener mínimo 4 de anchura): ");
	    int ancho = s.nextInt();

	    int posicion = 0;

	    int posicionPez = (int)(Math.random()*(alto - 2)*(ancho - 2)); //La posición del pez en la pecera

	    //Pintamos la parte superior de la pecera
	    for(int i = 0; i < ancho; i++) {
	      System.out.print("*");
	    }
	    System.out.println();  

	    //Pintamos la parte central de la pecera ("las paredes").
	    for(int i = 2; i < alto; i++) {
	      System.out.print("*"); // parte izquierda de la pecera
	      for(int j = 2; j < ancho; j++) {
	        if (posicion == posicionPez) {
	          System.out.print("%");
	        } else {
	          System.out.print(" ");
	        }
	        posicion++;
	      } // for j
	      System.out.println("*"); // parte derecha de la pecera
	    } // for i
	      
	    //Se pinta la parte de la base de la pecera
	    for(int i = 0; i < ancho; i++) {
	      System.out.print("*");
	    }
	}
}
