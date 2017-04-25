/**
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Manuel Cerezo
 *
 */
import java.util.Scanner;

public class Tema05Ejercicio16 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un numero por teclado para saber si es primo o no: ");
		int numeroIntroducido = Integer.parseInt(s.nextLine());
		
		//En este ejercicio me faltó por poner el boolean, por eso me daba error. Atencion a esto en el examen. 
		boolean esPrimo = true;
		
		for(int i = 2; i < numeroIntroducido; i++) {
			if ((numeroIntroducido % i) == 0) {
				esPrimo = false;
			}			
		}
		
		if (esPrimo) {
			System.out.print("El numero introducido es un numero primo.");
		} else {
			System.out.print("El numero introducido no es un numero primo.");
		}
	}
}
