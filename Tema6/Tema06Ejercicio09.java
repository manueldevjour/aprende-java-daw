/**
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio09 {
	public static void main(String[] args) {
		
		int numero;
		
		//Presentamos el programa
		System.out.print("En este programa mostraremos todos los números pares entre 0 y 100, hasta que el número aleatorio que cree sea el 24.\n");
		System.out.print("--------------------------------------------------------------------------------------------------------------------\n");

		do { //En este bucle iremos creando un número aleatorio entre 0 y 100. Solamente mostraremos por pantalla los que sean pares.
				numero = (int)(Math.random() * 101);
				if (numero % 2 == 0) {
					System.out.print(numero + " ");
				}
		} while (numero != 24);//El bucle seguirá funcionando mientras el número no sea el 24. Cuando sea este, el programa finalizará.
		
	}
}
