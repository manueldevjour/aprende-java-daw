/**
 * 
 * Parcial 2 Examen B
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args){
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("En este programa realizaremos al azar capturas hechas por un jugador.");
    System.out.print("\nPulse ENTER para continuar.");
    System.out.print("\n-------------------------------------------------------------------");
    s.nextLine();
    
    //Declaramos las variables
    String[] pieza = {"Dama", "Torre", "Alfil", "Caballo", "Peón"};
    int[] valor = {9, 5, 3, 2, 1};
    
    //Generamos un número aleatorio para cada ficha
    int[] capturas = {
      (int)(Math.random() * 1),
      (int)(Math.random() * 2),
      (int)(Math.random() * 2),
      (int)(Math.random() * 2),
      (int)(Math.random() * 8)
    };
    
    //Establecemos la variable en la que iremos introduciendo los puntos
    int suma = 0;
    
    System.out.println("Fichas capturadas por el jugador:");
    
    //Imprimimos las capturas
    for (int i = 0; i < 5; i++) {
      //Si el número generado para una ficha es 0, no mostramos esa ficha
      if (capturas[i] != 0) {
        System.out.printf("%s (%d peones)\n", pieza[i], valor[i] * capturas[i], capturas[i]);
        //Sumamos los puntos de del ficha
        suma = suma + (valor[i] * capturas[i]);
      }
    }
    //Mostramos el resultado final
    System.out.printf("Puntos totales: %d peones", suma);
  }
}
