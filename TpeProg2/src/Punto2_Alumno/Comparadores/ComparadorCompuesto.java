package Punto2_Alumno.Comparadores;

import java.util.Comparator;

import Punto2_Alumno.Alumno;

public class ComparadorCompuesto implements Comparator<Alumno> {

	private Comparator<Alumno> comp1;
	private Comparator<Alumno> comp2;
	private Comparator<Alumno> comp3;
	
	public ComparadorCompuesto(Comparator<Alumno> comp1,Comparator<Alumno> comp2, Comparator<Alumno> comp3) {
		this.comp1 = comp1;
		this.comp2 = comp2;
		this.comp3 = comp3;
	}
		@Override
	public int compare(Alumno o1, Alumno o2) {
		int res = comp1.compare(o1, o2);
		if(res == 0){
			res = comp2.compare(o1, o2);
			if(res == 0){
				res = comp3.compare(o1, o2);
			}
		}
		return res;
	}

	
}
