/**
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio13 {
	public static void main(String[] args) {
		
		//Presentamos el programa
		System.out.print("En este programa mostraremos la tirada de dos dados.");
		System.out.print("\nEl programa parará cuando el lanzamiento de los dos dados de el mismo valor.");
		System.out.print("\nPulse ENTER para comenzar el programa.");
		System.out.print("\n-----------------------------------------------------------------------------");
		int dado1;
		int dado2;
		
		do {
			dado1 = (int)(Math.random() * 6) + 1;
			dado2 = (int)(Math.random() * 6) + 1;
			
			System.out.print("\n" + dado1 + " ");
			System.out.print(dado2 + " ");
			System.out.println();
			
		}while(dado1 != dado2);//Fin del bucle do while.
	}
}
