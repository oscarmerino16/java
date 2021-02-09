package Herencia;

public final class Fijo extends Administrativos{

	private String oposicion;

	public Fijo(String nombre, int edad, String cargo, String oposicion) {
		super(nombre, edad, cargo);
		this.oposicion = oposicion;
	}

	public String getOposicion() {
		return oposicion;
	}

	public void setOposicion(String oposicion) {
		this.oposicion = oposicion;
	}

	@Override
	public String toString() {
		return "Fijo [oposicion=" + oposicion + "]" + super.toString();
	}
	
	
	
}
