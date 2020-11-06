package ejercicios1java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner leer= new  Scanner(System.in);
		
		int num, total=0;	
		
		System.out.println("Dime un numero natural");
		num=leer.nextInt();
			
		int cont=num;
		
		while (cont>0) {
			if (num %2==0) {
				total=total+num;
				cont=cont-1;
			}
			num=num+1;
		}
		System.out.println("La suma de los numeros es " + total);
	}

}
