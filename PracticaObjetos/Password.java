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
		
		for (int i = 0; i < letraMin.length(); i++) {
			if (contrasena.substring(i,i+1).equals(letraMin)) {
				
				cont1=cont1+1;
				
			}
		}
		for (int i = 0; i < letraMay.length(); i++) {
			if (contrasena.substring(i,i+1).equals(letraMay)) {
				
				cont2=cont2+1;
				
			}
		}
		for (int i = 0; i < numeros.length(); i++) {
			if (contrasena.substring(i,i+1).equals(numeros)) {
				
				cont3=cont3+1;
				
			}
		}
		if (cont1>1 && cont2>2 && cont3>5) {
			return true;
		}else {
			return false;
		}
			
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
