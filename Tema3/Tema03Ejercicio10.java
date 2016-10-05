/*
 *
 * Realiza un conversor de Mb a Kb.
 *
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema03Ejercicio10 {
	public static void main(String[] args) {

	double megas;
	double kb;
	
	String linea;
	System.out.print("Introduzca los Mb que desea convertir a kilobytes: ");
	linea = System.console().readLine();
	megas = Double.parseDouble(linea);
	
	kb = megas * 1024;
	System.out.print("Los megas que quiere convertir:" + megas + "serían un total de: " + kb + "kilobytes");

	}
}
