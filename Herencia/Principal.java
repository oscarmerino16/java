package Herencia;

public class Principal {

	public static void main(String[] args) {
		
			
			Alumno vAlumnos[] = new Alumno[10];
			
			vAlumnos[0] = new Alumno("Juan", 22, "Programacion");
			
			Personal vPersonal[] = new Personal[10];
			
			vPersonal[1] = new Alumno("Juan", 22, "1º DAW");
			vPersonal[0] = new Personal("Javier", 18);
			vPersonal[2] = new Profesor("Kasper", 65, "Entornos de desarrollo");
			vPersonal[3] = new Administrativos("Jose", 65, "ESO");
			vPersonal[4] = new Interino("Kasper", 65, "Empleado", "ESO");
			vPersonal[5] = new Fijo("Oscar", 20, "Jefe", "SI");
			
			
			for (Personal p : vPersonal) {
				if ((p != null) && (p instanceof Fijo)) {
					System.out.println(p.toString());
				}
			}
		}

}


