package Punto1;

import java.util.Iterator;

public class Nodo implements Comparable,Iterator{
	
	private Nodo iterador;
	private Comparable valor;
	private Nodo siguiente;
	

	public Nodo(Comparable valor){
		this.valor = valor;
		this.siguiente = null;
	}
	
	public Nodo(){
		
	}

	public void setSiguiente(Nodo nodo){
		this.siguiente = nodo;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}

	public Comparable getValor(){
		return valor;
	}
	
	@Override
	public int compareTo(Object o) {
		Nodo otro = (Nodo) o;
		return this.valor.compareTo(otro.getValor());
	}

	@Override
	public boolean hasNext() {
		return this.iterador != null;
	}

	@Override
	public Object next() {
		Nodo toReturn = this.iterador;
		this.iterador = this.iterador.getSiguiente();
		return toReturn;
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}
	@Override
	public boolean equals(Object o){
		Nodo n = (Nodo) o;
		return this.getValor()== n.getValor();
	}
	public void setIterador(Nodo otro) {
		this.iterador = otro;
	}
		
}
