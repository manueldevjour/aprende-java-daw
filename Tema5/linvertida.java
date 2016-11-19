package linvertida;

import java.util.Scanner;

public class linvertida {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la L invertida: ");
		int altura = s.nextInt();
		
		int j = 1;
		
		//Pintamos el palo vertical
		
		while (j < altura) {
			for (int contadorEspacios = 0; contadorEspacios < altura / 2; contadorEspacios++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			j++;
		}
		
		j = 1;
		int anchura = (altura / 2) + 1;
		while (j <= anchura) {
			System.out.print("*");
			j++;
			
		}
		
		System.out.println();
	}
}