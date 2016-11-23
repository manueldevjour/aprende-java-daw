/**
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
 * es menor o mayor que el número secreto.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema06Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Presentamos el programa.
		System.out.println("En este programa, el ordenador 'pensará' un número al azar, que usted debe de adivinar.");
		System.out.println("También le dirá si el número es mayor o menor al que ha introducido.");
		System.out.println("---------------------------------------------------------------------------------------");
		
		int intentos = 5; //Especificamos el número de intentos para adivinar el numero.
		int numeroSecreto; //Este será el número que pensará el ordenador.
		int numeroIntroducido; //Este será el número que introduzca el usuario.
		
		numeroSecreto = (int)(Math.random() * 101); //El número aleatorio será entre 0 y 100, donde existen 101 posiciones.
		
		do { //Bucle para preguntar el número hasta que el usuario acierte y se acaben los intentos.
			System.out.print("\nIntroduzca un número: ");
			numeroIntroducido = s.nextInt();
		
			if (numeroIntroducido == numeroSecreto) {
				System.out.println("¡Enhorabuena, el número introducido es el que estaba pensando el ordenador!");
			} else {
				System.out.println("El número que ha introducido no es el correcto. Por favor, inténtelo de nuevo.");
				intentos--;
				System.out.println("Le quedan " + intentos + " intentos");
			}
			
			if (numeroIntroducido < numeroSecreto) {
				System.out.println("Además, el número introducido es menor que el número que ha pensado el ordenador. Introduzca un número más grande");
			} else if (numeroIntroducido > numeroSecreto) {
				System.out.println("El número introducido es mayor que el número que ha pensado el ordenador. Introduzca uno más pequeño");
			}
		} while ((numeroSecreto != numeroIntroducido) && (intentos > 0));
		
		if ((intentos == 0) && (numeroSecreto != numeroIntroducido)) {
			System.out.println("Lo sentimos, se ha quedado sin intentos.");
		}
	}
}
