package Punto1;

import java.util.Comparator;
import Punto1.Iterator;

public class Lista<T> implements Iterable<Object>{//esto no debe ser de nodo

	private Nodo cabeza;
	private Comparator<Object> criterioOrden;
	
	public Lista(Comparator<Object> criterioOrden){
		this.cabeza = null;
		this.criterioOrden = criterioOrden;
	}
	
	
	public Lista() {
		this.cabeza = null;
	}
	
	public int getSize(){
		int contador = 0;
		for(Object n: this){
			contador ++;
		}
		return contador;
		
	}
	public int getPosicionPrimerOcurrencia(Nodo n){
		int pos = 0;
		boolean encontrado = false;
		while(pos< this.getSize() && encontrado == false){
				if(n.equals(this.getIndex(pos))){
					encontrado = true;
				}
			pos++;
		}
		return pos;
	}
	
	public void eliminarOcurrencias(Nodo n){
		int pos =0;
		for(Object nodo: this){
			
			if(n.equals(nodo)){
				this.eliminar(pos);	
				pos --;
			}
			pos++;
		}
	}
	
	public void eliminar(int pos){
		if(pos == 0){
			this.cabeza = this.cabeza.getSiguiente();
			}
		Nodo aux = new Nodo();
		aux = this.getIndex(pos).getSiguiente();
		this.getIndex(pos-1).setSiguiente(aux);
	}
	
	public Nodo getIndex(int pos){//va a devolver el valor no un nodo
		if(pos< this.getSize()){
			int contador = 0;
			Nodo aux = new Nodo();
			aux = cabeza;
			while(contador < pos){
				aux = aux.getSiguiente();
				contador ++;	
			}
			return aux;	
		}
		return null;	
	}
	
	public void insertar(Comparable<T> o1) {
		Nodo nuevo = new Nodo(o1); //ESTO ESTA BIEN?
		if(cabeza == null) {// caso lista vacia
			cabeza = nuevo;
		} else {
			Nodo comparacion = cabeza;
			boolean encontre = false;
			int res = criterioOrden.compare(comparacion, nuevo);
			if(res >= 1) { // caso nuevo deberia ser la raiz
				nuevo.setSiguiente(cabeza);
				cabeza = nuevo;
			} else {
				while(comparacion.getSiguiente() != null && !encontre) {
					res = criterioOrden.compare(comparacion.getSiguiente(), nuevo);
					if(res >= 1) { // caso nuevo deberia ir entre dos nodos
						Nodo aux = comparacion.getSiguiente();
						comparacion.setSiguiente(nuevo);
						nuevo.setSiguiente(aux);
						encontre = true;
					} else {
						comparacion = comparacion.getSiguiente(); // seguir recorriendo
					}
				}
				if(!encontre) { // caso fin de la lista
					comparacion.setSiguiente(nuevo);
				}
			}
		}
	}
	
	public void setCriterioOrden(Comparator<Object> criterioOrden) {
		this.criterioOrden = criterioOrden;
	}

	public void setCabeza(Nodo nodo){
		this.cabeza = nodo;
	}

	public boolean estaVacia(){
		return this.cabeza == null;
	}

	//esta bien devolver sin argumentos?
	@Override
	public Iterator iterator() {
		Iterator i = new Iterator(this.cabeza); 
		return i;
	}
	
	

	
	
	
	
	
	
	
	
}