package Punto3;

import java.util.Comparator;

import Punto1.Lista;
import Punto1.Nodo;

public class Grupo extends ElementoUniversidad{

	private Lista<ElementoUniversidad>elementosUniversidad;
	private Comparator<ElementoUniversidad>criterio;
	
	public Grupo(String nombre) {
		super(nombre);
		this.elementosUniversidad =  new Lista<ElementoUniversidad>();
	}
	
	public Grupo(String nombre, Comparator<ElementoUniversidad>criterio) {
		this(nombre);
		this.criterio = criterio;
	}

	@Override
	public int getCantAlumnos() {
		int sum = 0;
		for(int i = 0;i<elementosUniversidad.getSize();i++) {
			ElementoUniversidad eu =  (ElementoUniversidad) elementosUniversidad.getValor(i); //esta bien castear esto?
			sum += eu.getCantAlumnos();
		}
		return sum;
	}
	
	public void addElementoUniversidad(ElementoUniversidad nuevo) {
		this.elementosUniversidad.insertar(nuevo);
		elementosUniversidad.sort();
	}
	
	@Override
	public String toString() {
		String toReturn = this.getNombre()+"\n";
		for(Object o : elementosUniversidad) {
			Nodo aux = (Nodo)o;
			ElementoUniversidad eu = (ElementoUniversidad)aux.getValor();
			toReturn += "    " + aux.toString()+ " \n";
		}
		return toReturn;
	}

	


	
}
