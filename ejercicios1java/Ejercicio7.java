package ejercicios1java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
		float por1, por2, num1, num2, total;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime el numero de niños");
		num1=leer.nextInt();
		System.out.println("Dime el numero de niñas");
		num2=leer.nextInt();
		
		total=num1+num2;
		
		por1=(num1/total)*100;
		por2=(num2/total)*100;
		
		System.out.println("El porcentaje de niños es "+ por1 + " y el porcentaje de niñas es " + por2);
		
	}

}
