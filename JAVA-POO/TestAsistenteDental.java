package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		AsistenteDental Francisca=new AsistenteDental("05/10/23",875.4d);
		
		//Impresion de la informacion de nuestro asistente
		//Francisca.mostrarDatosAsistente();

		
		//El sueldo de Grancisca no es de 875.4, es de 87.54
		
		//cambio de sueldo
		
		//Francisca.salario=87.54d;
		
		
		
		//Mostrar solo el sueldo (antes del getter)
		//System.out.println(Francisca.salario);
		
		//Mostrar solo el sueldo (despues del getter)
		System.out.println(Francisca.getSalario());
		
		
		//Modificar salario con el setter
		Francisca.setSalario(300);
		
		
		//Imprimir el nuevo salario de Francisca
		System.out.println(Francisca.getSalario());
		
		
	}//metodo main

}
