/**
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 * 
 * @author Manuel Cerezo
 *
 */
import java.util.Scanner;

public class Tema06Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		//Presentamos el programa
		System.out.print("En este programa, mostraremos por pantalla diez líneas");
		System.out.print("\nCada línea tendrá un carácter elegido aleatoriamente");
		System.out.print("\nLa longitud de la línea será también aleatoria (entre 1 y 40)");
		System.out.print("\nPulse ENTER para continuar con el programa");
		s.nextLine();
		
		String caracter = (" ");
	    int numCaracter = 0; 
	            
	    for (int i = 1; i <= 10; i++) { 
	      numCaracter = (int)(Math.random()*6) + 1;
	      int longitud = (int)(Math.random()*40) + 1;
	      
	      switch (numCaracter) { 
	        case 1:
	        caracter = (".");
	        break;
	        
	        case 2:
	        caracter = ("=");
	        break;
	        
	        case 3:
	        caracter = ("-");
	        break;
	        
	        case 4:
	        caracter = ("*");
	        break;
	        
	        case 5:
	        caracter = ("|");
	        break;
	        
	        case 6:
	        caracter = ("@");
	        break;
	        
	        default:
	      }
	      
	      for (int j = 1; j <= longitud; j++) {
	        System.out.print(caracter);
	      }
	      
	      System.out.println();
	    } 
	}
}
