/**
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Manuel Cerezo
 *
 */

public class Tema04Ejercicio14 {
  public static void main(String[] args) {
  
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if ((numero % 2 == 0) && (numero % 5 == 0)) {
      System.out.print("El número introducido es par y divisible entre 5.");
    } else if (numero % 2 == 0) {
      System.out.print("El número introducido es par.");
    } else if (numero % 5 == 0) {
      System.out.print("El número introducido es divisible entre 5.");
    } else {
      System.out.print("El número introducido no es par ni divisible entre 5.");
    }
  }
} 
