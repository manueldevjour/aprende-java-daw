/*
 *El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
la altura del logotipo. La anchura siempre es de 4 asteriscos.
 */

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class PartidoPolitico {
      public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("PARTIDO POLITICO ");
          System.out.println("-----------------------------------------------------------------------------");
          
          System.out.println("Indica la altura de la letra I ");
          int altura = t.nextInt();
          System.out.println("------------------------------------------------------------------------------");
          
          int espacio = 1;
          
          for(int i = 0; i < altura; i++){
            for(int k = 0; k < espacio; k++){
              System.out.print(" ");
            }
              espacio--;
              System.out.println("####");
          }
      }
}