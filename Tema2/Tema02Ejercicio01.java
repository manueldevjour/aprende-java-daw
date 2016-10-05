/**
 *
 * Escribe un programa en el que se declaren las variables enteras x e y .   Asignales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.
 *
 * R=Tambien se puede declarar la variable int sum = x + y y así no escribir tanto en una misma línea
 * @author Manuel Cerezo
 *
 */

public class Tema02Ejercicio01 {
	public static void main(String[] args) {
	
	int x = 144;
	int y = 999;
	
	System.out.println("Valor de la variable x = " + x);
	System.out.println("Valor de la variable y = " + y);
	System.out.println("Resultado de la suma = " + (x + y));
	System.out.println("Resultado de la resta = " + (x - y));
	System.out.println("Resultado de la división = " + (x / y));
	System.out.println("Resultado de la multiplicación = " + (x * y));
	
	}
}

