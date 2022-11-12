package Punto1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import Punto1.Comparadores.ComparadorAscendente;
import Punto2_Alumno.Alumno;
import Punto2_Alumno.Comparadores.ComparadorApellido;
import Punto2_Alumno.Comparadores.ComparadorCompuesto;
import Punto2_Alumno.Comparadores.ComparadorDni;
import Punto2_Alumno.Comparadores.ComparadorNombre;
import Punto3.ElementoUniversidad;
import Punto3.Grupo;



public class Main {

	public static void main(String[] args) {
		
		
	//prueba de add en lista 1 de string	
		Comparator ascendente = new ComparadorAscendente();	
		Lista<String> lista1 = new Lista<String>(ascendente);
		lista1.insertar("hola");
		lista1.insertar("zzz");
		lista1.insertar("jaja");
		System.out.println("prueba de add en lista de String");
		for(Object n: lista1) {
	    	System.out.println(n);
		}
		    
System.out.println("------------------------------");
		//prueba de add de alumnos a lista 2
	
		Comparator<Alumno>  apellido = new ComparadorApellido<Alumno>();
		Comparator<Alumno>  nombre = new ComparadorNombre<Alumno>();
		Comparator<Alumno>  dni = new ComparadorDni<Alumno>();
		Comparator<Alumno> compuesto = new ComparadorCompuesto<Alumno>(apellido,nombre,dni);
	

		Alumno a1 = new Alumno("Gonzales","Pedro",21,29);
		Alumno a2 = new Alumno("Rodriguez","Pedro",21,29);
		Alumno a3 = new Alumno("Gonzales","Pedro",20,29);
		Alumno a4 = new Alumno("Roman","aaaa",21,29);
		Alumno a5 = new Alumno("Luis","bbbb",21,29);
		Alumno a6 = new Alumno("Marcelo","sadsad",20,29);
		
		Grupo g1 = new Grupo("grupo 1");
		Grupo g2 = new Grupo("grupo 2");

		g1.addElementoUniversidad(a4);
		g1.addElementoUniversidad(a5);
		g1.addElementoUniversidad(a6);
		g2.addElementoUniversidad(a4);
		g2.addElementoUniversidad(a5);
		g2.addElementoUniversidad(a6);
		g1.addElementoUniversidad(g2);
		
		Lista<ElementoUniversidad> lista2 = new Lista<ElementoUniversidad>(ascendente);
		
		lista2.insertar(a1);
		lista2.insertar(a2);
		lista2.insertar(a3);
		lista2.insertar(g1);
		
		
		for(Object n: lista2) {
			System.out.println(n);
		}
		
		

	
	  

	    
	    

	}

}
