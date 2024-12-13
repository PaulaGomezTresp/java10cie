package java012;

public class Deportista extends Persona{

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Deportista(String nombre,String deporte) {
		super (nombre);
		this.deporte = deporte;
	}

	@Override
	public void andar() {
		System.out.println("anda a 7 Km/h");
	}
	
}
