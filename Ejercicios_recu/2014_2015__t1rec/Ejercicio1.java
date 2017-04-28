/**
 * 
 * @author Manuel Cerezo
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Presentamos el programa
    System.out.println("\nIntroduzca un numero entero positivo. Despues, elegiré un dígito del número :)");

    System.out.print("\nPor favor, introduzca un número entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    
    int numeroReves = 0; 
    int longitud = 0; 
    
    // Da la vuelta al número
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    int posicion = (int)(Math.random()*longitud); // Genera una posición aleatoria de 0 a la longitud del número introducido 
    int digito = 0; // Almacena un dígito según la posición aleatoria resultante
    
    // Recorre el número al revés hasta que llegue a la posición aleatoria
    for (int i = 0; i <= posicion; i++) {
      
      // Si i es igual a la posición, saca el último dígito del número restante
      if (i == posicion) {
        digito = numeroReves % 10;
      }
      numeroReves /= 10;
    }
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println("\nDel número que ha introducido, voy a elegir el dígito " + digito);
  }
}
