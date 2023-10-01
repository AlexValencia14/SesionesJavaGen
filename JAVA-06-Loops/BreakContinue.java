package loops;

public class BreakContinue {

	public static void main(String[] args) {
		/*
		 * Sentencia utilizadas en loops:
		 * -- break. se utiliza para salir de un bucle en un punto especifico
		 * -- continue. Interuumpe la iteración de un bucle, si se produce una condición especifica y continúa con la siguiente
		*/
		
		// Súper ozzito va a realizar una rifa en la cual el cliente número 5 se ganará una cocal-cola de bolsita
		
		//con break finalizando el bucle antes de llegar a la condición final
		for (int cliente=1; cliente<=20;cliente++) {
			if (cliente==5) {
				System.out.println("Cliente número "+cliente+" ¡GANASTE!");
				break;
			}
			System.out.println("Eres el cliente número "+cliente);
		}
		
		//con continue, ejecutando la sentencia condicioneal pero cumpliendo la condición del bucle
				for (int cliente=1; cliente<=20;cliente++) {
					if (cliente==5) {
						System.out.println("Cliente número "+cliente+" ¡GANASTE!");
						continue;
					}
					System.out.println("Eres el cliente número "+cliente);
				}
		
		
		
	}

}
