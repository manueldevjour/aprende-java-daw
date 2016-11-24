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
  
    //Presentamos el programa y pedimos el número del cuál deseamos conocer la tabla de multiplicar.
    System.out.print("Introduzca el número del que quiere conocer su tabla de multiplicar: ");
    numero = Integer.parseInt(System.console().readLine());
  
    //Con este bucle hacemos que el programa multiplique el número introducido por "i", que empieza en 0 y acaba en 10.
    for (int i = 0; i < 11; i++) {
      System.out.println("\n| " + numero + " * " + i + " = " + numero * i + " |");
    }
  
  }
}
