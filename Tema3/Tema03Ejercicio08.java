/**
 *
 *
 * Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema03Ejercicio08 {
	public static void main(String [] args) {
	
	double horasTrabajadas;
	double salarioSemanal;
	
	String linea;
	System.out.print("Introduzca el numero de horas trabajadas en una semana: ");
	linea = System.console().readLine();
	horasTrabajadas = Double.parseDouble(linea);
	
	salarioSemanal = horasTrabajadas * 12;
	System.out.print("El salario que ha conseguido usted esta semana es de: " + salarioSemanal + "euros");

	}
}
