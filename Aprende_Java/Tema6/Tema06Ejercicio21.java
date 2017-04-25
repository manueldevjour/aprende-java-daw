/**
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 c�ntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio21 {
	public static void main(String[] args) {
		
		String moneda = "";
	    String lado = "";
	    
	    for (int i = 0; i < 5; i++) {
	      switch((int)(Math.random() * 8)) {
	        case 0:
	          moneda = "1 céntimo";
	          break;
	        case 1:
	          moneda = "2 céntimos";
	          break;
	        case 2:
	          moneda = "5 céntimos";
	          break;
	        case 3:
	          moneda = "10 céntimos";
	          break;
	        case 4:
	          moneda = "20 céntimos";
	          break;
	        case 5:
	          moneda = "50 céntimos";
	          break;
	        case 6:
	          moneda = "1 euro";
	          break;
	        case 7:
	          moneda = "2 euros";
	        default:
	      }
	      
	      switch((int)(Math.random() * 2)) {
	        case 0:
	          lado = "cara";
	          break;
	        case 1:
	          lado = "cruz";
	          break;
	        default:
	      }
	      
	      System.out.println(moneda + " - " + lado);
	    }
	}
}
