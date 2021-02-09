package PracticaObjetos;

public class PrincipalContra {

	public static void main(String[] args) {
		
		Password p = new Password(25);

		System.out.println(p.getContrasena());
		System.out.println(p.esFuerte());
	}

}
