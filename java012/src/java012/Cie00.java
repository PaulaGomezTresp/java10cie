package java012;

public class Cie00 {

	public static void main(String[] args) {
		DeportistaPro deportista=new DeportistaPro ("Pepe","Fútbol",3);
		Deportista d1= new Deportista ("Luis","tenis");
		Persona p1= new Persona ("Lucía");
		
		System.out.print(p1.getNombre()+" ");
		p1.andar();
		
		System.out.print(d1.getNombre()+" juega al "+d1.getDeporte()+" y ");
		d1.andar();
		
		System.out.print(deportista.getNombre()+" juega al "+deportista.getDeporte()+" en el nivel "+deportista.getNivel()+" y ");
		deportista.andar();
		
	}

}
