/**
 *
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 * @author Manuel Cerezo
 *
 */
public class Tema03Ejercicio12 {
    public static void main(String[] args) {
        
        System.out.print("Introduzca la nota del primer examen: ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("¿Qué nota quiere sacar en este trimestre? ");
        double notaFinal = Double.parseDouble(System.console().readLine());
    
        double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
        System.out.println("Para tener un " + notaFinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    }
}