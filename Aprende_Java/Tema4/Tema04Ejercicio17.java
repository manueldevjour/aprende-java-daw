/**
 *
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Manuel Cerezo
 *
 */

public class Tema04Ejercicio17 {
  public static void main(String[] args) {
  
    System.out.print("Introduzca un número: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));

    System.out.println("La última cifra del numero introducido es: " + numero % 10);
    
  }
}
