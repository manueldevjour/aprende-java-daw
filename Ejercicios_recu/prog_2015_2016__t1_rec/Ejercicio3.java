/**
 * Ejercicio 3
 * Rellenar array // Pasos
 * 
 * @author Manuel Cerezo;
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("En este programa contaremos los pasos que se han de dar");
    System.out.println(" entre una posicion y otra del array.");
    System.out.println("-----------------------------------------------------");
          
    int[] a = new int[20];
    
    //Generamos los números aleatorios
    for (int i = 0; i < a.length; i++){
      a[i] = (int)(Math.random() * 1001);
    }
          
    //Mostramos los números (el array)
    System.out.print("\nEste es el array: ");
    int i; 
          
    for(i = 0; i < a.length; i++){
      System.out.print("|" + a[i]);
    }
          
    System.out.println("\n--------------------------------------------------");    
    int num1;
    int num2;
    boolean existe = false; 
          
    //pedir los número y comprobar si existen
    //si se mete un número inexistente se vuelve a pedir el número
    int pasos = 0;
          
    System.out.println("Escoja dos numeros que esten dentro del array ");
    System.out.println(" ");
          
    System.out.print("Introduzca el primer numero: ");
    num1 = s.nextInt();

    System.out.print("Introduzca el segundo numero: ");
    num2 = s.nextInt();

    //Contamos los pasos entre los números que nos ha dado el usuario
    int pasosHechos = 0;
          
    for(i = 0; i < a.length; i++){
      pasos++;
            
      if(num1 == a[i]){
        pasos = 0;
      }
      
      if(num2 == a[i]){
        pasosHechos = pasos;
      }
    }

          
    System.out.println("Se han dado un total de " + pasosHechos + " pasos.");
    System.out.println("-----------------------------------------------------------");
    
  }
}
