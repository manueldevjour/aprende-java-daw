import matematicas.Varios;

/**
 * Ejercicio 16
 *
 * @author Manuel Cerezo
 * 
 */
public class Ejercicio16 {
  public static void main(String[] args) {
  
    for(int i = 1; i < 100000; i++) {
      if(Varios.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
