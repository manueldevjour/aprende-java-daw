/**
 *
 * Ejercicio 5. Colorear el horario de clase
 *
 *
 *
 * @author Manuel Cerezo
 */

public class Tema01Ejercicio05 {
  public static void main(String[] args) {

		String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(celeste + "Lunes\tMartes\tMiercol\tJueves\tViernes");
    System.out.println("======\t=======\t======\t======\t======");
    System.out.println(morado + "SISTINF" + azul + "\tPROG\tPROG" + rojo + "\tBBDD" + naranja + "\tLM");
    System.out.println(morado + "SISTINF" + azul + "\tPROG\tPROG" + rojo + "\tBBDD" + naranja + "\tLM");
    System.out.println(morado + "SISTINF" + azul + "\tPROG" + naranja + "\tLM" + rojo + "\tBBDD" + verde + "\tED");
		System.out.println(celeste + "_____\t_____\t______\t_____\t_____");
    System.out.println(blanco + "FOL" + rojo + "\tBBDD" + naranja + "\tLM" + azul + "\tPROG" + morado + "\tSISTINF");
    System.out.println(blanco + "FOL" + rojo + "\tBBDD" + verde + "\tED" + azul + "\tPROG" + morado + "\tSISTINF");
    System.out.println(blanco + "FOL" + rojo + "\tBBDD" + verde + "\tED" + azul + "\tPROG" + morado + "\tSISTINF");
  }
}

