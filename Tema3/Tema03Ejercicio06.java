/**
 *
 *
 * Escribe un programa que calcule el área de un triángulo.
 *
 *
 * @author Manuel Cerezo 
 *
 */
 
public class Tema03Ejercicio06 {
	public static void main(String[] args) {
		
	double base;
	double altura;
	
	String linea;
	System.out.print("Introduzca el valor de la base: ");
	linea = System.console().readLine();
	base = Double.parseDouble(linea);
	System.out.print("Introduzca el valor de la altura: ");
	linea = System.console().readLine();
	altura = Double.parseDouble(linea);
	
	double area = (base * altura) / 2;
	
	System.out.print("El area del triangulo seria de: " + area);	
		



 }
}
