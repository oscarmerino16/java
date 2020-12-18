package PracticaObjetos;

import java.util.Random;



public class Persona {

	private String nombre;
	private String dni;
	private int edad;
	private char sexo;// H-hombre M-mujer
	private double peso;
	private double altura;// Altura en m
	
	private final char HOMBRE = 'H';
	private final char MUJER = 'M';
	
	private final int SOBREPESO = 1;
	private final int PESOIDEAL = 0;
	private final int BAJOPESO = -1;
	
	
	
	
	
	
	public Persona() {
		this.nombre = "";
		this.dni = generaDni();
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		
		this.nombre = nombre;
		this.dni = generaDni();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		
		this.nombre = nombre;
		this.dni = comprobarDni(dni);
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		
		double peso = (this.peso/(altura*altura));
		
		if (peso<18.5) {
			return BAJOPESO;
		}else if(peso < 24.9) {
			return PESOIDEAL;
		}else {
			return SOBREPESO;
		}
		
	}
	public boolean esMayordeEdad() {
		
		if (edad>18) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	private char comprobarSexo(char sexo) {
		
		if (sexo== HOMBRE || sexo == MUJER) {
			return sexo;
		}else {
			return 'H' ;
		}
	
	}
	
	private String generaDni() {
		
		
		Random r = new Random();
		
		String dni="";
		
		for (int i = 0; i < 8; i++) {
			
			dni=dni+r.nextInt(10);
		}
		dni += "-" + generarLetraDni(dni);
		return dni;
	}
	
	private String generarLetraDni(String dni) {
		
		String letra="";
		int resto=0;
		int dniNum= Integer.valueOf(dni);
		resto=dniNum%23;
		
		String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
		
		letra+=letras.substring(resto, resto+1);
		
		return letra;
	}
	
	private String comprobarDni(String dni) {
		
		boolean valido= false;
		
		String letraValida, letraRecibida;
		String numDni;
		numDni = dni.substring(0,8);
		letraRecibida=dni.substring(9);
		letraValida=generarLetraDni(numDni);
		
		
		
		
		if (letraRecibida.equals(letraValida)) {
			valido=true;
		}
		
		if (valido) {
			return dni;
		}else {
			
			return generaDni();
			
		}
		
		
		
	}

	@Override
	public String toString() {
		String sexo;
		if(this.sexo == HOMBRE) {
			sexo="Hombre";
		}else {
			sexo="Mujer";
		}
		
		return nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ "kg, altura=" + altura + "m";
	}

	
	
	
}
