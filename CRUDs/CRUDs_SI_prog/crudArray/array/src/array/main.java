package array;

/**
 * CRUD array version
 * 
 * @author Manuel Cerezo
 */

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
    
    //Declaramos los diferentes arrays y variables que utilizaremos
    String[] marca = new String[10];
    String[] almacenamiento = new String[10];
    String[] tipo = new String[10];
    String[] conexion = new String[10];
    float[] precio = new float[10];
    boolean salirMenu = false;
    int respuesta = 0;
    
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
    			funciones.mostrarListado(marca, almacenamiento, tipo, conexion, precio);
    		break;
    	
    		case 2:
    			funciones.nuevoArticulo(marca, almacenamiento, tipo, conexion, precio);    	
    		break;
    		
    		case 3:
    			funciones.eliminaArticulo(marca, almacenamiento, tipo, conexion, precio);
    		break;
    		
    		case 4:
    			funciones.modificaArticulo(marca, almacenamiento, tipo, conexion, precio);
    		break;
    		
    		case 5:
    			salirMenu = true;
    		break;
    		
    		default:
    	}
    	
    }
    System.out.print("Saliendo del programa... Hecho");
  } //Fin del main
  
}//Fin programa