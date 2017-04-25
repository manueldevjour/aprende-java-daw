/**
 *
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema05Ejercicio09 {
  public static void main(String[] args) {

    int numeroDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10;
      numeroDigitos++;
    }
    
    System.out.println("El número " + numeroIntroducido + " tiene " + numeroDigitos + " dígitos.");

  }
}
