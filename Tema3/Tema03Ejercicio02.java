/**
 *
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
 *
 * 1 euro = 166.386 pesetas
 * @author Manuel Cerezo
 */
 
public class Tema03Ejercicio02 {
	public static void main(String[] args) {

	String linea;
	
	System.out.print("Introduzca la cantidad de euros que desea convertir a pesetas: ");
	linea = System.console().readLine();
	double euro;
	euro = Double.parseDouble(linea);
	
	double diferenciaEuroPesetas = 166.386;
	double peseta = euro * diferenciaEuroPesetas;
	
	System.out.print("El numero de pesetas seria de: " + peseta + "pesetas");
	
	
	}
}
