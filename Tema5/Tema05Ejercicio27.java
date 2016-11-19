/**
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema05Ejercicio27 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Bienvenido, en este programa se mostrará, contará y sumará los multiplos");
		System.out.print("\n que hay entre 1 y el número que usted introduzca");
		System.out.print("\n------------------------------------------------------------------------");
		
		System.out.print("\nPor favor, introduzca un número: ");
		int numeroIntroducido = s.nextInt();
		
		int cantidadMultiplos = 0;
		int suma = 0;
		
		for (int i = 1; i <= numeroIntroducido; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
				cantidadMultiplos++;
				suma += i;
			} 
		}
		
		System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay un total de " + cantidadMultiplos + " multiplos de 3");
		System.out.print("\nLos múltiplos de 3 suman: " + suma);
	}
}
