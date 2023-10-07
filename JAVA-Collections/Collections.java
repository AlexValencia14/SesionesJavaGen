package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		//array
		//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
		String [] listaDeCompras=new String[] {"Leche","Pan","Huevos"};
		
		//Esta impresion solo muestra el espacio de la memoria
		System.out.println(listaDeCompras);
		
		//imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a toma y lo vamos a imprimir
		for (String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}//forEach
		
		
		
		//Implementacion de un arrayList
		//Clase general (interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
		List <String> listaDeContactos= new ArrayList <>();
		
		//Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Fatima");
		listaDeContactos.add("Alicia");
		
		
		//obtener un elemento de la lista - asignarlo a una variable
		String datoFelipe= listaDeContactos.get(0);
		System.out.println(datoFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(1);
		
		System.out.println(listaDeContactos);
		
		
		//Implementacion de un conjunto (SET)
		//Sintaxis
		//Interface de donde implemento + tipo de dato que usare + que le doy al conjunto + instancia de la clase especifica
		
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Treboles");
		
		//No puedo saber posicines, solo saber si lo contiene
		if (cartasDeJuego.contains("Reina de Treboles")) {
			System.out.println("La reina de treboles si esta en el conjunto");
		}else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		//Implementacion de un mapa (hashMap)
		
		Map <String, String> libretaDirecciones = new HashMap<>();
		
		//Agragar elementos a mi libreta de direcciones, donde mi K=nombre y mi V=direccion
		libretaDirecciones.put("Felipe", "Tlalnepantla");
		libretaDirecciones.put("Doctor Simi", "CDMX");
		libretaDirecciones.put("Konoha", "Naruto");
		
		//Metodo para sacer informacin de la libreta, creando una nueva variable
		String direccionDeFelipe = libretaDirecciones.get("Felipe");
		String direccionDeNaruto = libretaDirecciones.get("Naruto");//Null
		
		//Impresion
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeNaruto);
		
		
	}//metodo main
}

/*
 * Colecciones
 * 
 * - Arrays (arreglos)
 * Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan alamcenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo
 * 		- La longitud de un array se establece al momento de crearlo, y no cambia.
 * 		- Podemos acceder a elementos por medio de un indice.
 * 		- los arrays plueden contener datos primitivos y objeetos.
 * 		 no proporciona metodos adicionales para agregar o eliminar elementos
 * 
 * 
 * Un ejemplo de un array es una lista de compras de supermercado
 * 
 * 
 * 
 * 
 * 
 * - ArrayList
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Uriliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * - Tamaño dinamico, a diferencia de los arrays tradicionales, el tamaño de un arrayList si se puede modificar.
 * - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 * - Coste elevado al momoento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos
 * 
 * 
 * 
 * 
 * 
 * Set (conjunto)
 * 
 * Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 * 
 * 	- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 * 	- No hay un orden especifico, los elementos se almacenan sin orden especifico.
 * 	- La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar elemento deseado.
 * 
 * 
 * 
 * 
 * 
 * Map (mapas)
 * 
 * Un mapa es una estructura de datos que almacena pares de clave-valor.
 * 
 * 	- Almacenamiento con pares K-V
 * 	- sin orden especifico (similar a un Set)
 * 	- Busqueda repida, la busqueda se hace por medio de un valor (key), y usa una funcion interna hash para buscar elementos.
 * 
 * 
 * Agenda telefonica (agragar, modificar, eliminar)
 * 
 * */



