/**
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 * 
 * @author Manuel Cerezo
 * 
 */
import java.util.Scanner;

public class Tema05Ejercicio15 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un numero real (base): ");
		int base = s.nextInt();
		
		System.out.print("\nIntroduce un numero entero (exponente): ");
		float exponente = s.nextFloat();
		
		for (int i = 1; i <= exponente; i++) {
			System.out.print(base + "^" + i);
			System.out.print(" ");
		}
	}
}
