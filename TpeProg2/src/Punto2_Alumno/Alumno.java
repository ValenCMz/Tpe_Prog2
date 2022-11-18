package Punto2_Alumno;

import java.util.ArrayList;
import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;
import Punto3.ElementoUniversidad;
import Punto3.Grupo;

public class Alumno extends ElementoUniversidad {

	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;

	public Alumno(String nombre, String apellido, int dni, int edad){
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new ArrayList<>();
		
	}
	
	public Alumno(String nombre, String apellido, int dni){
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.intereses = new ArrayList<>();
		
	}

	public void addIntereses(String interes) {
		this.intereses.add(interes);
	}
	
	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		
		return this.getNombre() + " " + this.apellido + " " + "DNI:" + this.dni + " " +  "Intereses:" +this.intereses;
	}
	
	@Override
		public int getCantAlumnos() {
			return 1;
		}
	@Override
	public boolean equals(Object obj) {
		try {
			Alumno g = (Alumno)obj;
			return this.getNombre().equals(g.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}

}
