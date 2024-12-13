package java012;

public class Cie2 {

	public static void main(String[] args) {
		Persona pepe=FactoriaPersona.crearPersona("DeportistaPro", "Luis",23,"tenis",2 );
		pepe.andar();
		System.out.println(pepe.getNombre());
		//Operación de casting
		//puedes acceder a todas las propiedades
		DeportistaPro pepeVerdadero= (DeportistaPro)pepe;
		pepeVerdadero.andar();
		System.out.println(pepeVerdadero.getDeporte());
		
	}

}
