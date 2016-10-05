/**
 *
 *
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * Area del rectángulo = base * altura 
 *
 * @author Manuel Cerezo
 * 
 */
 
public class Tema03Ejercicio05 {
	public static void main(String[] args) {
	
	int base;
	int altura;
	
	String linea;
	System.out.print("Introduzca el valor de la base: ");
	linea = System.console().readLine();
	base = Integer.parseInt(linea);
	System.out.print("Introduzca el valor de la altura: ");
	linea = System.console().readLine();
	altura = Integer.parseInt(linea);
	
	int area = base * altura;
	
	System.out.print("El area del rectangulo seria de: " + area);
	
	}
}
