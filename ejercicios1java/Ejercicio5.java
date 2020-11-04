package ejercicios1java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		System.out.println("Dime un numero");
		num2=leer.nextInt();
		System.out.println("Dime un numero");
		num3=leer.nextInt();
		
		if (num1<0) {
			System.out.println("La multiplicacion de los tres numeros es "+ num1*num2*num3);
		}else {
			System.out.println("La suma de todos los numeros es " + (num1+num2+num3) );
		}

	}

}
