/**
 * 
 * Parcial 2 Examen A
 * @author Manuel Trinidad Cerezo Bonilla
 *
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    // Presentamos el programa
    System.out.println("\nBienvenid@, este programa pintará un camino aleatorio");
    System.out.println("------------------------------------------------------");
        
    // Introducimos la longitud 
    System.out.print("\nPor favor, introduzca la longitud del camino: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    int espacios = 6; // Almacenamos los espacios base
    //System.out.printf("\n%13s\n", " ");
    System.out.println();
    
    
    for (int i = 0; i < longitud; i++) {
        int espaciosAleatorios = (int)(Math.random()*3)-1;
      
          espacios += espaciosAleatorios;
      
          // Generamos los espacios resultantes y pintamos el carácter al final
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.print("#");
      //System.out.println();
      
      for (int x = 0; x < espacios; x++) {
        System.out.print(" ");
      }
      System.out.print("#");
      System.out.println();
    }
    System.out.println();
  }
}
