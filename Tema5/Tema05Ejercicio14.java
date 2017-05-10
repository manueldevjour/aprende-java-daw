/**
 *
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 *
 * @author Manuel Cerezo
 *
 */
 
import java.util.Scanner;

public class Tema05Ejercicio14 {
  public static void main(String[] args) {

    System.out.println("En este programa podrá introducir dos números (base y exponente) para calcular una potencia.");
    System.out.print("\nIntroduzca el valor de la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("\nIntroduzca el valor del exponente (ha de ser positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = Math.pow(base, exponente);
    
    System.out.println("La base: " + base + " elevada al exponente: " + exponente + " tiene como resultado: " + potencia);

  }
}
