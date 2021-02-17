package ejventas;

public class Main {

	public static void main(String[] args) {
		
		/*
		vVentas[0] = new Ventas("jose", 2, 3, 1.5);
		vVentas[1] = new Ventas("luis", 2, 3, 1.5);
		vVentas[2] = new Ventas("pepe", 2, 3, 1.5);
		*/
		Ventas vVentas = IODatos.cargarDatos("ventas.dat");
		
		
		
		IODatos.guardarDatos("ventas.dat", vVentas);

	}

}
