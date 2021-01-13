package segtrimestr;

public class perronace {

	public static void main(String[] args) {
		
		Perro p = new Perro();
		Perro p2 = new Perro ("juan", 2);
		Perro p3 = new Perro ("juan", 200,100);
		Perro os = new Perro ("franci", 7);
		
		Perro vPerros[] = new Perro[10];
		
		vPerros[0]= p2;
		vPerros[1]= new Perro ("juan", 200,100);
		vPerros[2]= new Perro ("juan", 201,100);
		vPerros[3]= new Perro ("juan", 202,100);
		
		for (int i = 0; i < vPerros.length; i++) {
			if (vPerros[i] !=null && vPerros[i].comprobarChip()) {
				System.out.println(vPerros[i].toString());
			}
			
		}
		
		
	}

}
