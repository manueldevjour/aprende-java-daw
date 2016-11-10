/**
 *
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se
 * debe introducir por teclado.
 *
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;
public class Tema05Ejercicio12 {
  public static void main(String[] args) {

    //Usamos la clase Scanner para facilitar la lectura de datos.
    Scanner s = new Scanner(System.in);
    
    //Le explicamos al usuario de qué trata el programa que va a usar y declaramos la variable 'termino'
    System.out.println("Bienvenido/a, a continuación realizaremos la Serie de Fibonacci");
    System.out.println("Introduzca el número de términos de la serie de Fibonacci que quiere mostrar por pantalla: ");
    int numeroTerminos = Integer.parseInt(System.console().readLine());
    
    if (numeroTerminos == 1) {
      System.out.print("0");
    } else if (numeroTerminos == 2) {
      System.out.print("0 1");
    } else if (numeroTerminos > 1) {
      System.out.print("0 1");
      int numero1 = 0; //La variable que le da al término 1 el valor de 0 y la que iremos usando para seguir ejecutando la serie.
      int numero2 = 1; //En esta variable, declaramos que el segundo término será 1 y además es la que usaremos junto con la primera para ejecutar la serie.
      int auxiliar;
        
        while (numeroTerminos > 2) {
          auxiliar = numero1;
          numero1 = numero2;
          numero2 = auxiliar + numero2;
          System.out.print(" " + numero2);
          numeroTerminos--;
        }
    }
  }
}
