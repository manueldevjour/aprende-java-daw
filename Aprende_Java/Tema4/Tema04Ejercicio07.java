/**
 *
 * Realiza un programa que calcule la media de tres notas.
 *
 *
 * @author Manuel Cerezo
 *
 */

public class Tema04Ejercicio07 {
	public static void main(String[] args) {

		//Declaración de las variables, recoger las notas y guardarlas.
		System.out.println("Introduzca la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Introduzca la nota del segundo examen: ");
		double nota2 = Double.parseDouble(System.console().readLine());

		System.out.println("Introduzca la nota del tercer examen: ");
		double nota3 = Double.parseDouble(System.console().readLine());

		//Imprimir por pantalla las notas de los 3 exámenes
		System.out.println("Nota del primer examen:" + nota1);
		System.out.println("Nota del segundo examen:" + nota2);
		System.out.println("Nota del tercer examen:" + nota3);
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("La media de los 3 exámenes es de: " + media);
		if (media < 5) {
			System.out.println("Lo siento, ¡has suspendido! 😣");
		} else if ((media >= 5) && (media < 9)) {
			System.out.println("Enhorabuena, ¡has aprobado! 😃");
		} else if (media >= 9) {
			System.out.println("Enhorabuena, ¡tienes un sobresaliente! 😁😁");
		}
	}
}
