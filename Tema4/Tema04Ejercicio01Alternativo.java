/**
 *
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio01Alternativo {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca el día de la semana con número(Lunes 1, Martes 2...): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String asignaturaQueToca;
    
    
    switch (dia) {
      
      case 1:
        asignaturaQueToca ="Sistemas informáticos";
        break;
        
      case 2:
        asignaturaQueToca = "Programación";
        break;
        
      case 3:
        asignaturaQueToca = "Programación";
        break;
        
      case 4:
        asignaturaQueToca = "Bases de datos";
        break;
        
      case 5:
        asignaturaQueToca = "Lenguaje de marcas";
        break;
        
      default:
        asignaturaQueToca = "No existe";
        
      }
      
      System.out.println("La asignatura que tienes a primera hora es " + asignaturaQueToca);
    
    }
}
