/**
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero. En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 * 
 * @author Manuel Cerezo
 *
 */

import java.util.Scanner;

public class Tema07Ejercicio04 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, mostraremos en 3 columnas el contenido de 3 arrays.");
		System.out.print("\nPulse ENTER para comenzar el programa.");
		s.nextLine();
		
		//Declaramos los arrays
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		int i; //Variable que usaremos en los bucles.
		
		//Bucle for para crear los valores de los diferentes arrays.
		for(i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random() * 101);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
		}
		
		System.out.print("\n n   |   n²  |   n³\n-----|-------|-----");
		
		for(i = 0; i < 20; i++) {
			System.out.printf("\n%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
		}
	}
}
