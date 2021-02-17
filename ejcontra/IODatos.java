package ejcontra;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Password[] datos) {

		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		try (FileOutputStream fo = new FileOutputStream(f); DataOutputStream escribir = new DataOutputStream(fo)) {

			for (Password p : datos) {
				if (p != null) {
					escribir.writeUTF(p.getUsuario());
					escribir.writeInt(p.getPassword());
					escribir.writeBoolean(p.isSegura());
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

	public static Password[] cargarDatos(String rutaFichero) {
		String usuario;
		int password, cont=0;
		boolean segura;
		
		Password[] vector = new Password[10];
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try {
			FileInputStream fi = new FileInputStream(f);
			DataInputStream leer = new DataInputStream(fi);
			
			while (true) {
				usuario=leer.readUTF();
				password=leer.readInt();
				segura=leer.readBoolean();
				
				vector[cont] =new Password(usuario, password, segura);
				
				cont++;
			}
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectura");
		} 
		
		
		
		return vector;
	}
	
	public static Password[] cargarObjetos(String rutaFichero) {
		String usuario;
		int password, cont=0;
		boolean segura;
		
		Password[] vector = new Password[10];
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try {
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream leer = new ObjectInputStream(fi);
			
			while (true) {
				
				
				vector[cont] = (Password) leer.readObject();
				
				cont++;
			}
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectura");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return vector;
	}

	public static void guardarObjetos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileOutputStream fo = new FileOutputStream(f);
				ObjectOutputStream escribir = new ObjectOutputStream(fo)){
			
			for (Password p : datos) {
				if (p!=null) {
					escribir.writeObject(p);
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
	
	
	
	
	
	
	
	
}
