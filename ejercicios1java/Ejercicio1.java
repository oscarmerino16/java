package ejercicios1java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//declaracion variables

		int num1=0, num2=0, aux=0;
		
		
		Scanner leer = new Scanner(System.in);
	
		System.out.println("Dime un numero");
		num1= leer.nextInt();
		System.out.println("Dime un numero");
		num2= leer.nextInt();
		aux=num1;
		num1=num2;
		num2=aux;
		System.out.println("El primer numero ahora vale "+ num1 + " y el segundo numero ahora vale "+ num2);
		
		
	}

}
