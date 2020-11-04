package ejercicios1java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int num1;
		String mes;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime el importe de la compra");
		num1=leer.nextInt();
		System.out.println("Dime el mes del año en el que se realiza la compra");
		mes=leer.next();
		
		if (mes.equals("octubre")) {
			System.out.println("El precio de su compra tiene un descunto del 15% y el total es " + (num1 - num1*0.15));
		}else {
			System.out.println("El precio de su compra es " + num1);
		}

	}

}
