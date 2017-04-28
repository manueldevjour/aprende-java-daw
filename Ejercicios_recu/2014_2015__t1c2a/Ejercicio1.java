/**
 * 
 * @author Manuel Cerezo
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("El programa trozeará un numero que se habra introducido por teclado.");
    System.out.print("\nEsto se hará para convertirlo en dos numeros.");
    System.out.print("\nPulse ENTER para continuar.");
    System.out.print("\n------------------------------------------------------------------");
    s.nextLine();
    
    //Declaramos el array y las variables
    long[] num = new long[100];
    int i = 0;
    long numero = 0;
    long copia = 0;
    long resultado = 0;
    int digitos = 0;
    
    //Pedimos el numero
    System.out.println ("Introduce el numero");
    numero = s.nextLong();
    
    copia = numero;
    
    while (copia > 0) {
      digitos++;
      copia /= 10;
    }
    
    
    for (i = digitos-1; i >= 0; i--) {
      num[i] = numero % 10;
      numero /= 10;
    } 
    
    System.out.print ("Primer trozo: ");
    
    for (i = 0; i < digitos; i+=2) {
      System.out.print (num[i]);
    }
    
    System.out.print ("\nSegundo Trozo: ");
    
    for (i = 1; i < digitos; i+=2) {
      System.out.print (num[i]);
    }

  }
}
