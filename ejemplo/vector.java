package ejemplo;

import java.util.Random;

public class vector {

	public static void main(String[] args) {
		
		int mNum[][] = new int [2][2];
		int tam = 10;
		String vNombres[];
		vNombres= new String[tam];
		//num aleatorio
		
		Random azar = new Random();
		
		for (int i = 0; i < mNum.length; i++) {
			for (int j = 0; j < mNum.length; j++) {
				mNum[i][j] = azar.nextInt(9); 
			}
		}
		
		for (int i = 0; i < mNum.length; i++) {
			for(int j = 0; j < mNum[i].length; j++) {
				System.out.print(mNum[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		/*int vNumeros[] = new int[10];
		
		
		String vNombres[] = new String[10];
		
		vNumeros[0] = 1;
		vNumeros[9] = 10;
		vNombres[0] = "Juan";
		vNombres[9] = "Pepe";
		
		
		for (int i = 0; i < vNombres.length; i++) {
			if(vNombres[i]!=null) {
				System.out.println(vNombres[i].toUpperCase());
			}
			
		}
		for (int i = 0; i < vNumeros.length; i++) {
			System.out.println(vNumeros[i]);
			
		*/}
	
}
