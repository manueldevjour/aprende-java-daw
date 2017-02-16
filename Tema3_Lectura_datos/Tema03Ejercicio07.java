/**
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Manuel Cerezo
 */
public class Tema03Ejercicio07 {
    public static void main(String[] args) {

    System.out.print("Introduzca el precio sin IVA: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("\Ahora introduzca el porcentaje de IVA que se aplica al producto: ");
    double iva = Double.parseDouble(System.console().readLine());
    System.out.printf("\nEl precio con IVA es %.2f", baseImponible+(baseImponible * iva) / 100);
    }
}