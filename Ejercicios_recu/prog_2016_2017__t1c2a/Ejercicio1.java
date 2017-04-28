/**
 * 
 * Parcial 2 Examen A
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main (String args[]) {
    
    System.out.println("Introduce 10 números diferentes y te diré cual se repite más y cuantas veces");
    System.out.println("-----------------------------------------------------------------------------\n");
    
    int num[] = new int [10];
    
    int nuevo[] = new int [10];
    int contador = 0;
    int j = 0;
    
    
      for (int x = 0; x < 10; x++) { //pide los números y los guarda en num[x]
        System.out.print("Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
      }   
      
      
      // PINTA EL INDICE
      
      System.out.println("");
      System.out.println("índice\t\tNúmero");
      
      
      
      for (int x = 0; x < 10; x++) {
        System.out.print("  " + x + " \t\t" + "  " + num[x]); //x pinta el número que corresponde al indice y num[x] pinta el dato guardado
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador == 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
        System.out.println();
      } //Los muestra y pasa los primos a las primeras posiciones
      
      for (int x = 0; x < 10; x++) {
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador != 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
      } //pasa el resto de los números al resto de las posiciones
      
      System.out.println("\nASI QUEDA EL NUEVO ARRAY:");
      
      // PINTA EL NUEVO INDICE
      
      System.out.println("\níndice\t\tNúmero");
      
      
      for (int x = 0; x < 10; x++) {
        System.out.println( "  " + x + "\t\t" + "  " + nuevo[x]);
      } //Muestra el nuevo array
      
      
  }
}
