package java012;


public class Persona {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public void andar() {
		System.out.println("anda a 5 Km/h");
	}
	
}
