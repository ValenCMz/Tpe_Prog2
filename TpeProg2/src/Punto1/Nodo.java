package Punto1;

import java.util.Iterator;

public class Nodo<T> implements Comparable<Nodo<T>>{//ta raro que sea iterator, va a ser una clase aparte
	
	private Comparable<T> valor;
	private Nodo<T> siguiente;
	

	public Nodo(Comparable<T> valor){
		this.valor = valor;
		this.siguiente = null;
	}
	
	public Nodo() {
		
	}

	public void setSiguiente(Nodo<T> nodo){
		this.siguiente = nodo;
	}
	
	public Nodo<T> getSiguiente(){
		return this.siguiente;
	}

	public Comparable<T> getValor(){
		return valor;
	}
	
	//Consultar
	@Override
	public int compareTo(Nodo<T> o) {
		return this.valor.compareTo((T) o.getValor());
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}
	@Override
	public boolean equals(Object o){
		Nodo<T> n = (Nodo<T>) o;
		return this.getValor()== n.getValor();
	}

	

}
