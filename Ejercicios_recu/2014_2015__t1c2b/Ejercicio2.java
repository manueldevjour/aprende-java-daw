/**
 * 
 * @author Manuel Cerezo
 * 
 */

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner (System.in);
  
    String[] arrayOriginal = new String[6];
    String[] arrayAux = new String[6];
    int posAleatoria;
    int aux = 0;
  
    //Pedimos las palabras y las vamos guardando en el array.
    System.out.println("Por favor, introduzca las palabras que desee y vaya pulsando ENTER.");
    for(int i = 0; i < 6; i++) {
      arrayOriginal[i] = s.nextLine();
    }
    //Mostramos el array original
    for(int i = 0; i < 6; i++) {
      System.out.print(arrayOriginal[i] + " | ");
    }
    
    System.out.println();
    
    for(int i = 0; i < 6; i++) {
      boolean repetido;
      
      String aleatorio;
      
      do{
        repetido = false;
        aleatorio = arrayOriginal[(int)(Math.random() * 6)];
        
        for(int j = 0; j < i; j++) {
          if(arrayAux[j] == aleatorio) {
            repetido = true;
          }
        }
      }while(repetido);
      
      arrayAux[i] = aleatorio;
    }
    
    for(int i = 0; i < 6; i++) {
      System.out.print(arrayAux[i] + " | ");
    }
  }
}
