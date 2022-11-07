package Punto1.Comparadores;

import java.util.Comparator;

import Punto1.Nodo;

public class ComparadorAscendente implements Comparator<Nodo>{


	@Override
	public int compare(Nodo o1, Nodo o2) {
		return o1.getValor().compareTo(o2.getValor());
	}
}
