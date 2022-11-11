package Punto2_Alumno.Comparadores;

import java.util.Comparator;

import Punto2_Alumno.Alumno;

public class ComparadorDni<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		
		return (((Alumno) o1).getDni() - ((Alumno) o2).getDni());
	}
	

}
