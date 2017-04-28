package crudArray;

/**
 * CRUD version array
 * 
 * @author Manuel Cerezo
 */
import java.util.Scanner;

public class crudArray {
  public static void main(String[] args) {
    
    //Declaramos la clase scanner que utilizaremos a lo largo del programa
    Scanner s = new Scanner (System.in);
    Scanner n = new Scanner (System.in);

    //Presentamos el programa
    System.out.print("Bienvenido al programa de gestión de discos duros.");
    System.out.print("\nAquí encontrará información sobre los diferentes"
                    + " discos duros que hay disponibles en el mercado.");
    System.out.print("\nPulse ENTER para comenzar con el programa.");
    System.out.print("\n-------------------------------------------------"
                    + "--------------------------------------------------");
    s.nextLine();
    
    //Declaramos los diferentes arrays y variables que utilizaremos
    String[] marca = new String[10];
    String[] almacenamiento = new String[10];
    String[] tipo = new String[10];
    String[] conexion = new String[10];
    float[] precio = new float[10];
    boolean salirMenu = false;
    int respuesta = 5;
    
    //Datos que vamos a usar
    //Marcas
    marca[0] = "Seagate";
    marca[1] = "Toshiba";
    marca[2] = "Samsung";
    marca[3] = "Crucial";
    marca[4] = "WD";
    
    //Almacenamiento
    almacenamiento[0] = "1TB";
    almacenamiento[1] = "1TB";
    almacenamiento[2] = "500GB";
    almacenamiento[3] = "1050GB";
    almacenamiento[4] = "4TB";
    
    //Tipos
    tipo[0] = "Interno";
    tipo[1] = "Externo";
    tipo[2] = "SSD";
    tipo[3] = "SSD";
    tipo[4] = "Externo";
    
    //Conexiones
    conexion[0] = "SATA3";
    conexion[1] = "USB 3.0";
    conexion[2] = "SATA3";
    conexion[3] = "SATA3";
    conexion[4] = "USB 3.0";
    
    //Precios
    precio[0] = 46.95f;
    precio[1] = 53.95f;
    precio[2] = 161;
    precio[3] = 275;
    precio[4] = 169;
    
    //Creamos el menú
    System.out.print("\n┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.print("\n┃             Sistema de gestión de datos             ┃");
    System.out.print("\n┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.print("\n┃      Estas son las opciones de este programa.       ┃");
    System.out.print("\n┃             Por favor, seleccione una.              ┃");
    System.out.println("\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    
    while(salirMenu == false) {
    	System.out.println(" 1. Mostrar listado");
    	System.out.println(" 2. Añadir");
    	System.out.println(" 3. Borrar");
    	System.out.println(" 4. Modificar");
    	System.out.println(" 5. Salir");
    	System.out.print(" Selección: ");
    	respuesta = s.nextInt();
    	
    	switch(respuesta) {
    	
    		case 1:
    			mostrarListado(marca, almacenamiento, tipo, conexion, precio);
    		break;
    	
    		case 2:
    			nuevoArticulo(marca, almacenamiento, tipo, conexion, precio);    	
    		break;
    		
    		case 3:
    			eliminaArticulo(marca, almacenamiento, tipo, conexion, precio);
    		break;
    		
    		case 4:
    			modificaArticulo(marca, almacenamiento, tipo, conexion, precio);
    		break;
    		
    		case 5:
    			salirMenu = true;
    		break;
    		
    		default:
    	}
    	
    }
    System.out.print("Saliendo del programa... Hecho");
  } //Fin del main
  
  //Funciones para usar en el menú
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
}//Fin programa