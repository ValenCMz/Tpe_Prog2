package Punto1.Comparadores;

import java.util.Comparator;

import Punto1.Nodo;

public class ComparadorNot<T> implements Comparator<Comparable<T>>{

	private Comparator<Comparable<T>> comp;
	
	public ComparadorNot(Comparator<Comparable<T>>comp) {
		this.comp = comp;
	}

	@Override
	public int compare(Comparable<T> o1, Comparable<T> o2) {
		return comp.compare(o1, o2) * -1;
	}

}
