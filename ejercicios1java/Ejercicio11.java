package ejercicios1java;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		boolean bach= true, pruebaacc = true;
		
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime si tienes el bachillerato para poder acceder al grado");
		bach=leer.nextBoolean();
	
		if (bach==true) {
			System.out.println("Puedes acceder el grado");
			
		}else {
				System.out.println("¿Has superado la prueba de acceso?");
				pruebaacc=leer.nextBoolean();
			
			if (pruebaacc==true) {
				System.out.println("Puedes acceder al grado");
			}else {
				System.out.println("Lo siento no puedes acceder al grado");
			}
		}
		
	}
}	
