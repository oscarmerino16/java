package ejjavabinario;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class binario {

	public static void main(String[] args) {
		
		File fichero = new File("datos.dat");
		
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("no fichero crear");
			}
		}

		try (FileOutputStream fo = new FileOutputStream(fichero);
			DataOutputStream escribir = new DataOutputStream(fo);){
		
			
			escribir.writeInt(10);
			escribir.writeUTF("oscar");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
