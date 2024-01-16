package Aula;

import java.util.Arrays;

public class Aula {

	private String alumnos[]; 
	
	private int contador = 0; 
	
	public Aula(int caben) { 
		alumnos = new String[caben]; 
	} 

	public void addAlumno(String nombre) {
		if(contador<alumnos.length) {
			alumnos [contador] = nombre; 
			contador++; 
		}
		else {
			System.out.println("La clase está llena");
		}
	} 

	public String plazasDisponibles() {
		int plazasDisponibles = alumnos.length-contador;
		return "Plazas disponibles: " + plazasDisponibles;
	}
	
	public String toString() { 
		return Arrays.toString(alumnos);
	} 

} 
	

