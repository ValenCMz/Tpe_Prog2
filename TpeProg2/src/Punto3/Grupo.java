package Punto3;

import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;

public class Grupo<T> extends ElementoUniversidad{

	private Lista<ElementoUniversidad> listaElementosUniversidad;
	
	public Grupo(String nombre) {
		super(nombre);
		this.listaElementosUniversidad =  new Lista<ElementoUniversidad>();
	}
	
	public Grupo(String nombre, Comparator<T> criterio) {
		this(nombre);
		this.setCriterioOrden(criterio);
	}


	@Override
	public int getCantAlumnos() {
		int sum = 0;
		for(int i = 0;i<listaElementosUniversidad.getSize();i++) {
			ElementoUniversidad eu =  (ElementoUniversidad) listaElementosUniversidad.getValor(i); //esta bien castear esto?
			sum += eu.getCantAlumnos();
		}
		return sum;
	}
	
	public void addElementoUniversidad(ElementoUniversidad nuevo ) {
		this.listaElementosUniversidad.insertar(nuevo);
	} 
	
	@Override
	public String toString() {
		String toReturn = this.getNombre()+"\n";
		for(Object o : listaElementosUniversidad) {
			Nodo aux = (Nodo)o;
			ElementoUniversidad eu = (ElementoUniversidad)aux.getValor();
			toReturn += "    " + aux.toString()+ "\n" ;
		}
		return toReturn;
	}

	public void setCriterioOrden(Comparator comparator) {
		this.listaElementosUniversidad.setCriterioOrden(comparator);
	}


	public Lista<Object> getListaElementosUniversidad(){
		Lista<Object> copia = new Lista<Object>();
		for(Object e: this.listaElementosUniversidad) {
			copia.insertar(e);
		}
		return copia;
	}

@Override
	public boolean equals(Object obj) {
		try {
			Grupo g = (Grupo)obj;
			return this.getNombre().equals(g.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
}
