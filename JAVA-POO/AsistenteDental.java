package Persona;

public class AsistenteDental {

	//1. Atributos privados
	private String fechaIngreso;
	private double salario;
	
	
	
	//2. Constructor publico (dejo el constructor publico para poder acceder a el de forma sencilla
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso=fechaIngreso;
		this.salario=salario;
		
		
	}//Cierre de constructor
	
	//3. Metodos
	
	//Metodo para imprimir información
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: "+fechaIngreso);
		System.out.println("El salario del asistente es: "+salario);
	}//metodo imprimir info
	
	
	
	//Getter y setter para poder acceder a is datos privados y poder realizar operaciones con ellos
	//sin getters, la infromación me aparece en null
	//sin setters, no puedo cambiar la informaciónS
	
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	public String getfechaIngreso() {
		return fechaIngreso;
	}//getFechaIngreso
	
	//getter para salario
	public double getSalario() {
		return salario;
	}//getSalario
	
	

	//setter para salario (modificar los datos)
	public void setSalario(double nuevoSalario) {
		if (nuevoSalario>0 && nuevoSalario<100) {
			salario=nuevoSalario;
		}//cierre if
	}//cierre setter
	
	
}//cierre AsistenteDental
