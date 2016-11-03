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

public class Tema05Ejercicio12 {
  public static void main(String[] args) {

    int n1 = 0;
    int n2 = 1;
    
    System.out.print("Introduzca un número para mostrar los n términos de la serie de Fibonacci: ");
    int numeroRepeticiones = Integer.parseInt(System.console().readLine());
    
    for (int i = numeroRepeticiones; numeroRepeticiones == n1 + n2; numeroRepeticiones--) {
      System.out.println("La serie de Fibonacci con " + numeroRepeticiones + "repeticiones es: " + i);
    }
  }
}
