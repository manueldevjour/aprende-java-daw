/**
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Manuel
 *
 */

public class Tema06Ejercicio07 {
	public static void main(String[] args) {
		
		int resultadoEncuentro;
		int columnas = 3;
		
		//Presentamos el programa
		System.out.print("En este programa, generaremos una quiniela aleatoria. Con 3 columnas y el pleno al 15.\n");
		//Con este bucle dibujamos la tabla que vamos a usar. Cuando la fila sea la decimoquinta, solo dibujaremos una columna, ya que es el pleno al 15 y es común para todas las columnas.
		for (int fila = 1; fila <= 15; fila++){
			System.out.printf("%4d. |", fila);
			
			if (fila == 15) {
				columnas = 1;
			}
			
			for(int apuesta = 1; apuesta <=columnas; apuesta++) { //Con este bucle, hacemos que nos de un número entre 0 y 2 que lo convertiremos a 1, X o 2 respectivamente.
					resultadoEncuentro = (int)(Math.random() * 3);
					switch (resultadoEncuentro) {
					case 0:
						System.out.print("1|");
						break;
					case 1:
						System.out.print("X|");
						break;
					case 2:
						System.out.print("2|");
					default:
					}
			}
			System.out.println();
		}
	}
}
