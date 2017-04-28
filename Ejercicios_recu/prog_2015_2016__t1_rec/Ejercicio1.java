/**
 * Ejercicio 1 
 * Partido político
 * 
 * @author Manuel Cerezo;
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.println("Logotipo de Izquierda hacia la Izquierda ");
    System.out.print("-----------------------------------------");
          
    System.out.print("\nIndica la altura del logotipo: ");
    int altura = s.nextInt();
    System.out.println("\n------------------------------");
          
    int espacio = 1;
          
    for(int i = 0; i < altura; i++){
      for(int k = 0; k < espacio; k++){
        System.out.print(" ");
      }
    espacio++;
    System.out.println("####");
    }
  
  }
}
