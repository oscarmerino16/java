package Herencia;

public final class Interino extends Administrativos{

	private String estudios;

	public Interino(String nombre, int edad, String cargo, String estudios) {
		super(nombre, edad, cargo);
		this.estudios = estudios;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return "Interino [estudios=" + estudios + "]" + super.toString();
	}

	
	
	

	
	
	
}
