package ejventas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class IODatos {

	public static void guardarDatos(String rutaFichero, Ventas[] datos) {
		
		File f = new File(rutaFichero);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
				DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Ventas v : datos) {
				if (v !=null) {
					escribir.writeUTF(v.getNombre_Cliente());
					escribir.writeInt(v.getUnidades_ven());
					escribir.writeInt(v.getCod_prod());
					escribir.writeDouble(v.getPrecio_uni());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public static Ventas[] cargarDatos(String rutaFichero) {
		
		String Nombre_Cliente;
		int cod_prod, unidades_ven, cont=0;
		double precio_uni;
		
		Ventas[] vector = new Ventas[10];
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileInputStream fi = new FileInputStream(f);
				DataInputStream leer = new DataInputStream(fi) ){
			
			while (true) {
				Nombre_Cliente=leer.readUTF();
				cod_prod=leer.readInt();
				unidades_ven=leer.readInt();
				precio_uni=leer.readDouble();
				
				vector[cont] = new Ventas(Nombre_Cliente, cod_prod, unidades_ven, precio_uni);
				
				cont++;
			}
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		return vector;
	}
	
}
