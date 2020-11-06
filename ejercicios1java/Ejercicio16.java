package ejercicios1java;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		int cont=0;
		String clave="";
		boolean interruptor=false;
		
		while ((cont<3) && (interruptor==false)) {
			System.out.println("Dime la clave de acceso");
			clave= leer.next();
			if (clave.equals("eureka")) {
				System.out.println("La contraseña es correcta");
				interruptor=true;
			}
			cont=cont+1;
		}
		if ((cont==3) && (interruptor=false)) {
			System.out.println("Ya no tienes mas intentos");
		}
	}

}
