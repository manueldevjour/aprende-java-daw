/**
 *
 *
 * Realiza un conversor de Kb a Mb.
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema03Ejercicio11 {
	public static void main(String[] args) {

	double megas;
	double kb;
	
	String linea;
	System.out.print("Introduzca los kilobytes que desea convertir a Mb: ");
	linea = System.console().readLine();
	kb = Double.parseDouble(linea);
	
	megas = kb / 1024;
	System.out.print("Los kilobytes que quiere convertir:" + " " + kb + "\n serían un total de: " + megas + "megabytes");

	}
}
