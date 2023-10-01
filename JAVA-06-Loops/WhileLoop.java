package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * While. El ciclo While ejecuta continuamaente un bloque de codigo hasta que se cumpla una condicion dada
		 * While (expresion){
		 * //bloque de código a ejecutar
		 * (contador - iterador)
		 * }
		 * */
		
		/*int cuenta= 1;
		while (cuenta<11) {
			System.out.println("La cuenta es de: "+cuenta);
			cuenta++;
		}*/
		int cuenta= 1;
		while (cuenta<10) {
			cuenta++;
			System.out.println("La cuenta es de: "+cuenta);
			
		}
		
		/*Crear un programa que solicite al usuaraio un número. dicho número será tomado como un número final de una cuenta. Dicha cuenta inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número proporcinado.
		 * 
		 * 1. Importar un scanner e implementarlo
		 * 2. Un mensaje para darle contexto al usuario
		 * 3. almacenar el número dle usuario en una variable
		 * 4. Guardar en variable el número que inicia la cuenta (1)
		 * 5. Implementar un ciclo While
		 * 6. Mostrar por consola el resultado.
		 * */
		
		
		//1. Crear e importar el Scanner
		Scanner escaner=new Scanner(System.in);
		//2.
		System.out.println("Escribe un número que servira como número final de una cuenta");
		//3.
		int numFinal=escaner.nextInt();
		escaner.close();
		//4.
		int numInicial=1;
		
		//5.
		while(numInicial<=numFinal) {
			System.out.println("La cuenta va en "+numInicial);
			numInicial++;
		}
		
		


	}

}
