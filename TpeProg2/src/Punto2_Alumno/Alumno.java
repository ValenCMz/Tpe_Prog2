package Punto2_Alumno;

import java.util.ArrayList;
import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;
import Punto3.ElementoUniversidad;

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
		
		return this.getNombre() + this.apellido + this.dni;
	}
	
	@Override
		public int getCantAlumnos() {
			return 1;
		}
	

}
