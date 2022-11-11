package Punto2_Alumno;

import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;

public class Alumno extends Nodo{//no debe extender de nodo

	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	private Lista intereses;
	private Comparator<Alumno> criterioDeOrden;

	public Alumno(String nombre, String apellido, int dni, int edad){
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new Lista();
		
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

	
	/*public int compareTo(Alumno o) {
		int res = this.apellido.compareTo(o.getApellido());
		if(res == 0){
			res = this.nombre.compareTo(o.getNombre());
			if(res == 0){
				res = (int) ( this.dni - o.getDni());
			}
	}
	return res;
	
	}*/
	@Override
	public String toString() {
		
		return this.nombre + this.apellido + this.dni;
	}
}
