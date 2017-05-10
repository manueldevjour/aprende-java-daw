/**
 *
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
 *
 *
 * @author Manuel Cerezo 
 *
*/

public class Tema02Ejercicio04 {
	public static void main(String[] args) {
	
	//1 euro = 166.386 pesetas
	
	double euro = 9;
	double diferenciaEuroPesetas = 166.386;
	double peseta = euro * diferenciaEuroPesetas;
	
	System.out.println("Precio en euros: " + euro + "€");
	System.out.println("Precio en pesetas: " + peseta + "pesetas");

	}
}
