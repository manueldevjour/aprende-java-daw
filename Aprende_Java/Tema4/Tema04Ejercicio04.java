/**
 *
 *
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio04 {
  public static void main(String[] args) {
  
    System.out.println("Número de horas trabajadas: ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    double salario;
    
    if (horasTrabajadas <= 40) {
      salario = horasTrabajadas * 12;
      System.out.println("El sueldo que usted ha ganado esta semana es de: " + salario + "€");
    } else if (horasTrabajadas >= 41) { 
      salario = 480 + (horasTrabajadas - 40) * 16;
      System.out.println("El sueldo que usted ha ganado esta semana es de: " + salario + "€");
    } else if (horasTrabajadas == 0) {
      System.out.println("Usted no ha ganado esta semana nada porque no ha trabajado.");
    }
     
  }
}
