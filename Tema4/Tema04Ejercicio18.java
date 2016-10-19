/**
 *
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio18 {
	public static void main(String[] args) {
		
		int primeraCifra = 0;
		
		System.out.print("Por favor, introduzca un número (máximo 5 cifras): ");
		int numero = Integer.parseInt(System.console().readLine());
		
		if (numero < 10) {
			primeraCifra = numero;
		}
		
		if (( numero >= 10 ) && ( numero < 100 )) {
      primeraCifra = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      primeraCifra = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      primeraCifra = numero / 1000;
    }
    
    if ( numero >= 10000 ) {
      primeraCifra = numero / 10000;
    }
    
		System.out.println("La primera cifra del número introducido es: " + primeraCifra);






	}
}
