package ejercicios1java;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		int num=0, total=0 ;
		float cont=1;
		
		System.out.println("Dime una serie de numeros hasta que te pongas -1");
		num= leer.nextInt();
		
		while (num!=-1) {
			total=total+num;
			cont=cont+1;
			num= leer.nextInt();
		}
		System.out.println("La media aritmetica de los numeros es " + total/(cont-1)) ;
	}

}
