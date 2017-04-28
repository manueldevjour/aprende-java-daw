/**
 * 
 * @author Manuel Cerezo
 * 
 */
 
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    //Presentamos el programa
    System.out.print("En este programa crearemos un menú de un restaurante vegatariano aleatoriamente.");
    System.out.print("\nDeberá de introducir el día de la semana: 1 Lunes, 2 Martes, etc....");
    System.out.print("\nPulse ENTER para comenzar.");
    System.out.print("\n--------------------------------------------------------------------------------");
    s.nextLine();
    
    
    //Preguntamos el día de la semana
    System.out.print("\nPor favor, introduzca un día de la semana (en números): ");
    int diaSemana = s.nextInt();
    
    //If para controlar que dia de la semana se introduce
    if(diaSemana < 6) {
      
      //Creamos el primer plato y la aleatoriedad
      int primerPlato = (int)(Math.random() * 3);
    
      String primero = "";
    
      switch(primerPlato) {
        case 0:
          primero = "ensalada";
          break;
        case 1:
          primero = "pasta";
          break;
        case 2: 
          primero = "arroz";
          break;
        default:
      }
      
      //Segundo plato
      int segundoPlato = (int)(Math.random() * 3);
      
      String segundo = "";
      
      switch(segundoPlato) {
        case 0:
          segundo = "hamburguesas de soja";
          break;
        case 1:
          segundo = "filetes de seitán";
          break;
        case 2:
          segundo = "albóndigas de tofu";
          break;
        default:
      }
      
      //Guarnicion
      int guarnicion = (int)(Math.random() * 3);
      
      String platoGuarnicion = "";
      
      switch(guarnicion) {
        case 0:
          platoGuarnicion = "patatas bravas";
          break;
        case 1:
          platoGuarnicion = "verduras a la plancha";
          break;
        case 2:
          platoGuarnicion = "pimientos asados";
          break;
        default:
      }
      
      //Postre
      int postre = (int)(Math.random() * 3);
      
      String platoPostre = "";
      
      switch(postre) {
        case 0:
          platoPostre = "flan";
          break;
        case 1:
          platoPostre = "helado";
          break;
        case 2:
          platoPostre = "arroz con leche";
          break;
        default:
      }
      
      //Escribimos por pantalla el resultado final del menu vegano aleatorio
      System.out.print("De primero hay " + primero + ", " + segundo + " de segundo" + " con " + platoGuarnicion + " de guarnicion" + " y " + platoPostre + " de postre");
    
    } else if(diaSemana == 6) {
      System.out.print("\nLo sentimos, el sábado no tenemos menú disponible.");
    } else if(diaSemana == 7) {
      System.out.print("\nLo sentimos, el domingo no tenemos menú disponible.");
    }
    
    
  }
}
