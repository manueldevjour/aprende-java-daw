/** 
 *
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema05Ejercicio08 {
  public static void main(String[] args) {

  int numero;
  
  System.out.print("Introduzca el número del que quiere conocer su tabla de multiplicar: ");
  numero = Integer.parseInt(System.console().readLine());
  
  for (int i = 0; i < 11; i++) {
    System.out.println(numero + " * " + i + " = " + numero * i);
  }
  
  }
}
