/**
 * 
 * Parcial 2 Examen B
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */
 
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args){
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("Pintar una figura zigzagueante.");
    System.out.print("\nPulse ENTER para continuar.");
    System.out.print("\n------------------------------");
    s.nextLine();
    
    //Generamos el número aleatorio
    int num = (int)(Math.random() * 100001);
    
    //Imprimimos el número aleatorio
    System.out.printf("Numero generado: %d\n", num);
    
    //Comprobamos la longitud del número y lo guardamos
    int mult = 1;
    int contador = 0;
    while (mult < num) {
      mult = mult * 10;
      contador++;
    }
    mult = mult / 10;
    
    //Declaramos un array en el que vamos a meter los diferentes dígitos
    int[] digitos = new int[contador];
    contador = 0;
    while (num != 0) {
      digitos[contador] = num / mult;
      contador++;
      num = num % mult;
      mult = mult / 10;
    }
    
    // Establecemos el margen de la figura
    int espacios = 20;
    
    //La dirección de la figura se rige por (true = izquierda y false = derecha)
    boolean direcion = false;
    for (int i = 0; i < contador; i++) {
      //Si el dígito es 0 no tenermos que cambiar de dirección la zigzag
      if (digitos[i] != 0) {
        //Cambiamos la dirección del zigzag
        if (direcion) {
          direcion = false;
        } else {
          direcion = true;
        }
      }
      
      //Imprimimos el zigzag
      for (int j = 0; j < digitos[i]; j++) {
        if (direcion) {
          espacios++;
        } else {
          espacios--;
        }
        
        //Imprimimos los espacios
        for (int k = 0; k < espacios; k++) {
          System.out.printf(" ");
        }
        
        //Imprimimos el asterisco
        System.out.printf("*\n");
      }
    }
  }
}
