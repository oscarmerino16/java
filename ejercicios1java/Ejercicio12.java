package ejercicios1java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
			
		int num=1;		

		while (num<=9) {
			System.out.println(num*num);
			num=num+1;
		}
	}

}
