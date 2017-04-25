/**
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 * @author Manuel Cerezo
 *
 */
public class Tema06Ejercicio19 {
	public static void main(String[] args) {
		
		int numero;
		int numeroParMaximo = 0;
		int numeroImparMinimo = 0;
		int suma = 0;
		
		for (int i = 0; i < 50; i++) {
			numero = (int)(Math.random() * 301) - 100;
		
			System.out.print(numero + " ");
			
			if (numero % 2 == 0) {
				if (numero > numeroParMaximo) numeroParMaximo = numero;
			} else {
				if (numero < numeroImparMinimo) numeroImparMinimo = numero;
			}
			
			suma += numero;
		
		} //Fin del bucle for
		
		System.out.print("\nNúmero máximo par: " + numeroParMaximo);
		System.out.print("\nNúmero mínimo impar: " + numeroImparMinimo);
		System.out.print("\nLa media de los números es: " + (suma / 50));
		
	}
}
