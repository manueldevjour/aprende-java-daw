/**
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √ (2h/g) siendo g = 9,81m/s2
 *
 * @author Manuel Cerezo
 *
 *
 */
 
public class Tema04Ejercicio06 {
	public static void main(String[] args) {
		
		double gravedad = 9.81;
		
		//Pedimos el dato de la altura por teclado. 
		System.out.print("Introduzca la altura a la que el objeto es arrojado (en metros):");
		double altura = Double.parseDouble(System.console().readLine());
		System.out.println(altura + "metros");
		
		//Calculamos la fórmula para hallar el tiempo.
		double tiempo = Math.sqrt((2 * altura) / (gravedad));
		
		//Declaramos las condiciones para que la fórmula se pueda realizar.
		if (tiempo < 0) {
			System.out.println("\nLa fórmula no se puede calcular ya que la altura que ha introducido es negativa");
		} else if (tiempo == 0) {
			System.out.println("\nEl tiempo será 0 ya que el objeto cae desde una altura = 0");
		} else {
			System.out.printf("\nEl tiempo que tardará en caer el objeto será de %.4f\n:", tiempo, "segundos");
		}
	}
}
