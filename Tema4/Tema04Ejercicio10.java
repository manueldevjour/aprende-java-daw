/**
 *
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.print("Escriba el mes en el que nació: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escriba el día en el que nacio: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
    
      case 3:
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es ARIES");
        } else {
          System.out.println("Su signo del zodiaco es PISCIS");
        }

      case 4:
        if ((dia > 30) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es TAURO");
        } else {
          System.out.println("Su signo del zodiaco es ARIES");
        }
        
      case 5:
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 31) {
          System.out.println("Su signo del zodiaco es GÉMINIS");
        } else {
          System.out.println("Su signo del zodiaco es TAURO");
        }
          
      case 6: 
        if ((dia > 30) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es CÁNCER");
        } else {
          System.out.prinln("Su signo del zodiaco es GÉMINIS");
        }
          
      case 7: 
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es LEO");
        } else {
          System.out.println("Su signo del zodiaco es CÁNCER");
        }
          
      case 8:
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 22) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es VIRGO");
        } else {
          System.out.println("Su signo del zodiaco es LEO");
        }
          
      case 9:
        if ((dia > 30) && (dia == 0)) {
          System.out.printl("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 23) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es LIBRA");
        } else {
          System.out.println("Su signo del zodiaco es VIRGO");
        }
        
      case 10:
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 23) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es ESCORPIO");
        } else {
          System.out.println("Su signo del zodiaco es LIBRA");
        }
          
      case 11: 
        if ((dia > 30) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 23) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es SAGITARIO");
        } else {
          System.out.println("Su signo del zodiaco es ESCORPIO");
        }
          
      case 12:
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 21) && (dia <= 31)) {
          System.out.prinln("Su signo del zodiaco es CAPRICORNIO");
        } else {
          System.out.println("Su signo del zodiaco es SAGITARIO");
        }
          
      case 1: 
        if ((dia > 31) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a repetirlo.");
        } else if ((dia >= 20) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es ACUARIO");
        } else {
          System.out.println("Su signo del zodiaco es CAPRICORNIO");
        }
          
      case 2:
        if ((dia > 28) && (dia == 0)) {
          System.out.println("Lo siento, ese día no existe, vuelva a intentarlo.");
        } else if ((dia >= 19) && (dia <= 28)) {
          System.out.println("Su signo del zodiaco es PISCIS");
        } else {
          System.out.println("Su signo del zodiaco es ACUARIO");
        }        
         
    }
  }
}
