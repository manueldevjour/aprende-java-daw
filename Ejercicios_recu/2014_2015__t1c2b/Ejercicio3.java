/**
 * 
 * @author Manuel Cerezo
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("En este programa eliminaremos el dígito que usted desee"
                      + "\nde un numero introducido por usted por teclado.");
    System.out.print("\nPor favor, pulse ENTER para comenzar con el programa.");
    System.out.print("\n------------------------------------------------------");
    s.nextLine();
    
    //Declaramos las variables
    int numeroIntroducido;
    
    System.out.print("\nPor favor, introduzca un número: ");
    numeroIntroducido = s.nextInt();
    
    int digito;
    
    System.out.print("\nPor favor, ahora, introduzca uno de los digitos que"
                      + " desee eliminar");
    digito = s.nextInt();
  
  
  }
}
