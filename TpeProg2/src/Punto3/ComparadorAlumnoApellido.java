package Punto3;

import java.util.Comparator;

import Punto2_Alumno.Alumno;

public class ComparadorAlumnoApellido implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.getApellido().compareTo(o2.getApellido());
	}

}
