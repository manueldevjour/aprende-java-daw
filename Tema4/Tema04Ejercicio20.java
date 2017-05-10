/**
 *
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio20 {
  public static void main(String[] args) {
  
    boolean capicuo = false;
    
    System.out.print("Introduzca un número por teclado, de hasta 5 cifras, para comprobar si es capicúo: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10) {
      capicuo = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicuo = true;
      }
    }
    
    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && (((numero / 100 ) % 10)== ((numero / 10) % 10))) {
        capicuo = true;
      }
    }

    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicuo = true;
      }
    }

    if (capicuo) {
      System.out.println("El número introducido es capicúo.");
    } else {
      System.out.println("El número introducido no es capicúo.");

    }
  }
}
