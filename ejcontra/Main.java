package ejcontra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String usuario;
		int password;
		boolean segura;
		
		/*Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Juan", 1, false);
		vPassword[1] = new Password("Pepe", 2, true);
		vPassword[2] = new Password("Adelin", 3, true);
		vPassword[3] = new Password("Jordi", 4, false);*/
		
		//Password vPassword[] = IODatos.cargarDatos("pass.dat");
		Password vPassword[] = IODatos.cargarObjetos("objetos.dat");
		
		for (Password p : vPassword) {
		
			if (p!=null) {
				System.out.println(p);
			}
			
		}
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el nombre del nuevo usuario");
		usuario=leer.next();
		System.out.println("Dime la contraseña del nuevo usuario");
		password=leer.nextInt();
		System.out.println("Dime si la contraseña del nuevo usuario es segura con un true o no con un fasle");
		segura=leer.nextBoolean();
		
		Password p = new Password(usuario, password, segura);
		
		for (int i = 0; i < vPassword.length; i++) {
			if (vPassword[i]==null) {
				vPassword[i]=p;
				break;
			}
		}
		
		//IODatos.guardarDatos("pass.dat", vPassword);
		IODatos.guardarObjetos("objetos.dat", vPassword);
	}

}
