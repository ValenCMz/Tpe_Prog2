package Punto3;

import java.util.Comparator;

public class ComparadorAlumnoPorCantidad implements Comparator<ElementoUniversidad>{
	
	@Override
	public int compare(ElementoUniversidad o1, ElementoUniversidad o2) {
		return o1.getCantAlumnos()-o2.getCantAlumnos();
	}

}
