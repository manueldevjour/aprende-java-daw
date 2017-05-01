package array;

import java.util.Scanner;

//Funciones para usar en el menú

public class funciones {
	
	Scanner s = new Scanner (System.in);
    Scanner n = new Scanner (System.in);
	  /**
	   * Muestra la lista de los productos
	   * 
	   * @param marca
	   * @param almacenamiento
	   * @param tipo
	   * @param conexion
	   * @param precio
	   */
	  public static void mostrarListado(String marca[], String almacenamiento[], String tipo[], String conexion[], float precio[]) {
		  System.out.println("┏━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━┳━━━━━━━━━┓");
		  System.out.printf("┃ %-4s ┃ %-7s ┃   %-7s  ┃ %-7s    ┃ %-8s ┃ %7s ┃", "ÍNDICE", "MARCA", "ALMACENAMIENTO", "TIPO", "CONEXION", "PRECIO");
		  for(int i = 0; i < marca.length; i++) {
			  if (marca[i] == null) {
			  } else {
			  System.out.print("\n┣━━━━━━━━╋━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━╋━━━━━━━━━━╋━━━━━━━━━┫");
			  System.out.printf("\n┃ %-4s   ┃ %-7s ┃    %-7s        ┃  %-7s   ┃ %-8s ┃%7.2f€ ┃", (i + 1), marca[i], almacenamiento[i], tipo[i], conexion[i], precio[i]);
			  }
		  }
		  System.out.println("\n┗━━━━━━━━┻━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━┻━━━━━━━━━━┻━━━━━━━━━┛");
	  }
	  
	  /**
	   * Añadimos un nuevo articulo a la lista
	   * 
	   * @param marca
	   * @param almacenamiento
	   * @param tipo
	   * @param conexion
	   * @param precio
	   */
	  public static void nuevoArticulo(String marca[], String almacenamiento[], String tipo[], String conexion[], float precio[]) {
		  Scanner n = new Scanner(System.in);
		  int espacioDisponible = 0;
		  int repeticiones = marca.length - 1;
		  int inicio = 0;
		  boolean esEspacioLibre = false;

		  while (repeticiones >= 0 && !esEspacioLibre) { 
			  if (marca[inicio] == null) {
				  espacioDisponible = inicio;
				  esEspacioLibre = true;
			  }
			  repeticiones--;
			  inicio++;
		  }
		   
		  if (esEspacioLibre) {
			  System.out.print("Introduzca la nueva marca: ");
			  marca[espacioDisponible] = n.nextLine();
			  System.out.println();
			  System.out.print("Introduzca el nuevo almacenamiento: ");
			  almacenamiento[espacioDisponible] = n.nextLine();
			  System.out.println();
			  System.out.print("Introduzca el nuevo tipo: ");
			  tipo[espacioDisponible] = n.nextLine();
			  System.out.println();
			  System.out.print("Introduzca la nueva conexion: ");
			  conexion[espacioDisponible] = n.nextLine();
			  System.out.println();
			  System.out.print("Introduzca el precio: ");
			  precio[espacioDisponible] = (float) Double.parseDouble(n.nextLine());
			  System.out.println();
		     
			  System.out.println("Los datos se han introducido correctamente. Pulse 1 para ver la nueva tabla.");
			  System.out.println("Pulse 5 si desea salir del programa.");
			  System.out.println();
		  }
	  	}
	  
	  /**
	   * Eliminamos un articulo de la lista
	   * 
	   * @param marca
	   * @param almacenamiento
	   * @param tipo
	   * @param conexion
	   * @param precio
	   */
	  public static void eliminaArticulo(String marca[], String almacenamiento[], String tipo[], String conexion[], float precio[]) {
		  Scanner n = new Scanner(System.in);
	      
		    System.out.print("Por favor, introduzca el número de registro que desee eliminar: ");
		    int indice = Integer.parseInt(n.nextLine());
		      
		    if (indice < marca.length) {
		      marca[indice - 1] = null;
		      almacenamiento[indice - 1] = null;
		      tipo[indice - 1] = null;
		      conexion[indice - 1] = null;
		      precio[indice - 1] = 0;
		      
		      System.out.println();
		      System.out.println("Se han eliminado correctamente los datos señalados.");
		      System.out.println();
		    } else {
		      System.out.println();
		      System.out.println("Lo siento, el registro introducido no existe.");
		      System.out.println("Vuelva a elegir la opción 2 en el menú.");
		      System.out.println();
		    }
		        
		}
	  
