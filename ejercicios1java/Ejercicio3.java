package ejercicios1java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime un numero");
		num2=leer.nextInt();
		
		if(num1>num2) {
			
			System.out.println("El numero mas grande es " + num1);
			
		}else if(num2==num1){
			System.out.println("Los dos numeros son iguales");
		}else {
			System.out.println("El numero mas grande es " + num2);
		}
		
		
	}

}
