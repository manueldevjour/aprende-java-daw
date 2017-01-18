import matematicas.Varios;

/**
 * Ejercicio 15
 * 
 * @author Manuel Cerezo
 * 
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    for(int i = 1; i < 1001; i++) {
      if(Varios.esPrimo(i)) {
        System.out.print(i + " ");

      }
    }
  }
}
