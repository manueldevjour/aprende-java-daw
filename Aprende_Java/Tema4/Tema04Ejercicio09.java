/**
 *
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("Introduzca el valor de las constantes de la ecuación de segundo grado para poder resolverla");
    
    System.out.print("Introduzca el valor de la primera constante: ");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la segunda constante: ");
    int b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor de la tercera constante: ");
    int c = Integer.parseInt(System.console().readLine());
    
    int discriminante = ((b * b) - 4 * a * c);
    
    double ecuacion1 = (- b + (Math.sqrt(discriminante)) / 2 * a);
    double ecuacion2 = (- b - (Math.sqrt(discriminante)) / 2 * a);
    
    //Corregir toda esta parte 

    if (discriminante > 0) {
      System.out.printf("El primer resultado de la ecuación sería %.3f: ", ecuacion1);
      System.out.printf("El segundo resultado de la ecuación sería %.3f: ", ecuacion2);
    } else if (discriminante == 0) {
      System.out.println("El resultado de la ecuación es doble, mismo resultado en positivo y negativo: " + ecuacion1 + " " + "y" + (- ecuacion2));
    } else if (discriminante < 0) {
      System.out.println("¡Error! La ecuación no tiene solución real");
    }
    
    //Hasta esta parte 
  }
}
