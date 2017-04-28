/**
 * Ejercicio 4
 * Elecciones
 * 
 * @author Manuel Cerezo
 * 
 */

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner (System.in);
  
    //Presentamos el programa
    System.out.println("En este programa le pediremos información sobre el resultado de unas elecciones");
    System.out.println("--------------------------------------------------------------------------------");
    
    String[] nombrePartido = {"Ciudadanos", "Podemos", "PP", "PSOE", "Izquierda Unida", "UPyD"};
    double[] votacion = new double[6];
    int i;
          
    //Mostramos a los partidos
    for(i = 0; i < 6; i++){
      System.out.print(nombrePartido[i] + " || ");
    }
    
    System.out.println(" ");
    
    //Introducimos el número de votos en cada partido
    for(i = 0; i < votacion.length; i++){
      System.out.print("¿Cuantos votos ha obtenido el " + (i + 1) + " partido? ");
      votacion[i] = s.nextDouble();
    }
          
    System.out.println("-----------------------------------------------------");
          
    //Mostramos los votos conseguidos por cada partido
    for(i = 0; i < nombrePartido.length; i++){
      for(i = 0; i < votacion.length; i++){
        System.out.println(nombrePartido[i] + " ## " + votacion[i] + " votos");
      }
    }
          
    double sumaVotos = 0;
    for(i = 0; i < votacion.length; i++){
      sumaVotos += votacion[i];
    }
          
    double mediaVotos = sumaVotos / 5;
    
    System.out.println("La media de los votos de todos los partidos ha sido de " + mediaVotos + " votos");
    System.out.println("--------------------------------------------------------------------------------");
    
    System.out.println("Los partidos que han obtenido más votos que la media son: ");
    
    for(i = 0; i < nombrePartido.length; i++){
      for(i = 0; i < votacion.length; i++){
        if(votacion[i] >= mediaVotos){
          System.out.println(nombrePartido[i] + " || " + votacion[i]);
        } 
      }
    }
    
    System.out.println("\n------------------------------------------------------------------------------");
    
    System.out.println("Los partidos que han conseguido menos votos que la media son: ");
    
    for(i = 0; i < nombrePartido.length; i++){
      for(i = 0; i < votacion.length; i++){
        if(votacion[i] <= mediaVotos){
          System.out.println(nombrePartido[i] + " || " + votacion[i]);
        } 
      }
    }


  }
}
