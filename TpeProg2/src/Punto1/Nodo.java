package Punto1;

import java.util.Iterator;

public class Nodo implements Comparable{//ta raro que sea iterator, va a ser una clase aparte
	
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
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}
	@Override
	public boolean equals(Object o){
		Nodo n = (Nodo) o;
		return this.getValor()== n.getValor();
	}

}
