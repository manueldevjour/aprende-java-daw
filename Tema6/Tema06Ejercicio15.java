/**
 *
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio15 {
    public static void main(String[] args) {

        //Presentamos el programa
        System.out.print("En este programa, generaremos una melodía con las condiciones expuestas arriba");
        System.out.print("\nPara comenzar con el programa, pulse la tecla ENTER");
        System.console().readLine();

        //Empezamos con el programa definiendo las variables

        int notas = 4 * (int)(Math.random() * 7 + 1);
        String nota = " ";
        String primeraNota = " ";

        //Declaramos el bucle para que escriba las notas.
        for (int numNotas = 1; numNotas <= notas; numNotas++) {
            switch((int)(Math.random() * 7)) {
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                    break;
                default:
            } //Fin del switch

            if (numNota == 1) {
                primeraNota = nota;
            }

            if (numNotas == notas) {
                nota = primeraNota;
            }

            System.out.print(nota + " ");

            if (numNotas == notas) {
                System.out.print("||");
            } else if (numNotas % 4 == 0) {
                System.out.print("|");
            }

        }//Fin del bucle for
    }
}