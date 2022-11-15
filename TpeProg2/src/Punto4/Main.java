package Punto4;

import java.util.Comparator;

import Punto1.Lista;
import Punto1.Comparadores.ComparadorAscendenteInteger;

public class Main {

	public static void main(String[]args) {
//		a) Se cree la lista de números mostrada en la figura del punto 2, con los valores
//		insertados en el siguiente orden: 10, 21, 1, 5, 11
		Comparator<Integer>compAscInt = new ComparadorAscendenteInteger();
		Lista<Integer> listaInteger = new Lista<Integer>(compAscInt);
		listaInteger.insertar(10);
		listaInteger.insertar(21);
		listaInteger.insertar(1);
		listaInteger.insertar(5);
		listaInteger.insertar(11);
//		b) Se recorra la lista creada (utilizando un foreach) y se impriman los valores por
//		consola
		System.out.println("Punto B");
		for(Object n : listaInteger) {
			System.out.println(n);
		}
//		c) Se elimine el primer elemento de la lista (por posición), luego el elemento “5” y luego
//		el elemento “11” (dado el elemento). Volver a recorrer e imprimir la lista resultante.
		System.out.println("Punto c");
		listaInteger.eliminar(0);
		listaInteger.eliminarOcurrencias(5);
		listaInteger.eliminarOcurrencias(11);
		for(Object n : listaInteger) {
			System.out.println(n);
		}
	}

}
