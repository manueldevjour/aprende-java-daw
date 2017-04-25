/**
 *
 *
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio01 {
	public static void main(String[] args) {
		
		System.out.println("Escriba el dia de la semana para conocer la asignatura que tiene a primera hora:");
		String respuesta = System.console().readLine();
		
		if (respuesta.toUpperCase().equals("LUNES")) {
			System.out.println("Sistemas informaticos");
		} else if (respuesta.toUpperCase().equals("MARTES")) {
			System.out.println("Programacion");
		} else if (respuesta.toUpperCase().equals("MIERCOLES")) {
			System.out.println("Programacion");
		} else if (respuesta.toUpperCase().equals("JUEVES")) {
			System.out.println("Bases de datos");
		} else if (respuesta.toUpperCase().equals("VIERNES")) {
			System.out.println("Lenguaje de marcas");
		} else {
			System.out.println("Ese día de la semana no existe");
		}

	}
}		
