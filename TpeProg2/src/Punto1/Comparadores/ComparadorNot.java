package Punto1.Comparadores;

import java.util.Comparator;

import Punto1.Nodo;

public class ComparadorNot<T> implements Comparator<T>{

	private Comparator<T> comp;
	
	public ComparadorNot(Comparator<T>comp) {
		this.comp = comp;
	}

	@Override
	public int compare(T o1, T o2) {
		return comp.compare(o1, o2) * -1;
	}

}
