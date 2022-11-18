package Punto1;

public class Nodo<T>{
	
	private T valor;
	private Nodo<T> siguiente;
	

	public Nodo(T valor){
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

	public T getValor(){
		return  valor;
	}
	
	@Override
	public String toString() {
		return "[" + valor  + "]";
	}
	



}
