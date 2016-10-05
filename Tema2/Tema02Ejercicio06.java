/**
 *
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
 *
 *
 * @author Manuel Cerezo
 *
*/

public class Tema02Ejercicio06 {
	public static void main(String[] args) {
	
	double baseImponible = 1500;
	double cantidadIva = 0.21;
	double totalFactura = baseImponible * cantidadIva; 
	double totalFinal = totalFactura + baseImponible;
	
	System.out.println("El precio de la factura es:" + totalFinal);
	
	}
}
