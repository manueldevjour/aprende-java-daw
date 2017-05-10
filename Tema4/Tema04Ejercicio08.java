/** 
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Manuel Cerezo
 *
 */

public class Tema04Ejercicio08 {
	public static void main(String[] args) {

		//Declaración de las variables, recoger las notas y guardarlas.
		System.out.print("Introduzca la nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduzca la nota del segundo examen: ");
		double nota2 = Double.parseDouble(System.console().readLine());

		System.out.print("Introduzca la nota del tercer examen: ");
		double nota3 = Double.parseDouble(System.console().readLine());

		//Imprimir por pantalla las notas de los 3 exámenes
		System.out.println("Nota del primer examen:" + nota1);
		System.out.println("Nota del segundo examen:" + nota2);
		System.out.println("Nota del tercer examen:" + nota3);
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("La media de los 3 exámenes es de: " + media);
		
		if (media < 5) {
			System.out.println("Insuficiente");
		} else if ((media >= 5) && (media < 6)) {
			System.out.println("Suficiente");
		} else if ((media >= 6) && (media < 7)) {
			System.out.println("Bien");
		} else if ((media >= 7) && (media < 9)) {
			System.out.println("Notable");
		} else if (media >= 9) {
			System.out.println("Sobresaliente");
		}
	}
}
