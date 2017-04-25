/**
 * Ejercicio 2. Mostrar mi nombre, direccion y telefono por pantalla
 *
 * @author Manuel Cerezo
 */

public class Tema01Ejercicio02 { // Clase principal
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";    
    
    System.out.println(rojo + "Manuel Cerezo Bonilla");
		System.out.println(verde + "Camino Locotta s/n");
		System.out.println(naranja + "617575970");
  }
}