	  /**
	   * Modificamos un articulo de la lista
	   * 
	   * @param marca
	   * @param almacenamiento
	   * @param tipo
	   * @param conexion
	   * @param precio
	   */
	  public static void modificaArticulo(String marca[], String almacenamiento[], String tipo[], String conexion[], float precio[]) {
		  Scanner n = new Scanner(System.in);
		    
		    int indice = 0;
		    boolean esVacio = false;
		    
		    while (!esVacio) {
		      System.out.print("Introduzca el número de registro que desee modificar: ");
		      indice = Integer.parseInt(n.nextLine());
		      if (marca[indice - 1] == "vacío") {
		        System.out.println("\nEse registro está vacío, seleccione uno que ya contenga valores.");
		      } else {
		        esVacio = true;
		      }
		    }
		    System.out.println();
		    
		    String marcaIntroducida = "";
		    String almacenamientoIntroducido = "";
		    String tipoIntroducido = "";
		    String conexionIntroducida = "";
		    String precioIntroducido = "";
		    
		    if (indice < marca.length) {
		      System.out.println("Marca actual: " + marca[indice - 1]);
		      System.out.print("Introduzca la nueva marca (pulse ENTER si no quiere modificar nada): ");
		      marcaIntroducida = n.nextLine();
		      if (!marcaIntroducida.equals("")) {
		        marca[indice - 1] = marcaIntroducida;
		      }
		      
		      System.out.println();
		      System.out.println("Almacenamiento actual: " + almacenamiento[indice - 1]);
		      System.out.print("Introduzca el nuevo almacenamiento (pulse ENTER si no quiere modificar nada): ");
		      almacenamientoIntroducido = n.nextLine();
		      if (!almacenamientoIntroducido.equals("")) {
		    	  almacenamiento[indice - 1] = almacenamientoIntroducido;
		      }
		      
		      System.out.println();
		      System.out.println("Tipo actual: " + tipo[indice - 1]);
		      System.out.print("Introduzca el nuevo tipo (pulse ENTER si no quiere modificar nada): ");
		      tipoIntroducido = n.nextLine();
		      if (!tipoIntroducido.equals("")) {
		        tipo[indice - 1] = tipoIntroducido;
		      }
		      
		      System.out.println();
		      System.out.println("Conexion actual: " + conexion[indice - 1]);
		      System.out.print("Introduzca la nueva conexion (pulse ENTER si no quiere modificar nada): ");
		      conexionIntroducida = n.nextLine();
		      if (!conexionIntroducida.equals("")) {
		    	  conexion[indice - 1] = conexionIntroducida;
		      }
		      
		      System.out.println();
		      System.out.println("Precio actual: " + precio[indice - 1]);
		      System.out.print("Introduzca el precio (pulse ENTER si no quiere modificar nada): ");
		      precioIntroducido = (n.nextLine());
		      if (!precioIntroducido.equals("")) {
		        precio[indice - 1] = (float) Double.parseDouble(precioIntroducido);
		      }
		      
		      System.out.println();
		      
		      System.out.println();
		      System.out.println("Se han añadido correctamente los nuevos valores.");
		      System.out.println("Puede usted elegir la opción 1 del menú si desea visualiarlos.");
		      System.out.println();
		    } else {
		      System.out.println();
		      System.out.println("Lo siento, el registro introducido no existe.");
		      System.out.println("Vuelva a elegir la opción 2 en el menú.");
		      System.out.println();
		}
	  }
}
