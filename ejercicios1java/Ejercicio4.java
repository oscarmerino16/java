package ejercicios1java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime un numero");
		num2=leer.nextInt();
		System.out.println("Dime un numero");
		num3=leer.nextInt();
		
		if(num1>num2 && num1>num3) {
			
			System.out.println("El numero mas grande es " + num1);
			
		}else if(num2>num1 && num2>num3) {
			System.out.println("El numero mas grande es " + num2);
		}else {
			System.out.println("El numero mas grande es " + num3);
		}

	}

}
