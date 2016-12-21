import java.util.Scanner;

public class Tema07Ejercicio08 {
	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa.
		System.out.print("En este programa, le pediremos las temperaturas medias de cada mes del año.");
		System.out.print("\nPara comenzar con el programa, pulse ENTER.");
		System.out.print("\n--------------------------------------------------------------------------");
		s.nextLine();
		
		//Comenzamos a declarar los distintos arrays y variables que necesitamos.
		
		String[] mes = {
			"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
		};

		int[] temperaturas = new int[12];
		int i;
		int j;
		
		//Procedemos a crear los bucles para que muestre por pantalla los meses del año, y se almacene en el array las temperaturas.
		for( i = 0; i < 12; i++) {
			System.out.print("Introduzca la temperatura media del mes de " + mes[i] + ": ");//Mostramos por pantalla 12 veces, que nos diga la temperatura del mes que corresponda.
			temperaturas[i] = Integer.parseInt(s.nextLine());
		}

		for(i = 0; i < 12; i++) {
			System.out.printf("%-10s  |  ", mes[i]);
			for(j = 0; j < temperaturas[i]; j++) {
				System.out.print("●");//Mostramos este caracter por cada grado centígrado que haya en un mes
			}

			System.out.println(" " + temperaturas[i] + "ºC"); //Mostramos por pantalla las temperaturas del año.
		}
	}
}
