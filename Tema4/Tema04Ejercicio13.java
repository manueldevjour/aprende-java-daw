/**
 *
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio13 {
  public static void main(String[] args) {

    System.out.print("Introduzca el primer número: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tercer número: ");
    int numero3 = Integer.parseInt(System.console().readLine());
    
    if ((numero3 > numero2) && (numero2 > numero1)) {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero1 + ", " + numero2 + " " + "y " + numero3); 
    } else if ((numero2 > numero3) && (numero3 > numero1)) {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero1 + ", " + numero3 + " " + "y " + numero2);
    } else if ((numero1 > numero3) && (numero3 > numero2)) {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero2 + ", " + numero3 + " " + "y " + numero1);
    } else if ((numero3 > numero1) && (numero1 > numero2)) {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero2 + ", " + numero1 + " " + "y " + numero3);
    } else if ((numero2 > numero1) && (numero1 > numero3)) {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero3 + ", " + numero1 + " " + "y " + numero2);
    } else {
      System.out.println("Los números se han ordenado de menor a mayor a: " + numero3 + ", " + numero2 + " " + "y " + numero1);
    }

  }
}
