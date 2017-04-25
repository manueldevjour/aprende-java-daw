/**
 *
 *
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 *
 *
 @author Manuel Cerezo 
 *
 */

public class Tema02Ejercicio05 {
	public static void main(String[] args) {
		
	double peseta = 500000;
	double diferenciaPesetasEuro = 0.006;
	double euro = peseta * diferenciaPesetasEuro;

	System.out.println("Pesetas: " + peseta);
	System.out.println("Euros: " + euro + "€");
	
	}
}
