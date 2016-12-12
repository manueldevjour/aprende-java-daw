/**
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema06Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa.
		System.out.print("En este programa mostraremos 20 notas al azar: \nSuspenso, suficiente, bien, notable o sobresaliente.");
		System.out.print("\nPulse ENTER para comenzar el programa.");
		System.out.print("\n---------------------------------------------------");
		s.nextLine();
		
		int nota;//Variable donde almacenamos el número aleatorio.
		int suspenso = 0;//Contador para los suspensos.
		int suficiente = 0;//Contador para los suficientes.
		int bien = 0;//Contador para los bien.
		int notable = 0;//Contador para los notables.
		int sobresaliente = 0;//Contador para los sobresalientes.
		String calificacion = (" "); //Convierte a texto el valor que nos ha dado con el número aleatorio.
		
		//Con este bucle hacemos que nos de 20 números aleatorios y nos escriba por pantalla la nota.
		for(int i = 0; i < 20; i++) {
			nota = (int)(Math.random() * 5);
			
			switch (nota) {
			
			case 0:
				calificacion = ("suspenso");
				suspenso++;
				break;
			case 1:
				calificacion = ("suficiente");
				suficiente++;
				break;
			case 2:
				calificacion = ("bien");
				bien++;
				break;
			case 3:
				calificacion = ("notable");
				notable++;
				break;
			case 4:
				calificacion = ("sobresaliente");
				sobresaliente++;
				break;
				
			default: 
			}//Final del switch
			
		System.out.print(calificacion + " ");
		}//Final del for
		
		//Mostramos por pantalla el número de notas que hay en las 20 notas aleatorias.
		System.out.print("\nN�mero de suspenso: " + suspenso);
		System.out.print("\nN�mero de suficientes: " + suficiente);
		System.out.print("\nN�mero de bienes: " + bien);
		System.out.print("\nN�mero de notables: " + notable);
		System.out.print("\nN�mero de sobresalientes: " + sobresaliente);
		
	}
}
