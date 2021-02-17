package ejventas;

public class Ventas {

	private	String Nombre_Cliente;
	private int cod_prod, unidades_ven;
	private double precio_uni;
	
	public Ventas(String nombre_Cliente, int cod_prod, int unidades_ven, double precio_uni) {
		
		Nombre_Cliente = nombre_Cliente;
		this.cod_prod = cod_prod;
		this.unidades_ven = unidades_ven;
		this.precio_uni = precio_uni;
	}

	public String getNombre_Cliente() {
		return Nombre_Cliente;
	}

	public void setNombre_Cliente(String nombre_Cliente) {
		Nombre_Cliente = nombre_Cliente;
	}

	public int getCod_prod() {
		return cod_prod;
	}

	public void setCod_prod(int cod_prod) {
		this.cod_prod = cod_prod;
	}

	public int getUnidades_ven() {
		return unidades_ven;
	}

	public void setUnidades_ven(int unidades_ven) {
		this.unidades_ven = unidades_ven;
	}

	public double getPrecio_uni() {
		return precio_uni;
	}

	public void setPrecio_uni(double precio_uni) {
		this.precio_uni = precio_uni;
	}

	@Override
	public String toString() {
		return "Ventas [Nombre_Cliente=" + Nombre_Cliente + ", cod_prod=" + cod_prod + ", unidades_ven=" + unidades_ven
				+ ", precio_uni=" + precio_uni + "]";
	}
	
	
	
	
}
