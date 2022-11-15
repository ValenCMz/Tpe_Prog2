package Punto1.Comparadores;

import java.util.Comparator;

public class ComparadorAscendenteInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
