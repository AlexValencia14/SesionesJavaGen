package Figura;

//Clase concreta que implementa metodos de una interfaz llamada Calculable
public class Esfera implements Calculable{

	//Atributos
	double radio=5;
	double pi=3.1416;
	
	@Override
	public double calcularArea() {
		
		//Area 4 pi r*r
		double area=4*pi*radio*radio;
		return area;
		
	}

	@Override
	public double calcularVolumen() {
		//Volumen V=4/3 pi r*r*r
		double volumen= 4/3*pi*radio*radio*radio;
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		//Perimetro 2 pi r
		double perimetro = 2*pi*radio;
		return perimetro;
	}
	


	
}//class Esfera
