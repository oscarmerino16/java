package ejventas;

public class Main {

	public static void main(String[] args) {
		
		Ventas[] vVentas;
		/*
		vVentas[0] = new Ventas("Javier", 4, 5, 5);
		vVentas[1] = new Ventas("Pedro", 4, 5, 5);
		vVentas[2] = new Ventas("Juan", 4, 5, 5);
		vVentas[3] = new Ventas("Pepe", 4, 5, 5);
		
		IODatos.guardarDatos("ventas.dat", vVentas);*/
		
		vVentas = IODatos.cargarDatos("ventas.dat");
	}
	
	
	private static int calcularTotal(Ventas[] vVentas, String Nombre_Cliente) {
		
		int suma = 0;
		
		for (Ventas ventas : vVentas) {
			if (Nombre_Cliente.equalsIgnoreCase(ventas.getNombre_Cliente())) {
				suma += ventas.getPrecio_uni()*ventas.getUnidades_ven();
			}
		}
		
		return suma;
	}
		

	public static int calcularClientes(Ventas[] vVentas, String Nombre_Cliente) {
		
		int cont=0;
		
		
		for (Ventas ventas : vVentas) {
			if (ventas.getNombre_Cliente().equalsIgnoreCase(Nombre_Cliente)) {
				cont++;
			}
		}
		
		return cont;
	}
	
}
