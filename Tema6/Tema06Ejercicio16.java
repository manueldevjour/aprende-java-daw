/**
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * 
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje ¡Lo siento,
 * ha perdido!.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje ¡Bien,
 * ha recuperado su moneda!.
 * d) Si las tres figuras son iguales se debe mostrar ¡Enhorabuena, ha ganado
 * 10 monedas!.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema06Ejercicio16 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("Este programa es un simulador de tragaperras.");
		System.out.print("\nLas condiciones para ganar están más arriba.");
		System.out.println("\n---------------------------------------------");
		
		int monedas = 1;
		int figura = 0;
		String stringFigura = (" ");
		int a = 0;
		int b = 0;
		int c = 0;
		
		do {
			System.out.print("Pulse ENTER para jugar.");
			s.nextLine();
			monedas--;
			
			for(int i = 0; i < 3; i++) {
				figura = (int)(Math.random() * 5);
				switch(figura) {
					case 0:
						stringFigura = ("Corazón");
						break;
					case 1:
						stringFigura = ("Diamante ");
						break;
					case 2:
						stringFigura = ("Herradura ");
						break;
					case 3:
						stringFigura = ("Campana ");
						break;
					case 4:
						stringFigura = ("Limón ");
						break;
						default:
				}
				System.out.print(stringFigura + " ");
				
				switch(i) {
					case 1:
						a = figura;
						break;
					case 2:
						b = figura;
						break;
					case 3:
						c = figura;
						break;
					default:
				}//Fin del segundo switch
			}//Fin del bucle for
		
			//Comprobamos el resultado de la tirada.
			if (a == b && b == c && a == c) {
				System.out.print("\n¡Enhorabuena, ha ganado diez monedas!");
				monedas += 10;
			} else if (b == c) {
		        System.out.println("\n¡Bien!, ha recuperado su moneda.");
		        monedas++;
		    } else if (c == b) {
		        System.out.println("\n¡Bien!, ha recuperado su moneda.");
		        monedas++;
		    } else if (a == b || a == c) {
		        System.out.println("\n¡Bien!, ha recuperado su moneda.");
		        monedas++;
		    } else {
		    	System.out.print("\nLo siento, ha perdido su moneda");
		    }
			
			System.out.println("\nTiene " + monedas + " monedas");
		
		
		} while (monedas > 0);
		
		System.out.print("Lo siento, se ha quedado sin monedas");
	}
}
