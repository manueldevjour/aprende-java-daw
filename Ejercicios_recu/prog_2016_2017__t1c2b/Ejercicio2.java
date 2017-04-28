/**
 * 
 * Parcial 2 Examen B
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args){
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("En este programa deberá de indicar sus números favoritos entre 0 y 100");
    System.out.print("\nSe creará una lista del 0 al 100 con los numeros que le gustan y los que no.");
    System.out.print("\nPulse ENTER para comenzar.");
    System.out.print("\n------------------------------------------------------------------------------");
    s.nextLine();
    
    //Declaramos el array donde vamos a meter los números de usuario
    int[] numFav = new int[5];
    int contador = 5;
    
    //Pedimos los números
    for (int i = 0; i < 5; i++) {
      System.out.println("Por favor, introduzca sus 5 números favoritos. Le quedan " + contador + " números por introducir.");
      numFav[i] = Integer.parseInt(System.console().readLine());
      contador--;
    }
    
    System.out.printf("\n\n");
    
    //Empezamos a imprimir los número de 1 al 100
    for (int i = 1; i <= 100; i++) {
      //Declaramos un booleano
      boolean gusta = false;
      //Comprobamos si el número que vamos a imprimir es el número que gusta
      for (int j = 0; (j < 5) && !gusta; j++) {
        if (i == numFav[j]) {
          gusta = true;
        }
      }
      //Imprimimos el gusto dependiendo del número que desee el usuario
      if (gusta) {
        System.out.printf("%d ME GUSTA, ", i);
      } else {
        System.out.printf("%d no me gusta, ", i);
      }
      
      //Cada 5 números hacemos un salto de línea
      if ((i % 5) == 0) {
        System.out.printf("\n");
      }
    }
  }
}
