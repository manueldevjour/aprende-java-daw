/**
 * 
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio08 {
	public static void main(String[] args) {
		
		int resultadoEncuentro;
		int columnas = 3;
		
		//Presentamos el programa
		System.out.print("En este programa haremos una quiniela aleatoria.\n");
		System.out.print("El equipo que juegue en casa, tendrá más posibilidades que ganar. 3/6 de posibilidades.\n");
		System.out.print("---------------------------------------------------------------------------------------\n");

		//Bucle para dibujar la quiniela.
		for (int fila = 1; fila <= 15; fila++){
			System.out.printf("%4d. |", fila);
			
			if (fila == 15) {
				columnas = 1;
			}
			
			for(int apuesta = 1; apuesta <=columnas; apuesta++) {
					resultadoEncuentro = (int)(Math.random() * 6);
					switch (resultadoEncuentro) { //Hacemos un switch para hacer las posibilidades de la quiniela. El equipo que juegue en casa siempre tendrá más posibilidades de ganar que el que juegue fuera.
					case 0:
						System.out.print("1|");
						break;
					case 1:
						System.out.print("1|");
						break;
					case 2:
						System.out.print("1|");
						break;
					case 3:
						System.out.print("X|");
						break;
					case 4:
						System.out.print("X|");
						break;
					case 5:
						System.out.print("2|");
					default:
					}
			}
			System.out.println();
		}
	}
}
