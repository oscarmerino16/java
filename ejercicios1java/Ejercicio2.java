package ejercicios1java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime un numero");
		num2=leer.nextInt();
		
		num3=num1+num2;
		System.out.println("La suma de "+ num1 + " y " + num2 + " es "+ num3);
		
		num3=num1-num2;
		System.out.println("La resta de "+ num1 + " y " + num2 + " es "+ num3);
		
		num3=num1*num2;
		System.out.println("La multiplicacion de "+ num1 + " y " + num2 + " es "+ num3);
		
		num3=num1/num2;
		System.out.println("La division de "+ num1 + " y " + num2 + " es "+ num3);
	}

}
