package matematicas;

public class Varios {

/**
 * Ejercicio 1
 * 
 * Devuelve true cuando el numero es capicuo.
 * 
 * @param n que es el numero que queremos saber si es capicuo o no
 * @return <code>true</code> Cuando el numero es capicuo
 * @return <code>false</code> Cuando el numero no es capicuo
 * 
 */
 
  public static boolean esCapicua(long n) {
    
    long a = n;
  
    long volteado = 0;
  
    while (a > 0) {
      volteado = volteado * 10 + a % 10;
      a /= 10;
    }
  
    return (n == volteado);
  }
  
/**
 * Ejercicio 2 
 * 
 * Devuelve true si el numero es primo.
 * 
 * @param n que es el numero que queremos saber si es primo o no
 * @return <code>true</code> Cuando el numero es primo
 * @return <code>false</code> Cuando el numero no es primo
 * 
 */
 
  public static boolean esPrimo(int n) {
    for(int i = 2; i < n; i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

/**
 * Ejercicio 3
 * 
 * Devuelve el menor primo que es mayor al numero que se pasa como parametro.
 * 
 * @param n que es el numero primo
 * @return <code>Numero primo siguiente al introducido</code>
 */
 
  public static int siguientePrimo (int n) {
    int miPrimo = n;
    
    do{
      miPrimo++;
    } while(!esPrimo(miPrimo));
    
    return miPrimo;
  }
/**
 * Ejercicio 4
 * 
 * Dada una base y un exponente devuelve la potencia.
 * 
 * @param base
 * @param exponente
 * @return <code>resultadod de la potencia</code>
 */
 
  public static int potencia(int base, int exponente) {
    int potencia = 1;
    
    for(int i = 0; i < exponente; i++) {
      potencia *= base;
    }
    
    return potencia;
  }

/** 
 * Ejercicio 5
 * 
 * Cuenta el numero de digitos de un numero entero.
 * 
 * @param n que es el numero de cual queremos saber cuantos digitos tiene
 * @return <code>numero de digitos que tiene el numero</code>
 */

  public static int digitos(long n) {
    
    int contador = 0;
    
    if(n == 0) {
      contador = 1;
    } else {
      while(n > 0) {
        n = n / 10;
        contador++;
      }
    }
    return contador;
  }

/**
 * Ejercicio 6 
 * 
 * Le da la vuelta a un numero.
 * 
 * @param n que sera el numero a voltear
 * @return <code>devuelve el numero volteado</code>
 */

  public static int voltea(int n) {
    
    int numeroVolteado = 0;
    
    while(n > 0) {
      numeroVolteado = (numeroVolteado * 10) + (n % 10);
      n /= 10;
    }
    
    return numeroVolteado;
  }
/**
 * Ejercicio 7 
 * 
 * Devuelve el digito que está en la posicion n de un numero entero. Se empieza
 * contando por 0 y de izquierda a derecha.
 * 
 * @param 
 * @return
 */


/**
 * Ejercicio 8
 * 
 * @param n es el numero que introducira el usuario
 * @param m el numero con el que se va a buscar la posicion del digito 
 * @return <code>posicion del digito</code>
 */

  public static int posicionDeDigito(int n, int m) {
    
    int volteado = voltea(n);
    int posicion = 1;
    
    while (volteado >= 0) {
      if (volteado % 10 == m) {
        return posicion;
      } 
        
      posicion++;
      volteado /= 10;
    }
      
    return -1;
  } 

/**
 * Ejercicio 9
 * 
 * @param n numero introducido por usuario
 * @param m numero de digitos que le quitamos al numero introducido
 * @return numero con digitos eliminados por detras
 */

  public static int quitaPorDetras(int n, int m) {
    
    int contador = 0;
    
    do {
      while (contador < m) {
        n /= 10;
        contador++;
      }
    }while((n > 0) && (contador != m));
    
    return n;
  
  }
  
/**
 * Ejercicio 10
 * 
 * @param n numero 
 * @param m numero con el que tenemos las excepciones
 * @return el numero con digitos de menos por delante
 */

  public static int quitaPorDelante(int n, int m) {
    
    int contador = 0;
    int numero = Varios.voltea(n);
    do {
      while (contador < m) {
        numero /= 10;
        contador++;
      }
    } while ((numero > 0) && (contador != m));
    return Varios.voltea(numero);
  }

/** 
* Ejercicio 11
* 
* @param n numero entero introducido por el usuario
* @param m digito que vamos a añadir
* @return <code>numeroNuevo</code>
*/  

  public static int pegaPorDetras(int n, int m) {
    
    int numeroNuevo = n * 10 + m;
    return numeroNuevo;
  }


/** 
* Ejercicio 12
* 
* @param n numero entero introducido por el usuario
* @param m digito a añadir a n
* @return <code>numeroNuevo</code>
*/  
  
  public static int pegaPorDelante(int n, int m) {
    
    int numeroNuevo = voltea(n) * 10 + m;
    voltea(numeroNuevo);
    return numeroNuevo;
  }



/** 
 * Ejercicio 13
 * 
 * @param n es el número entero introducido por el usuario
 * @param digitosInicio es el número de dígitos que se tomará como posición inicial
 * @param digitosFinal es el número de dígitos que se tomará como posición final
 *
 * @return <code>numeroTroceado</code> devuelve el trozo del número introducido  
 */ 
 
 public static int trozoDeNumero(int n, int digitosInicio, int digitosFinal) {
   
   int numeroEntero = n;
   numeroEntero = quitaPorDelante(n, digitosInicio);
   numeroEntero = quitaPorDetras(n, digitosFinal);
   
   return numeroEntero;
 }
 
/**
* Ejercicio 14
* 
* @param m es el primer número introducido por el usuario
* @param n es el segundo número introducido por el usuario
* @return <code>numeroNuevo</code> devuelve el número formado por m y n
*/ 
   
  public static int juntaNumeros(int m, int n) {
    int digitos = digitos(n);
   
    for (int i = 0; i < digitos; i++) {
      m *= 10;
    }
   
    int numeroNuevo = m + n;
    return numeroNuevo;
  } 


} //Fin del public class 
