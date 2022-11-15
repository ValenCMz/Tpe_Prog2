package Punto1.Comparadores;

import java.util.Comparator;

public class ComparadorAscendenteString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}


}
