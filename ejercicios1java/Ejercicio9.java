package ejercicios1java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int num1;
		
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		;
		
		if (num1==0){
			System.out.println("El numero " + num1 + " no es ni impar ni par ");
		}else if(num1%2!=0) {
			System.out.println("El numero " + num1 + " es impar");
		}else if(num1%2==0) {
			System.out.println("El numero " + num1 +  " es par");
		}

	}
	
}
