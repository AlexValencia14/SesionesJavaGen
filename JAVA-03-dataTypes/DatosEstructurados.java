package dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String. Los String en Java se consideran objetos
		 * -- Arrays.
		 * -- Creados por el usuario (API Hava
		 * 
		 * */
		String myString="Hola, soy un String";
		System.out.println(myString);
		
		String helloString=new String("Hola, soy un segundo String");
		System.out.println(helloString);
		
		/*Métodos para Strings 
		 * */
		String texto="dljfljf";
		//--String length. Método que permite medir la longitud de una cadena de caracteres
		System.out.println("La longitud de la variable texto de tipo String es: "+texto.length());
		
		/*
		 * Guardendo la varibel texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength= tecto.length();
		 * -- Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 * */ 
		
		//-- String: toUpperCase() y roLowerCase()
		String upperCase=texto.toUpperCase();
		System.out.println("Aplicando el método toUpperCase: "+upperCase);
		
		String lowerCase=texto.toLowerCase();
		System.out.println("Aplicando el método toLowerCase: "+lowerCase);
		
		//-- indexOf(). Devuelve el indice de la primera aparición de un texto especifico
		String fraseMotivacional="Todo es temporal, echale ganitas";
		int indexOf= fraseMotivacional.indexOf("temporal");
		System.out.println("La palabra 'temporal' inicia en el indice: "+indexOf);
		
		//-- Concatenación
		String firstName="Alejandro";
		String lastName="Valencia";
		
		String userName=firstName+ " "+ lastName;//Concatenación directa
		System.out.println(userName);
		
		System.out.println(firstName.concat(lastName));
		
		//-- Métodos de conversión
		String presupuesto="50000";
		System.out.println("El presupuesto es de $"+presupuesto+" y el tipo de dato es "+presupuesto.getClass().getSimpleName());
		
		int parseao= Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de "+presupuesto+" de tipo "+ presupuesto.getClass().getSimpleName()+" ahora es "+parseao+" que ahora es de tipo "+((Object)parseao).getClass().getSimpleName());
		
		/*
		 * Arrays. Conocidos como arreglos, se trata de una colección de datos del mismo tipo donde cada elemento corersponde a una posición identificada por indices númericos. Cuando trabajamos con arreglos de dos dimensiones 8bidimensionales), usamos el termino matriz
		 * 
		 * */
		
		String[] cars={"Volkswagen", "Mazda", "Kia","Ford"};
		System.out.println(cars);
//imprime algo raro
		
		
		/*
		 * Variables por tipo de declaración
		 * -- Variables dinámicas. Son aquellas que se declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse.
		 * -- Variables literales (palabras reservadas). Su identificador es la respressentación de su valor y ya tiene un significado en el codigo fuente de Java
		 * 
		 * 
		 * */
		
		//Variables dinámicas
		float gastosMensuales=35648.30f;
		System.out.println(gastosMensuales);
		
		gastosMensuales=42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a "+gastosMensuales);
		
		//Variables finales o constantes
		final int SALARIO=15000;
		System.out.println(SALARIO);

		
		
		}
}
