package PracticaObjetos;

import java.util.Random;

public class Password {

	private String contrasena;
	private int longitud;
	
	
	public Password() {
		
		longitud=11;
		contrasena="AAAss111111";
	}
	
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		contrasena="";
		generarPassword();
	}
	
	private void generarPassword() {
		
		String letraMin= "abcdefghijklmnñopqrstvwxyz";
		String letraMay= letraMin.toUpperCase();
		String numeros= "0123456789";
		String posi=letraMin+letraMay+numeros;
		
		Random r = new Random();
		int aleatorio=0;
		for (int i = 0; i < longitud; i++) {
			
			aleatorio = r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio+1);
			
			
		}
		
	}
	public boolean esFuerte() {
		
		String letraMin= "abcdefghijklmnñopqrstvwxyz";
		String letraMay= letraMin.toUpperCase();
		String numeros= "0123456789";
		
		int cont1=0;
		int cont2=0;
		int cont3=0;
		
		for (int i = 0; i < longitud; i++) {
			for (int j = 0; j < letraMin.length(); j++) {
				if (contrasena.substring(i,i+1).equals(letraMin.substring(j,j+1))) {
				
					cont1++;
				
				}
				if (contrasena.substring(i,i+1).equals(letraMay.substring(j,j+1))) {
					
					cont2++;
				
				}
			}
			for (int j = 0; j < numeros.length(); j++) {
				if (contrasena.substring(i,i+1).equals(numeros.substring(j,j+1))) {
					
					cont3++;
				
				}
			}
		}
			
		
		if (cont1>1 && cont2>2 && cont3>5) {
			return true;
		}
			return false;
		
			
	}

	public String getContrasena() {
		return contrasena;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	
	
	
	
}
