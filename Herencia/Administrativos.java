package Herencia;

public class Administrativos extends Personal{
	
	protected String cargo;

	public Administrativos(String nombre, int edad, String cargo) {
		super(nombre, edad);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Administrativos [cargo=" + cargo + "]" + super.toString();
	}
	
	

}
