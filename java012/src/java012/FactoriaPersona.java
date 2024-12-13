package java012;

public class FactoriaPersona {

	public static Persona crearPersona(String tipo, String nombre, int edad,String deporte, int nivel) {
		if (tipo.equals("Persona")) {
			return new Persona(nombre);
		}else if(tipo.equals("Deportista")){
			return new Deportista(nombre, deporte);
		}else {
			return new DeportistaPro(nombre, deporte, nivel);
		}
	}
}
