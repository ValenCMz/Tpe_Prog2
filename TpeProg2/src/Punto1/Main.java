package Punto1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import Punto2_Alumno.Alumno;
import Punto2_Alumno.Comparadores.ComparadorApellido;
import Punto2_Alumno.Comparadores.ComparadorCompuesto;
import Punto2_Alumno.Comparadores.ComparadorDni;
import Punto2_Alumno.Comparadores.ComparadorNombre;



public class Main {

	public static void main(String[] args) {
		
		//lista1
		Nodo n1 = new Nodo("1");
		Nodo n2 = new Nodo("2");
		Nodo n3 = new Nodo("3");
		Nodo n4 = new Nodo("4");
		Nodo n9 = new Nodo("1");
		
		//lista2
		Nodo n5 = new Nodo("5");
		Nodo n6 = new Nodo("6");
		Nodo n7 = new Nodo("7");
		Nodo n8 = new Nodo("8");
		
//		n5.setSiguiente(n6);
//		n6.setSiguiente(n7);
//		n7.setSiguiente(n8);
//		
		
		//TODO add en Lista
//		n1.setSiguiente(n2);
//		n2.setSiguiente(n3);
//		n3.setSiguiente(n4);
		
		Comparator apellido = new ComparadorApellido();
		Comparator nombre = new ComparadorNombre();
		Comparator dni = new ComparadorDni();
		Comparator compuesto = new ComparadorCompuesto(apellido,nombre,dni);
		
		Lista lista1 = new Lista(compuesto);
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
	    
		Alumno a1 = new Alumno("Gonzales","Pedro",21,29);
		Alumno a2 = new Alumno("Rodriguez","Pedro",21,29);
		Alumno a3 = new Alumno("Gonzales","Pedro",20,29);
	
		lista1.insertar(a1);
		lista1.insertar(a2);
		lista1.insertar(a3);
		System.out.println("prueba de add");
	    
	   
	    for(Nodo n: lista1) {
	    	System.out.println(n);
	    }
	    

	    
	    

	}

}
