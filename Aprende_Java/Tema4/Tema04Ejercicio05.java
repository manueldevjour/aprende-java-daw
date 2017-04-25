/**
 *
 *
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+ b = 0).
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio05 {
  public static void main(String[] args) {
      
    System.out.println("Introduzca las constantes de la ecuación ax+ b = 0 para poder resolverla. ");
   
    System.out.print("Introduzca el valor de la primera constante: ");
    int constante1 = Integer.parseInt(System.console().readLine());
    System.out.println(constante1);
    
    System.out.print("Introduzca el valor de la segunda constante: ");
    int constante2 = Integer.parseInt(System.console().readLine());
    System.out.println(constante2);
    
    double ecuacion = ((double) (- constante2) / constante1);
    
    if ((constante1 == 0) && (constante2 == 0)) {
      System.out.print("El valor de la ecuación es 0 (identidad)");
    } else if (constante2 == 0) {
      System.out.print("El resultado de la ecuación es: " + (int)ecuacion);
    } else if ((constante1 == 0) && (constante2 != 0)) {
      System.out.print("\n" + constante2 + " = 0 ¡ERROR!, introduzca un valor válido por favor.");
    } else {
      System.out.print("\nx = " + ecuacion);
    }  
  
  }
}
