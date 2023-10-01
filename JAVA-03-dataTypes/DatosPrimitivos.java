package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivo. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 * */
		//Byte.Valor minimo y valor maximo
		byte maxByte=Byte.MAX_VALUE;
		byte minByte=Byte.MIN_VALUE;
		System.out.println("El valor maximo de Byte es: "+maxByte);
		System.out.println("El valor mínimo de Byte es: "+minByte);
		
		//Short. Vmin y Vmax
		short maxShort=Short.MAX_VALUE;
		short minShort=Short.MIN_VALUE;
		System.out.println("El valor mínimo de Short es: "+maxShort);
		System.out.println("El valor máximo de Short es: "+minShort);
		
		//char. Vmin y Vmax
		char minChar=Character.MIN_VALUE;
		char maxChar=Character.MAX_VALUE;
		System.out.println("El valor minimo de Character es: "+minChar);
		System.out.println("El valor máximo de Character es: "+maxChar);
		
		//int. Vmin y Vmax
		int minInt=Integer.MIN_VALUE;
		int maxInt=Integer.MAX_VALUE;
		System.out.println("El valor minimo de Integer es: "+minInt);
		System.out.println("El valor máximo de Integer es: "+maxInt);
		
		//long. Vmin y Vmax
		long minLong=Long.MIN_VALUE;
		long maxLong=Long.MAX_VALUE;
		System.out.println("El valor minimo de Long es: "+minLong);
		System.out.println("El valor máximo de Long es: "+maxLong);
		
		//float. Vmin y Vmax
		float minFloat=Float.MIN_VALUE;
		float maxFloat=Float.MAX_VALUE;
		System.out.println("El valor minimo de Float es: "+minFloat);
		System.out.println("El valor máximo de Float es: "+maxFloat);
		
		//double. Vmin y Vmax
		double minDouble=Double.MIN_VALUE;
		double maxDouble= Double.MAX_VALUE;
		System.out.println("El valor minimo de Double es: "+minDouble);
		System.out.println("El valor máximo de Double es: "+maxDouble);
		
		
		
		long isbn=9788499169019L;
		System.out.println(isbn);
		
		float salary=15000;
		System.out.println(salary);
		
		double ISR=1239.45;
		System.out.println(ISR);
		
		char valorChar1=35;//Acepta numeros pero los convierte en caracter de acuerdo a la tabla ASCII
		char valorChar2=3;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita=166;
		System.out.println(aChiquita);
		
		/*
		 * Casteo (Conversión de tipos en Java).
		 * -- Automático (dato más pequeñp a un dato más grande
		 * -- Manual (tipo de dato más grande a tipo de dato más pequeño).
		 * */
		
		int myNumber=125;
		System.out.println(myNumber);
		// int< double
		double myCasting=myNumber;
		System.out.println(myCasting);
		
		short edad=25;
		int valorEdad=edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//Casteo Manual
		int myNewCasting=(int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat=1.99f;
		System.out.println(myFloat);
		//conversion
		int myNewFloat=(int) myFloat;
		System.out.println(myNewFloat);
		
		//convertir de char a int
		char myChar ='M';
		int myNewChar=myChar;
		System.out.println(myNewChar);
	}
}
