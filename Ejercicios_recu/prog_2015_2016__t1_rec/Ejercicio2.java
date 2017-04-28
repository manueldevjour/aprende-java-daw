/**
 * Ejercicio 2
 * Versión tacaña
 * 
 * @author Manuel Cerezo;
 * 
 */

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.println(" Versión tacaña de un número ");
    System.out.println("----------------------------");
          
    System.out.println("Introduzca el número: ");
    long numero = s.nextLong();
    System.out.println("----------------------");
          
    long numeroInvertido = 0;
    int digito = 0; 
          
    //Con este bucle while invertimos el número
    while (numero > 0){
      digito = (int) (numero % 10);
      numeroInvertido = (numeroInvertido * 10) + digito;
      numero /= 10;
    }

    //Invertimos de nuevo el número y sacamos los dígitos en orden, pero solo unos pocos.
    boolean encontrado = false;

    int aleatorio = 0;
    long nuevoNumero = 0;
    
    while (numeroInvertido > 0){
      digito = (int) (numeroInvertido % 10);
      aleatorio = (int)(Math.random() * 2);

      if(aleatorio == 1){
        nuevoNumero = (nuevoNumero * 10) + digito;
        encontrado = true;
      }
              
      numeroInvertido /= 10;
    }
          
    System.out.println(nuevoNumero);
    System.out.println("---------------------------------------------------------------------");


  }
}

