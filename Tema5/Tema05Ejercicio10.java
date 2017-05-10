/**
 *
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Manuel Cerezo
 *
 */

public class Tema05Ejercicio10 {
  public static void main(String[] args) {

    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;
    
    System.out.println("Bienvenido. En este programa calcularemos la media de los números positivos introducidos.");
    System.out.println("Introduzca los números de los cuáles desee hacer la media. Para parar, introduzca un número negativo.");
    
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido) / (numeros - 1));
  }
}
