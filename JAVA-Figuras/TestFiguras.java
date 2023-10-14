package Figura;

public class TestFiguras {

	public static void main(String[] args) {
		//Generar las instancias de nuestras clases
		//1. Instancia de la clase Figura
		//Figura Triangulo= new Figura(); //Error porque es clase abstracta
		
		//2. Intancia de un rectangulo
		Figura rectangulo=new Rectangulo(5.0, 6.5);
		
		//3. Intancia de un circulo
		Figura circulo= new Circulo(3.14, 3.0);
		
		//Invocacion del metodo
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
		
		
		
		
		
		
		
	}//metodo main

}//class TestFiguras
