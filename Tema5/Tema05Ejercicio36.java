/**
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio36 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
	    long numeroIntroducido = s.nextLong();

	    //Volteamos el número introducido por teclado.
	    long numero = numeroIntroducido;
	    long volteado = 0;

	    while (numero > 0) {
	      volteado = (volteado * 10) + (numero % 10);
	      numero /= 10;
	    } 
	    
	    if (volteado == numeroIntroducido) {
	      System.out.println("El " + numeroIntroducido + " es capicúa");
	    } else {
	      System.out.println("El " + numeroIntroducido + " no es capicúa");
	    }
	}
}