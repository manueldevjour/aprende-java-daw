/**
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 * sería el 1). 
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio02 {
	public static void main(String[] args) {
		
		//Presentamos el programa
		System.out.print("En este programa vamos a mostrarle una carta al azar de la baraja francesa.");
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.println();
		
		//Creamos un número aleatorio para que nos muestre el valor de la carta.
		int numero = (int)(Math.random() * 13) + 1; 
			if (numero == 1) {
				System.out.print("As de");
			} else if (numero == 11) {
				System.out.print("J de");
			} else if (numero == 12) {
				System.out.print("Q de");
			} else if (numero == 13) {
				System.out.print("K de");
			} else {
				System.out.print(numero + " de");
			}
					
		//Creamos otro número aleatorio. Creamos un switch para que el número aleatorio que nos de se convierta en una cadena de carácteres (un palo de la baraja).
		int palo = (int)(Math.random() * 4) + 1;
		
		switch (palo) {
			case 1: 
				System.out.print(" picas");
			break;
			
			case 2:
				System.out.print(" corazones");
			break;
			
			case 3:
				System.out.print(" diamantes");
			break;
			
			case 4:
				System.out.print(" tréboles");
			break;		
		
		}//Fin bucle switch
	}
}
