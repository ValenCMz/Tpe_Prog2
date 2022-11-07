package Punto1.Comparadores;

import java.util.Comparator;

import Punto1.Nodo;

public class ComparadorNot implements Comparator<Nodo>{

	private Comparator<Nodo> comp;
	
	public ComparadorNot(Comparator<Nodo>comp) {
		this.comp = comp;
	}

	@Override
	public int compare(Nodo o1, Nodo o2) {
		return comp.compare(o1, o2) * -1;
	}

}
