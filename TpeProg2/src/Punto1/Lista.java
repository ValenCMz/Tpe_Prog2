package Punto1;

import java.util.Comparator;
import java.util.Iterator;

public class Lista implements Iterable<Nodo>{

	private Nodo cabeza;
	private Comparator<Nodo> criterioOrden;
	private Nodo fin;

	public Lista(Comparator<Nodo> criterioOrden){
		this.cabeza = null;
		this.criterioOrden = criterioOrden;
	}
	
	public Lista() {
		this.cabeza = null;
	}
	
//	public void addNodo(Nodo nodo) {
//		//si la cabeza es nulla lo añado ahi
//		if(this.cabeza==null) {
//			this.setCabeza(nodo);
//		}
//		//si no cabeza ya existe
//		else {
//			//pregunto por el siguiente de este
//			addOrdenado(nodo);
//		}
//	}
//	
	
	//podria recibr un object en vez de un nodo para q sea mas reutilizable
//	public void add(Nodo nuevo) {
//		if(this.cabeza==null) {
//			this.setCabeza(nuevo);
////			cabeza.setIterador(nuevo);
//		}
//		else {
//			for (Nodo n: this) {
//				if(n.compareTo(nuevo)==-1) {
//					n.setSiguiente(nuevo);
//				}
//			}
//		}
//	}
	public int getSize(){
		int contador = 0;
		for(Nodo n: this){
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
		for(Nodo nodo: this){
			
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
	
	public Nodo getIndex(int pos){
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
	
	public void insertar(Nodo nuevo) {
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
	
//	public void addOrdenado(Nodo nodo) {
//		for(Nodo n: this) {
//			int res = this.criterioOrden.compare(n, nodo);
//			if(res==1) {
//				Nodo aux = n;
//				
//				
//			}
//		}
//	}
//	

	
	public void setFin(Nodo nodo) {
		this.fin = nodo;
	}
	
	public void setCriterioOrden(Comparator<Nodo> criterioOrden) {
		this.criterioOrden = criterioOrden;
	}

	public void setCabeza(Nodo nodo){
		this.cabeza = nodo;
	}

	public boolean estaVacia(){
		return this.cabeza == null;
	}

	@Override
	public Iterator<Nodo> iterator() {
		this.cabeza.setIterador(this.cabeza);
		return this.cabeza;
	}

}