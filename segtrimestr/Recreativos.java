package segtrimestr;

import java.util.Scanner;

public class Recreativos {

	public static int pintaMenu() {
		int num=0;
		do {
			System.out.println("1- Guardar un nuevo juego");
			System.out.println("2- Poner puntuacion a un juego");
			System.out.println("3- Ver todos los juegos");
			System.out.println("0- Para salir del menu");
			
			Scanner leer = new Scanner(System.in);	
			num = leer.nextInt();
			
		} while (num<1 || num > 3);
		
		
		
		
		return 0;
		 
		//Guardar un nuevo juego
		//Poner puntuación a un juego
		//Ver todos los juegos
		
	}
	
	public static void verTodosJuegos(Juego vJuegos[]) {
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i]==null) {
				System.out.println("El juego es + " + vJuegos[i]);
			}
		}
		
		
	}
	
	public static void guardarJuego(Juego vJuegos[]) {
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] == null) {
				vJuegos[i] = new Juego();
			}
		}
		
		
		
	}
	
	public static void ponerPuntuacionJuego(Juego vJuegos[]) {
		
		Scanner leer = new Scanner(System.in);
		
		String buscar="";
		System.out.println("¿Que pelicula quieres puntuar?");
        buscar= leer.next();
        
        for (int i = 0; i < vJuegos.length; i++) {
        		
			if (vJuegos[i].equals(buscar)) {
				System.out.println("Pon la puntuacion");
				buscar= leer.next();
				
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Juego vJuegos[] = new Juego[100];
		
		Juego juego1 = new Juego("CiberPunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("Fifa");
		
		vJuegos[0] = juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		vJuegos[3] = new Juego("Tetris");
		
		vJuegos[2].setMultijugador(true);
		vJuegos[2].ponerRecord(100);
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] != null && vJuegos[i].isMultijugador()) {
				System.out.println(vJuegos[i].toString());
			}
			
		}
		

	}

}
	
	

