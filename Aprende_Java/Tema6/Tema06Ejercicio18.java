/**
 * 
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 * que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 * violeta y naranja.
 * 
 * @author Manuel Cerezo
 *
 */
public class Tema06Ejercicio18 {
	public static void main(String[] args) {
		
		int color1;
		int color2;
		int color3;
		
		do {
			color1 = (int)(Math.random() * 6);
			color2 = (int)(Math.random() * 6);
			color3 = (int)(Math.random() * 6);
		} while((color1 == color2) || (color1 == color3) || (color2 == color3));
		
		String habitacion1 = "";
		String habitacion2 = "";
		String habitacion3 = "";
		
		switch(color1) {
			case 0:
				habitacion1 = "rojo";
				break;
			case 1:
				habitacion1 = "azul";
				break;
			case 2:
				habitacion1 = "verde";
				break;
			case 3:
				habitacion1 = "amarillo";
				break;
			case 4:
				habitacion1 = "violeta";
				break;
			case 5:
				habitacion1 = "naranja";
				break;
			default:
		}
		
		switch(color2) {
			case 0:
				habitacion2 = "rojo";
				break;
			case 1:
				habitacion2 = "azul";
				break;
			case 2:
				habitacion2 = "verde";
				break;
			case 3:
				habitacion2 = "amarillo";
				break;
			case 4:
				habitacion2 = "violeta";
				break;
			case 5:
				habitacion2 = "naranja";
				break;
			default:
		}
		
		switch(color3) {
			case 0:
				habitacion3 = "rojo";
				break;
			case 1:
				habitacion3 = "azul";
				break;
			case 2:
				habitacion3 = "verde";
				break;
			case 3:
				habitacion3 = "amarillo";
				break;
			case 4:
				habitacion3 = "violeta";
				break;
			case 5:
				habitacion3 = "naranja";
				break;
			default:
		}
	
		System.out.print("Los colores de la habitación son:");
		System.out.print("\n- Habitación 1: " + habitacion1);
		System.out.print("\n- Habitación 2: " + habitacion2);
		System.out.print("\n- Habitación 3: " + habitacion3);
	}
}
