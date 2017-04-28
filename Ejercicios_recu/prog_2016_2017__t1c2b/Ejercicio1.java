/**
 * 
 * Parcial 2 Examen B
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("Mostramos 10 numeros aleatorios.");
    System.out.print("\nMultiplos de 7.");
    System.out.print("\nEntre 140 y 210 (ambos incluidos).");
    System.out.print("\nPulse ENTER para comenzar el programa.");
    System.out.print("\n---------------------------------");
    s.nextLine();
    
    int numeroAleatorio;
    
    //Bucle for para crear los 10 numeros aleatorios
    for(int i = 0; i < 10; i++) {
      numeroAleatorio = (int)(Math.random() * 71) + 140;
      //Si el numero es multiplo de 7 lo pintamos por pantalla
      if (numeroAleatorio % 7 == 0) {
        System.out.print(numeroAleatorio + " ");
      } else if (numeroAleatorio % 7 != 0) {
        i--;
      }
    }
  }
}

