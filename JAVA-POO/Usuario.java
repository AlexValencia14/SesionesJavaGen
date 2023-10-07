package Persona;

public class Usuario {

	
	
	//Atributo
	private String rol;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	public Usuario(String rol, String username, String password) {
		this.rol=rol;
		this.username=username;
		this.password=password;
		
	}//constructor
	
	
	//Recuperar contraseña (getter)
	public String getPasword() {
		//Si el usuario registrado coincide con el usuraio que paso como parametro entonces obtengo la contraseña
		return password;
	}//getter
	
	
	//Cambiar contraseña (setter)
	public void setPassword(String nuevaPassword) {
		
		//si la nueva contraseña es diferente a una cadena vacia y es diferente a la contraseña anterior...
		if (nuevaPassword !="" && nuevaPassword != password) {
			password=nuevaPassword;
		}else {
			System.out.println("Lo siento, no puedo cambiar la contraseña");
		}
	}
	
	
	//Cambiar la contraseña de un objeeto del tipo usuario
	
	//Felipe.setPassword (una donde la contraseña este vacia)
	//Felipe.setPassword (una donde la contraseña no esta vacia pero sea igual a la contraseña anterior)
	//Felipe.setPassword (se cumplan las dos condiciones)
	
	
}//class Usuario
