package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Do-While. Evalúa su expresión en la parte inferior del ciclo. Por lo tanto, las declaraciones dentro del bloque "do" sisempre se ejecutan al menos una vez
		 * 
		 * */
		
		//cuenta del 1 al 10
		int cuenta=1;
		do {
			System.out.println(cuenta);
			cuenta++;
		}while(cuenta<0);//output: 1 (ya que se ejecutó al menos una vez
		
		/*
		 * Crear un programa para un cajero bancario
		 * - El programa me mostrara 3 opciones:
		 * 1. consultar saldo
		 * 2. Ingresar dineros
		 * 3. Retirar dineros
		 * 4. Salir
		 * - Mostrar mensaje de bienbenida al usuario, darle contexto y solicitar que elija una opción (númeor)
		 * -Mostrar la ususario la opción que eligió y permitir que elija otra opción 
		 * - El usuario puede salir dle programa escribiendo 4 (salir)
		 * */
		
		System.out.println("Bienvenido al Banco Generation, elige cualquiera de las opciones, para ello escribe el número que corresponda:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar Dineros");
		System.out.println("4. Salir");
		
		Scanner skner= new Scanner (System.in);
		int opcionSeleccionada;
		do {
			opcionSeleccionada=skner.nextInt();
			
			switch(opcionSeleccionada) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dinero");
				break;
			case 3:
				System.out.println("Retirar Dineros");
				break;
			case 4:
				System.out.println("Salir");
				break;
				default:
					System.out.println("Elige una opciónn válida");
					break;
					
			}
		}while(opcionSeleccionada!=4);
		skner.close();
		
		
	}

}
