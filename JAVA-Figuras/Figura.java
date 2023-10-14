//Vamos a usar clases abstractas para evitar la instacia de objetos que no necesito; (generalmente son objetos muy abstractos, como Persona, figura, Transporte, Animal, comida, Arte, Operaciones Matematicas, Lecturas, Ropa, Plantas, Paises, etc).


package Figura;

//Utilizando clases abstractas, evitamos las instancias no necesarias

	//Para que una clase se vuelve abstracta, usamos la palabra reservada abstract antes de class
	
public abstract class Figura {
	
	//Declaramos un metodo abstracto (no tiene cuerpo)
	//metodo abstracto que nos dice QUE TENEMOS QUE HACER, pero NO NOS DICE EL COMO
	public abstract double calcularArea();

}//Clase Figura


/*
 * NOTA: Las clases abstractas pierden la capacidad de instanciar.
 * Una clase abstracta, necesita si o si metodos abstractos
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
 * */
 