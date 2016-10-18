/**
 *
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Introduzca una hora del día (horas y minutos).");
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Introduzca los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    int segundosPasados = (hora * 3600) + (minuto * 60);
    int segundosQuedan = (24 * 3600) - segundosPasados;

    System.out.printf("Desde las" + " " + hora + " " + "horas" + " " + "y" + " " + minuto + " " + "minutos faltan" + " " + segundosQuedan + " " + "segundos para medianoche");
    
  }
}
