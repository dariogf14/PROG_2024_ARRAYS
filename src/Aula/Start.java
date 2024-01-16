package Aula;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Aula aula1 = new Aula(5); 

			aula1.addAlumno("Mario");
			aula1.addAlumno("Mateo");
			aula1.addAlumno("Darío");
			System.out.println(aula1.plazasDisponibles());
			aula1.addAlumno("Juan");			
			aula1.addAlumno("Pedro");			
			aula1.addAlumno("Roberto");			
			aula1.addAlumno("Andres");
			
			System.out.println(aula1.toString()); 

	} 

		
}
