/**
 * 
 * @author Manuel Cerezo
 * 
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
    
    //Declaramos las variables
    int altura = 0;
    int bolita = 0;
    
    do {
      System.out.println ("Introduce la altura de la semipiramide (numero entero mayor a 3)");
      altura = Integer.parseInt(System.console().readLine());
    
    } while (altura < 3);
    
    System.out.println ();
    
    bolita = (int)((Math.random() * altura) + 1);
    
    for (int i = 1; i <= altura; i++) {
      
      for (int x = 0; x < i; x++) 
        System.out.print ("#");
      
      if (i == bolita) 
        System.out.print ("O");
      
      
      System.out.println();
    }
    
  }
}
