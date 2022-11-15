package Punto3;

public abstract class ElementoUniversidad implements Comparable<ElementoUniversidad>{
	private String nombre;
	public abstract int getCantAlumnos();
	
	public ElementoUniversidad(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int compareTo(ElementoUniversidad otro) {
		return this.getNombre().compareTo(otro.getNombre());
	}
	
	@Override
	public boolean equals(Object obj) {
		try{
			ElementoUniversidad eu = (ElementoUniversidad)obj;
			return this.nombre.equals(eu.nombre);
		}
		catch(Exception exc) {
			return false;
		}
	}
	
}
