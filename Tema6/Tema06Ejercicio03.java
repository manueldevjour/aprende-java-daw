/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Manuel Cerezo
 *
 */

public class Tema06Ejercicio03 {
	public static void main(String[] args) {
		
		System.out.print("En este programa vamos a mostrarle una carta al azar de la baraja española.");
		System.out.print("\n---------------------------------------------------------------------------");
		System.out.println();
		
		
		
		for (int i = 0; i < 1; i++) {
			int numero = (int)(Math.random() * 10) + 1; 
			if (numero == 1) {
				System.out.print("As de");
			} else if (numero == 8) {
				System.out.print("Sota de");
			} else if (numero == 9) {
				System.out.print("Caballo de");
			} else if (numero == 10) {
				System.out.print("Rey de");
			} else {
				System.out.print(numero + " de");
			}
			
		}		
		
		int palo = (int)(Math.random() * 4) + 1;
		
		switch (palo) {
			case 1: 
				System.out.print(" oros");
			break;
			
			case 2:
				System.out.print(" bastos");
			break;
			
			case 3:
				System.out.print(" espadas");
			break;
			
			case 4:
				System.out.print(" copas");
			break;		
		
		}
	}
}
