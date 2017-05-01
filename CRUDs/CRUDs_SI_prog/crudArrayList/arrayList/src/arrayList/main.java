package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
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
	    
	    int respuesta = 5;
	    boolean salirMenu = false;
	    
	    ArrayList<Disco> d = new ArrayList<>();
	    
	    d.add(new Disco("Seagate", "1TB", "Interno", "SATA3", 46.95f));
	    d.add(new Disco("Toshiba", "1TB", "Externo", "USB 3.0", 53.95f));
	    d.add(new Disco("Samsung", "500GB", "SSD", "SATA3", 161));
	    d.add(new Disco("Crucial", "1050GB", "SSD", "SATA3", 275));
	    d.add(new Disco("WD", "4TB", "Externo", "USB 3.0", 169));
	    
	    
	    //Creamos el menú
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
	    			mostrarListado(d);
	    		break;
	    	
	    		case 2:
	    			nuevoArticulo(d);    	
	    		break;
	    		
	    		case 3:
	    			eliminaArticulo(d);
	    		break;
	    		
	    		case 4:
	    			modificaArticulo(d);
	    		break;
	    		
	    		case 5:
	    			salirMenu = true;
	    		break;
	    		
	    		default:
	    	}
	    	
	    	System.out.print("Saliendo del programa... Hecho");
	    }
	}
	
	//Funciones para el programa
	
	/**
	   * Muestra la lista de los productos
	   * 
	   * @param marca
	   * @param almacenamiento
	   * @param tipo
	   * @param conexion
	   * @param precio
	   */
	  public static void mostrarListado(ArrayList<Disco> d) {
		  int i = 0;
		  
		  System.out.println("┏━━━━━━━━┳━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━┳━━━━━━━━━━┳━━━━━━━━━┓");
		  System.out.printf("┃ %-4s ┃ %-7s ┃   %-7s  ┃ %-7s    ┃ %-8s ┃ %7s ┃", "ÍNDICE", "MARCA", "ALMACENAMIENTO", "TIPO", "CONEXION", "PRECIO");
		  for(Disco disco : d) {
			  System.out.print("\n┣━━━━━━━━╋━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━╋━━━━━━━━━━╋━━━━━━━━━┫");
			  System.out.printf("\n┃ %-4s   ┃ %-7s ┃    %-7s        ┃  %-7s   ┃ %-8s ┃%7.2f€ ┃", (i + 1), disco.getMarca(), disco.getAlmacenamiento(), disco.getTipo(), disco.getConexion(), disco.getPrecio());
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
	  public static void nuevoArticulo(ArrayList<Disco> d) {
		  Scanner s = new Scanner(System.in);
		  
		  String marca = "";
		  String almacenamiento = "";
		  String tipo = "";
		  String conexion = "";
		  float precio = 0;
		  
		  System.out.print("Por favor, introduzca la marca: ");
		  marca = s.nextLine();
		  System.out.println();
		  
		  System.out.print("Por favor, introduzca el almacenamiento: ");
		  almacenamiento = s.nextLine();
		  System.out.println();
		  
		  System.out.print("Por favor, introduzca el tipo: ");
		  tipo = s.nextLine();
		  System.out.println();
		  
		  System.out.print("Por favor, introduzca la conexión: ");
		  conexion = s.nextLine();
		  System.out.println();
		  
		  System.out.print("Por favor, introduzca el precio: ");
		  precio = s.nextFloat();
		  System.out.println();
		  
		  d.add(new Disco(marca, almacenamiento, tipo, conexion, precio));
		  
		  System.out.println();
		  System.out.println("El nuevo disco duro se ha añadido.");
		  System.out.println("Pulse 1 si desea ver el listado de nuevo.");
		  
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
	  public static void eliminaArticulo(ArrayList<Disco> d) {
		  Scanner n = new Scanner(System.in);
	      
		    System.out.print("Por favor, introduzca el número de registro que desee eliminar: ");
		    int indice = Integer.parseInt(n.nextLine());
		      
		    if (indice < d.size()) {
		      d.remove(indice);
		      
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
	  public static void modificaArticulo(ArrayList<Disco> d) {
		  Scanner n = new Scanner(System.in);
		  int indice = 0;
		  
		  System.out.println("Por favor, introduzca el número del registro del disco duro: ");
		  indice = Integer.parseInt(n.nextLine());
		  System.out.println();
		  
		  String marcaIntroducida = "";
		  String almacenamientoIntroducido = "";
		  String tipoIntroducido = "";
		  String conexionIntroducida = "";
		  float precioIntroducido = 0;
		  
		  if (indice < d.size()) {
			  System.out.println("La marca actual es: " + d.get(indice).getMarca());
			  System.out.println("Por favor, introduzca la nueva marca (recuerde que si pulsa ENTER no modificará los datos): ");
			  marcaIntroducida = n.nextLine();
			  if(!marcaIntroducida.equals("")) {
				  d.get(indice).setMarca(marcaIntroducida);
			  }
			  
			  System.out.println();
			  System.out.println("El almacenamiento actual es de: " + d.get(indice).getAlmacenamiento());
			  System.out.println("Por favor, introduzca el nuevo almacenamiento (recuerde que si pulsa ENTER no modificará los datos): ");
			  almacenamientoIntroducido = n.nextLine();
			  if(!almacenamientoIntroducido.equals("")) {
				  d.get(indice).setAlmacenamiento(almacenamientoIntroducido);
			  }
			  
			  System.out.println();
			  System.out.println("El tipo actual es: " + d.get(indice).getTipo());
			  System.out.println("Por favor, introduzca el nuevo tipo (recuerde que si pulsa ENTER no modificará los datos): ");
			  tipoIntroducido = n.nextLine();
			  if(!tipoIntroducido.equals("")) {
				  d.get(indice).setTipo(tipoIntroducido);
			  }
			  
			  System.out.println();
			  System.out.println("La conexión actual es " + d.get(indice).getConexion());
			  System.out.println("Por favor, introduzca la nueva conexión (recuerde que si pulsa ENTER no modificará los datos): ");
			  conexionIntroducida = n.nextLine();
			  if(!conexionIntroducida.equals("")) {
				  d.get(indice).setConexion(conexionIntroducida);
			  }
			  
			  System.out.println();
			  System.out.println("El precio actual es de: " + d.get(indice).getPrecio());
			  System.out.println("Por favor, introduzca el nuevo precio (recuerde que si pulsa ENTER no modificará los datos): ");
			  precioIntroducido = n.nextFloat();
			  if(!(precioIntroducido == 0)) {
				  d.get(indice).setPrecio(precioIntroducido);
			  }
		  }
		  
		  
	  }
}
