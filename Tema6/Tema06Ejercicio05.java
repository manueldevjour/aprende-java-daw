/**
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio05 {
	public static void main(String[] args) {
		
		int numeroMinimo = 100;
		int numeroMaximo = 199;
		int suma = 0;
		int numero;
		
		for(int i = 0; i < 50; i++) {
			numero = (int)(Math.random() * 100) +  100;
			System.out.println(numero + " ");
			suma += numero;
			
			if (numero < numeroMinimo) {
				numeroMinimo = numero;
			}
			
			if (numero > numeroMaximo) {
				numeroMaximo = numero;
			}
		}		
		
		System.out.println("El numero minimo es " + numeroMinimo);
		System.out.println("El numero maximo es " + numeroMaximo);
		System.out.println("La media es " + suma / 50);
	}
}
