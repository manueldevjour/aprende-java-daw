/**
 *
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Manuel Cerezo
 *
 */

public class Tema05Ejercicio11 {
  public static void main(String[] args) {

    int numeroIntroducido;
    
    System.out.println("Bienvenido. Introduzca un número entero. A partir de este, se le mostrará en 3 columnas diferentes el cuadrado y el cubo de los 5 números siguientes al introducido.");
    System.out.print("Introduzca un número entero: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    for (int i = numeroIntroducido; i < 5 + numeroIntroducido; i++) {
      System.out.printf("%3d | %5d | %7d\n", i, i * i, i * i * i);
    }
  }
}
