/**
 *
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @author Manuel Cerezo
 *
 */
 
import java.util.Scanner;

public class Tema05Ejercicio13 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.println("En este programa vamos a comprobar de una lista de 10 números, cuáles son negativos y cuáles positivos.");

    int numerosNegativos = 0;
    int numerosPositivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        numerosNegativos++;
      } else {
        numerosPositivos++;
      }
    }
  
    System.out.println("La cantidad de números positivos es de: " + numerosPositivos + " y la cantidad de números negativos es de: " + numerosNegativos);
  }
}
