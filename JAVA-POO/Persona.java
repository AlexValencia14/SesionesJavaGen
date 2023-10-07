package Persona;

public class Persona {

	//1 Atributos (info de como se mostrara mi objeto cuando se instancie)
		
	String	nombre;
	String	apellido;
	byte	edad; //para tenre una correcta asignacion de memoria
	String	telefono;
	String	email;
	
	//2 Constructor con prarametros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre=nombre;
		this.apellido = apellido;
		this.edad=edad;
		this.telefono=telefono;
		this.email=email;
	}//Cierre de constructor
	
	//3 Metodos (lo que podra hacer mi objeto)
	void imprimirInfo() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("El apellido es: "+apellido);
		System.out.println("El edad es: "+edad);
		System.out.println("El telefono es: "+telefono);
		System.out.println("El email es: "+email);
	}
	
	void saludar() {
		System.out.println("Hola, saludos");
	}//cierre imprimirInfo()

	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
	
	

}//Cierre POO
