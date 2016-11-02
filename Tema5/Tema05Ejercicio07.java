/**
 *
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Manuel Cerezo
 * 
 */ 
 
public class Tema05Ejercicio07 {
  public static void main(String[] args) {

  int intentos = 4;
  int password = 1223;
  
  do {
    System.out.print("Introduzca la clave de la caja fuerte. Recuerde que solamente tiene 4 intentos: ");
    password = Integer.parseInt(System.console().readLine());
    
    if (password == 1223) {
      System.out.println("Enhorabuena, la contraseña introducida es la correcta. Puede abrir su caja fuerte.");
    } else {
      intentos--;
    }
  
  } while((password != 1223) && (intentos > 0));
  
  }
}
