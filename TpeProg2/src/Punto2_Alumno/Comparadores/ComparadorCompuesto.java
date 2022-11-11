package Punto2_Alumno.Comparadores;

import java.util.Comparator;

public class ComparadorCompuesto<T> implements Comparator<T> {

	private Comparator<T> comp1;
	private Comparator<T> comp2;
	private Comparator<T> comp3;
	
	public ComparadorCompuesto(Comparator<T> comp1,Comparator<T> comp2, Comparator<T> comp3) {
		this.comp1 = comp1;
		this.comp2 = comp2;
		this.comp3 = comp3;
	}
	
	@Override
	public int compare(T o1, T o2) {
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
