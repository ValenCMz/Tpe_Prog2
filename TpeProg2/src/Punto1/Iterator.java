package Punto1;

public class Iterator implements java.util.Iterator<Object>{

	private Nodo iterador;
	
	public Iterator(Nodo iterador) {
		this.iterador = iterador;
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
	
	public void setIterador(Nodo otro) {
		this.iterador = otro;
	}

}
