package Punto3;

public abstract class ElementoUniversidad implements Comparable{
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
	
	
	@Override
	public int compareTo(Object o) {
		return this.getCantAlumnos()-((ElementoUniversidad) o).getCantAlumnos();
	}
	
	
}
