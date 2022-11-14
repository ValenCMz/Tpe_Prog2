package Punto1.Comparadores;

import java.util.Comparator;

import Punto1.Nodo;

public class ComparadorAscendente<T> implements Comparator<Comparable<T>>{


	@Override
	public int compare(Comparable<T> o1, Comparable<T> o2) {
		return o1.compareTo((T) o2); 
	}}
