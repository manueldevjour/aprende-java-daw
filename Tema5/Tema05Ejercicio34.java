/**
 * 
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo
 * dígito del segundo número, tercer dígito del primer número… Para facilitar
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir números largos.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio34 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
	    System.out.print("Por favor, introduzca un número: ");
	    long numeroIntroducido1 = Long.parseLong(System.console().readLine());

	    System.out.print("Introduzca otro número: ");
	    long numeroIntroducido2 = Long.parseLong(System.console().readLine());

	    //Volteamos el primer número y calculamos la longitud
	    long numero = numeroIntroducido1;
	    long volteado1 = 0;
	    int longitud = 0;
	    
	    if (numero == 0) {
	      longitud = 1;
	    }
	    
	    while (numero > 0) {
	      volteado1 = (volteado1 * 10) + (numero % 10);
	      numero /= 10;
	      longitud++;
	    } 

	    //Volteamos el segundo número
	    numero = numeroIntroducido2;
	    long volteado2 = 0;
	    
	    while (numero > 0) {
	      volteado2 = (volteado2 * 10) + (numero % 10);
	      numero /= 10;
	    }

	    //Recorre los dos números volteados para formar los dos resultados
	    long resultadoPares = 0;
	    long resultadoImpares = 0;
	    int digito;
	    
	    for (int i = 0; i < longitud; i++) {

	      digito = (int)(volteado1 % 10);

	      if ((digito % 2) == 0) {
	        resultadoPares = resultadoPares * 10 + digito;
	      } else {
	        resultadoImpares = resultadoImpares * 10 + digito;
	      }

	      digito = (int)(volteado2 % 10);

	      if ((digito % 2) == 0) {
	        resultadoPares = resultadoPares * 10 + digito;
	      } else {
	        resultadoImpares = resultadoImpares * 10 + digito;
	      }

	      volteado1 /= 10;
	      volteado2 /= 10;
	    }
	    
	    //Mostramos el resultado final.
	    System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
	    System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
	}
}
