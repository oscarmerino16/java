package ejjavabinario;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JPasswordField;

public class ejcontraseña {

	public static void main(String[] args) {
		
		File fichero = new File("pass.dat");
		
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		try {
			FileOutputStream fo = new FileOutputStream(fichero);
			DataOutputStream escribir = new DataOutputStream(fo);
			
			
			escribir.writeUTF("oscar");
			escribir.writeUTF("hola123");
			escribir.writeUTF("instagram");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fi = new FileInputStream(fichero);
			DataInputStream leer = new DataInputStream(fi);
			
			while (true) {
				System.out.println("El usuario " + leer.readUTF());
				System.out.println("Con contraseÃ±a " + leer.readUTF());
				System.out.println("Descricion " + leer.readUTF());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("fin");
		}
		
	}

}
