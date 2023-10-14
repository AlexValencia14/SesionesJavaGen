package Animal;

public class Perro extends Animal{//Herencia de la clase superior Animal

	
	// "Polimorfear" o sobreescribir el metodo heredado
	@Override//con la anotacion @Override, le decimos a Java que el metodo hacersonido sera sobreescrito
	public void hacerSonido() {
		System.out.println("El perrito ladrea y hace guau");
	}//metod hacerSonido heredado de Animal
	
	
	public static void main(String[] args) {
		
		//Aqui NO hay polimorfismo, ta que instancio un animal generio, y utilizo su metodo hacerSonido
		Animal Generico= new Animal();//Genera un animal generico (abstracto)
		Generico.hacerSonido();//antes de la ejecucion
		
		
		//Generar la instacia de mi perrito
		//Si hay poimorfismo,  porque es el equivalente a decir "instancio un animal que es un perrito"
		//Referenciar primero la calse general, y luego la instancia particular, permite el polimorfismo
		Animal Chilaquil= new Perro();
		Chilaquil.hacerSonido();//Polimorfismo en tiempo de ejecución
		
		

	}//cierre de main

}//cierre clase Perro
