/**
 * 
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio23 {
	public static void main(String[] args) {
		
		String dado = "";
	    
	    for (int i = 0; i < 5; i++) {
	      switch((int)(Math.random() * 6)) {
	        case 0:
	          dado = "As";
	          break;
	        case 1:
	          dado = "K";
	          break;
	        case 2:
	          dado = "Q";
	          break;
	        case 3:
	          dado = "J";
	          break;
	        case 4:
	          dado = "7";
	          break;
	        case 5:
	          dado = "8";
	          break;
	        default:
	      }
	      System.out.print(dado + " ");
	}
	}
}
