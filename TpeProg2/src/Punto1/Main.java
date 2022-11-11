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



public class Main {

	public static void main(String[] args) {
		
		Comparator apellido = new ComparadorApellido();
		Comparator nombre = new ComparadorNombre();
		Comparator dni = new ComparadorDni();
		Comparator compuesto = new ComparadorCompuesto(apellido,nombre,dni);
		
		Comparator ascendente = new ComparadorAscendente();
		
		Lista<String> lista1 = new Lista<String>(ascendente);
//		lista1.setCabeza(n1);
//		lista1.setFin(n4);
//		
//		Comparator compDesc = new ComparadorNot(compAsc);
//		Lista lista2 = new Lista(compDesc);
//		lista2.setCabeza(n5);
//		lista2.setFin(n8);
//
//		System.out.println("Recorro lista 2");
//		for(Nodo n:lista2) {
//			System.out.println(n);
//		}
//		
//		System.out.println("---------------");
//		System.out.println("Recorro lista 1 con foreach");
//		for(Nodo as: lista1) {
//			System.out.println(as);
//		}
//	    
//
//		System.out.println("---------------");
//		System.out.println("Recorro lista 1 con while");
//		Iterator<Nodo> iterator2 = lista1.iterator();
//	    
//	    while (iterator2.hasNext()) {
//            Nodo element = iterator2.next();
//            System.out.println(element);
//        }
	    
	    //---------------------------------
//	    
		Alumno a1 = new Alumno("Gonzales","Pedro",21,29);
//		Alumno a2 = new Alumno("Rodriguez","Pedro",21,29);
//		Alumno a3 = new Alumno("Gonzales","Pedro",20,29);
	
		lista1.insertar("hola");
		lista1.insertar("zzz");
		lista1.insertar("jaja");
		System.out.println("prueba de add");
	    
	   
	    for(Object n: lista1) {
	    	System.out.println(n);
	    }
	    
	    //para que se deban agregar objetos o tipos primitivos siempre del mismo tipo y no se rompan los comparadores
	    //en la clase Lista le agregamos <T> que es un parametro del tipo de la clase, instrucciones para que el precompilador sepa que tipos debe asumir

	    
	    

	}

}
