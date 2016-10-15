/**
 *
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("Introduzca un número del 1 al 7 para conocer a qué día de la semana corresponde: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    
    switch (dia) {
    
    case 1:
      diaDeLaSemana = "Lunes";
      break;
    
    case 2:
      diaDeLaSemana = "Martes";
      break;
    
    case 3:
      diaDeLaSemana = "Miércoles";
      break;
      
    case 4:
      diaDeLaSemana = "Jueves";
      break;
      
    case 5:
      diaDeLaSemana = "Viernes";
      break;
      
    case 6:
      diaDeLaSemana = "Sábado";
      break;
      
    case 7:
      diaDeLaSemana = "Domingo";
      break;
      
    default:
      diaDeLaSemana = "¡¡Una semana solo tiene 7 días!!";

    }
    
    System.out.println("Dia " + dia + ": " + diaDeLaSemana);
  
  }
}
