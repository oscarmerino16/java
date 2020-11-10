package ejemplo;

import java.util.Scanner;

public class metodo {
	
	public static int pintaMenu() {
		
		int opc=-1;
		Scanner leer = new Scanner(System.in);
		
		while (opc < 1 || opc > 3) {
			
			System.out.println("1- Hola");
			System.out.println("2- Si");
			System.out.println("3- Salir");
			System.out.println("----------");
			System.out.println("Dime una opcion");
			
			opc= leer.nextInt();
			
		}
		
		return opc;
	}
	
	public static void main(String[] args) {
		int opc=0;
		
		do {
			opc=pintaMenu();
			
			switch (opc) {
			case 1:
				System.out.println("Opcion Hola");
				break;
			case 2:
				System.out.println("Opcion 2- Si");
				break;
			case 3:
				System.out.println("Opcion Salir - gracias por su visita");
				break;

			}
		} while (opc!=3);
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static int sumaParImpar(int a, int b) {
		int sumPar=0, sumImpar=0;
		
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				sumPar= sumPar+i;
			}else {
				sumImpar += i;
			}
		}
		System.out.println("Pares : " + sumPar);
		System.out.println("Impares : " + sumImpar);
		return sumPar;
	}

	public static void main(String[] args) {
		
		int num1=5, num2=10;
		
		sumaParImpar(num1, num2);
	}*/


