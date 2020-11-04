package ejercicios1java;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		boolean bach, pruebaacc = false;
		
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime si tienes el bachillerato para poder acceder al grado");
		bach=leer.hasNext();
	
		if (bach==true){
			System.out.println("Puedes acceder el grado");	
		}else if(bach==false){
			System.out.println("Has superado la prueba de acceso");
			pruebaacc=leer.hasNext();
		}if(pruebaacc==true) {
			System.out.println("Puedes acceder al grado");
		}else {
			System.out.println("Lo siento no puedes acceder al grado");
		}	
	}

}
