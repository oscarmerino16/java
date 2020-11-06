package ejercicios1java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
			
		int num=0, cont=0, total=0;		
		
		System.out.println("Dime un numero natural");
		num=leer.nextInt();
		
		while (cont<num) {
			total=cont+total;
			cont=cont+1;
		}
		System.out.println("La suma de los numeros es " + total);
	}

}