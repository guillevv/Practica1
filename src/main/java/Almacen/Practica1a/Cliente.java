package Almacen.Practica1a;

public class Cliente {
	private String Nombre;
	
	private String 	Apellidos;
	private String 	Email;
	private String  Teléfono;
	private String  Dirección;
	
	public Cliente(String nombre, String apellidos, String email, String teléfono, String dirección) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		Teléfono = teléfono;
		Dirección = dirección;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTeléfono() {
		return Teléfono;
	}
	public void setTeléfono(String teléfono) {
		Teléfono = teléfono;
	}
	public String getDirección() {
		return Dirección;
	}
	public void setDirección(String dirección) {
		Dirección = dirección;
	}
	

}
