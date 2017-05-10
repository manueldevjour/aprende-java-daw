/**
 *
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las difrentes asignaturas del curso.
 *
 *
 * @author Manuel Cerezo
 *
 */
 
public class Tema04Ejercicio12 {
  public static void main(String[] args) {

    //Declaramos la variable donde se almacena la puntuación del test
    int puntuacion = 0;
    
    //Enunciado del test
    System.out.println("Vamos a hacer un pequeño test de 10 preguntas sobre el módulo que estamos impartiendo");
    
    //Primera pregunta
    System.out.println("\n¿Cuántos módulos se imparten en este grado?");
    System.out.println("a) Ninguno");
    System.out.println("b) 3");
    System.out.println("c) 6");
    
    String respuesta1 = System.console().readLine(); 
    
    if (respuesta1.equals("c")) {
      puntuacion++;
      System.out.println("¡Respuesta correcta! Continuemos con la siguiente pregunta");
    } else {
      System.out.println("¡Lo sentimos!, la respuesta es incorrecta.");
    }
    
    //Segunda pregunta
    System.out.println("\n¿Cuál es el nombre del profesor de programación?");
    System.out.println("a) Luis José");
    System.out.println("b) Jose Luis");
    System.out.println("c) Chuck Norris");
    
    String respuesta2 = System.console().readLine();
    
    if (respuesta2.equals("a")) {
      puntuacion++;
      System.out.println("¡Respuesta correcta! Continuemos con la siguiente pregunta");
    } else {
      System.out.println("¡Lo sentimos!, la respuesta es incorrecta.");
    }
    
    //Tercera pregunta
    System.out.println("\n¿Qué lenguaje de programación usamos en el módulo de Programación?");
    System.out.println("a) Ruby");
    System.out.println("b) Coreano");
    System.out.println("c) Java");
    
    String respuesta3 = System.console().readLine();
    
    if (respuesta3.equals("c")) {
      puntuacion++;
      System.out.println("¡Respuesta correcta! Continuemos con la siguiente pregunta");
    } else {
      System.out.println("¡Lo sentimos!, la respuesta es incorrecta.");
    }
    
    //Cuarta pregunta
    System.out.println("\n¿Hay que entregar un trabajo en Sistemas Informáticos al final del trimestre?");
    System.out.println("a) Sí");
    System.out.println("b) No");
    
    String respuesta4 = System.console().readLine();
    
    if (respuesta4.equals("b")){
      puntuacion++;
      System.out.println("¡Respuesta correcta! Continuemos con la siguiente pregunta");
    } else {
      System.out.println("¡Lo sentimos!, la respuesta es incorrecta.");
    }
    
    //Quinta pregunta
    System.out.println("La puntuación que ha sacado en este test es de: " + puntuacion);
  }
}
