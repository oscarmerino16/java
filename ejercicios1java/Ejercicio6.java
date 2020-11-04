package ejercicios1java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1;
		
		Scanner leer = new Scanner(System.in);  
		
		System.out.println("Dime un numero");
		num1=leer.nextInt();
		
		double raiz = Math.sqrt(num1);
		
		if (num1<=0) {
			System.out.println("ERROR");
		}else {
			System.out.println("Del numero " + num1 + " su potencia es " + num1*num1 + " y su raiz es " + raiz   );
		}

	}


}
