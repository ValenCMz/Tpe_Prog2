package Punto2_Alumno;

import java.util.ArrayList;
import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;

public class Alumno implements Comparable<Alumno>{//no debe extender de nodo

	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	private Comparator<Alumno> criterioDeOrden;

	public Alumno(String nombre, String apellido, int dni, int edad){
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new ArrayList<>();
		
	}

	public String getNombre() {
		return nombre;
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
		
		return this.nombre + this.apellido + this.dni;
	}

	@Override
	public int compareTo(Alumno o) {
		int res = this.getApellido().compareTo(o.getApellido());
		if(res==0) {
			res = this.getNombre().compareTo(o.getNombre());
		}
		return res;
	}
	
	
}
