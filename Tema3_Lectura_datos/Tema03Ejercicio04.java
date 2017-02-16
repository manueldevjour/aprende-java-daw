/**
 *
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
 *
 *
 * @author Manuel Cerezo
 *
*/

public class Tema03Ejercicio04 {
	public static void main(String[] args) {
	
	double primerNumero;
	double segundoNumero;
	String linea;
	
	System.out.print("Introduzca el primer numero: ");
	linea = System.console().readLine();
	primerNumero = Double.parseDouble(linea);
	
	System.out.print("Introduzca el segundo numero: ");
	linea = System.console().readLine();
	segundoNumero = Double.parseDouble(linea);
	
	//Operaciones
	
	double suma;
	suma = primerNumero + segundoNumero;
	
	double resta;
	resta = primerNumero - segundoNumero;
	
	double multiplicacion;
	multiplicacion = primerNumero * segundoNumero;
	
	double division;
	division = primerNumero / segundoNumero;
	
	
	System.out.println("El resultado de la suma es: " + suma);
	System.out.println("El resultado de la resta es: " + resta);
	System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
	System.out.println("El resultado de la division es: " + division);

	}
}
