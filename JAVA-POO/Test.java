package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	//Metodo principal para instanciar mis clases
	public static void main(String[] args) {
		/*
		//Instancia de Persona
		Persona Felipe= new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "felipe@mail.com");
		
		System.out.println(Felipe);//imprime lugar memoria
		Felipe.imprimirInfo();//imprime infromacion
		Felipe.saludar();//imprime saludo
		
		
		//Instancia de Dentista
		Dentista Simi=new Dentista("Dr. Simi","Lares", (byte)51, "123456789","simi@lare.com","Odontologia", "335252424","Consultorio 500", "avanzado", "matutino", 500);
		
		System.out.println("************");
		Simi.calcularSalario();
		Simi.imprimirInfo();
		
		
		
		
		//instancia de Paciente con todos los datos
		Paciente Chencho= new Paciente ("CHNCH1234", "RH positivo", true, true, "05/Octu/2023", "Doc. Simi Lares", false);
		
		System.out.println("*********");
		System.out.println(Chencho);
		
		//istancia de paciente con datos obligatorios
		Paciente Masiosare= new Paciente ("MSD12345",false, false);
		System.out.println("*********");
		System.out.println(Masiosare);
		
		
		
		
		
		
		
		
		//Cambiar el false de seguroMedico a true
		//Masiosare.seguroGastosMedicos=true;
		System.out.println("*********");
		System.out.println(Masiosare);*/
		
		//Implementación de ArrayList de Dentistas
		List<Dentista> listaDentistasArrayList =new ArrayList<>();
		
		//Dentista DrChapatin= new Dentista("
		
		
		
		
		//Si agrego la instancia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrarInfo();
		
		//Se crea una instancia y se agrega directamente a la lista
		listaDentistasArrayList.add(new Dentista("Dr. Simi","Lares", (byte)51, "123456789","simi@lare.com","Odontologia", "335252424","Consultorio 500", "avanzado", "matutino", 500));
		
		//Si genero la instancia y la agrego directamente al arrayList, para sacar el dato tendre que utilizar un forEach o algun ciclo para imprimir dato por dato
		
		
		
		
		//Implementacion de lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas= new HashSet<>();
		
		//Agregando Dentista a mi Conjunto
		conjuntoDentistas.add(new Dentista("Dr. Simi","Lares", (byte)51, "123456789","simi@lare.com","Odontologia", "335252424","Consultorio 500", "avanzado", "matutino", 500));
		
		
		
		//Implementacion de un hashmap de Dentistas
		Map<String,Dentista> mapaDentistas=new HashMap<>();
		
		//Agregando un dentista a mi mapa
		mapaDentistas.put("Dr House",new Dentista("Gregory","House", (byte)55, "123456789","house.com","Cirujano", "5552135353","Consultorio 600", "avanzado", "vespertino", 1400));
		
		
		//Imprimr el objeto Doctor House
		Dentista DoctorBuscado = mapaDentistas.get("Dr House");
		
		System.out.println(DoctorBuscado);
		
		
		
	}//Cierre metodo main
	
	
	
	
}
