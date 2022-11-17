package Punto1;

import java.util.Comparator;
import Punto1.Comparadores.ComparadorAscendenteString;
import Punto1.Comparadores.ComparadorNot;
import Punto2_Alumno.Alumno;
import Punto2_Alumno.Comparadores.ComparadorApellido;
import Punto2_Alumno.Comparadores.ComparadorCompuesto;
import Punto2_Alumno.Comparadores.ComparadorDni;
import Punto2_Alumno.Comparadores.ComparadorNombre;
import Punto3.ComparadorCantAlumnos;
import Punto3.ElementoUniversidad;
import Punto3.Grupo;



public class Main {

	public static void main(String[] args) {
//		testAddLista();
		testSimple();	
	}
	
	
	
	
	public static void testAddLista() {
		// prueba de add en lista 1 de string	
		Comparator<String> ascendente = new ComparadorAscendenteString();	
		Lista<String> lista1 = new Lista<String>(ascendente);
		lista1.insertar("hola");
		lista1.insertar("zzz");
		lista1.insertar("jaja");
		System.out.println("prueba de add en lista de String");
		for(Object n: lista1) {
	    	System.out.println(n);
		}
	}
	
	public static void testSimple() {
		
		Alumno a2 = new Alumno("z","z",1,29);
		Alumno a3 = new Alumno("a","a",3,29);
		
		Comparator<ElementoUniversidad> compCantidad = new ComparadorCantAlumnos();
		Comparator<Alumno> compApellido = new ComparadorApellido<>();
		Lista<ElementoUniversidad> l1 = new Lista<ElementoUniversidad>(compCantidad);
		Grupo<ElementoUniversidad> universidad = new Grupo<ElementoUniversidad>("UNICEN", compCantidad);
		l1.insertar(universidad);
		Grupo<Alumno> g1 = new Grupo<Alumno>("exactas", compApellido);
		Grupo<Alumno> g2 = new Grupo<Alumno>("humanas", compApellido);
		g1.addElementoUniversidad(a2);
		g1.addElementoUniversidad(a3);
		universidad.addElementoUniversidad(g1);
		universidad.addElementoUniversidad(g2);
		
		for(Object n: l1) {
			System.out.println(n);
		}
		
		l1.eliminarOcurrencias(g1);
		
		for(Object n: l1) {
			System.out.println(n);
		}
		
	
	}
	
	public static void testComplejo() {
		  
		System.out.println("------------------------------");
		//prueba de add de alumnos a lista 2
	
		Comparator<Alumno>  apellido = new ComparadorApellido<Alumno>();
		Comparator<Alumno>  nombre = new ComparadorNombre<Alumno>();
		Comparator<Alumno>  dni = new ComparadorDni<Alumno>();
		Comparator<Alumno> compuesto = new ComparadorCompuesto<Alumno>(apellido,nombre,dni);
	

		Alumno a1 = new Alumno("z","z",2,29);
		Alumno a2 = new Alumno("z","z",1,29);
		Alumno a3 = new Alumno("z","a",3,29);
		
		Grupo g1 = new Grupo("grupo 1");
		Grupo g2 = new Grupo("grupo 2");

		g1.addElementoUniversidad(a1);
		g1.addElementoUniversidad(a3);
		g1.addElementoUniversidad(a2);
		g2.addElementoUniversidad(a1);
		g1.addElementoUniversidad(g2);
		
	//	Comparator ascendente = new ComparadorAscendente();	
	//	Lista<ElementoUniversidad> lista2 = new Lista<ElementoUniversidad>(ascendente);
		
//		lista2.insertar(a1);
//		lista2.insertar(a2);
//		lista2.insertar(a3);
//		lista2.insertar(g1);
//		
//		
//		for(Object n: lista2) {
//			System.out.println(n);
//		}
	}
	

}
