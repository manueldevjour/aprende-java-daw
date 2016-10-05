/**
 *
 *
 * Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3*(PIr²h)
 *
 * @author Manuel Cerezo 
 *
 *
 */
 
public class Tema03Ejercicio09 {
	public static void main(String[] args) {

	double radio;
	double altura;
	double pi = 3.1415;
	
	String linea;
	System.out.print("Inserte el valor del radio del cono: ");
	linea = System.console().readLine();
	radio = Double.parseDouble(linea);
	System.out.print("Inserte el valor de la altura del cono: ");
	linea = System.console().readLine();
	altura = Double.parseDouble(linea);
	
	double volumen = (pi * (radio * radio) * altura) / 3;
	System.out.print("El volumen del cono sería de: " + volumen);

	}
}
