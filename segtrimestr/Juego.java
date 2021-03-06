package segtrimestr;

public class Juego {


	//Atributos de la clase
	private String nombre;
	private int record;
	private boolean multijugador;
	
	
	//Métodos de la clase ------
	
	public Juego() {
		// TODO Auto-generated constructor stub
	}
	
	public Juego(String nombre, int record, boolean multijugador) {
		this.nombre = nombre;
		this.record = record;
		this.multijugador = multijugador;
	}
	
	public void ponerRecord(int puntuacion) {
		record = puntuacion;
	}
	
	public void setRecord(int record) {
		this.record = record;
	}

	public String getNombre() {
		return nombre;
	}


	public int getRecord() {
		return record;
	}

	

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override
	public String toString() {
		return  nombre + " --- " + record;
	}
	
}
