/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 * por espacios.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio04 {
	public static void main(String[] args) {
		
		//Presentamos el programa 
		System.out.print("En este programa mostraremos 20 números aleatorios entre 0 y 10, incluyendo a ambos.\n");
		System.out.print("-----------------------------------------------------------------------------------\n");

		//Creamos el bucle y la función Math.random para que nos cree 20 números aleatorios en un intervalo definido (entre 0 y 10).
		for(int i = 0; i < 20; i++) {
			int numero = (int)(Math.random() * 11);
			System.out.print(numero + " ");
		}
	}
}
