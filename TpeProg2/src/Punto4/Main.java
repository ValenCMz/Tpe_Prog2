package Punto4;

import java.util.Comparator;

import Punto1.Lista;
import Punto1.Comparadores.ComparadorAscendenteInteger;
import Punto1.Comparadores.ComparadorAscendenteString;
import Punto1.Comparadores.ComparadorNot;
import Punto2_Alumno.Alumno;
import Punto2_Alumno.Comparadores.ComparadorApellido;
import Punto3.ComparadorCantAlumnos;
import Punto3.ElementoUniversidad;
import Punto3.Grupo;

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
	//	d) Se cree la lista de strings mostrada en la figura 2 del punto 1, con los valores
	//		insertados en el siguiente orden: “Fácil”, “Es”, “Parcial”, “Prog 2”.	
		Comparator<String>compAscString = new ComparadorAscendenteString();
		Lista<String> listaString = new Lista<String>(compAscString);
		listaString.insertar("Facil");
		listaString.insertar("Es");
		listaString.insertar("Parcial");
		listaString.insertar("Prog2");
		
		System.out.println("Punto E");
		for(Object n : listaString) {
			System.out.println(n);
		}
		
		//f) Imprimir por consola en qué posición se encuentra la palabra “Parcial”
		System.out.println("Punto F");
		System.out.println(listaString.getPosicionPrimerOcurrencia("Parcial"));
	
		//g) Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio”
		System.out.println("Punto G");
		System.out.println(listaString.getPosicionPrimerOcurrencia("Recuperatorio"));

//		h) Se cambie el orden de la lista de strings para que los elementos queden ordenados
//		descendentemente
		System.out.println("Punto H");
		
		Comparator<String>compDescendete = new ComparadorNot<>(compAscString);
		listaString.setCriterioOrden(compDescendete);
		for(Object n : listaString) {
			System.out.println(n);
		}

		System.out.println("Punto I");
		Comparator<ElementoUniversidad>apellido = new ComparadorApellido<>();
		Comparator<ElementoUniversidad>compAscUniversidad = new ComparadorCantAlumnos();
		Comparator<ElementoUniversidad>compDesUniversidad = new ComparadorNot<ElementoUniversidad>(compAscUniversidad);

		Lista<ElementoUniversidad> lista1 = new Lista<ElementoUniversidad>(compDesUniversidad);
		Grupo<ElementoUniversidad> unicen = new Grupo<ElementoUniversidad>("unicen",compDesUniversidad);
		Grupo<ElementoUniversidad> exactas = new Grupo<ElementoUniversidad>("exactas",compDesUniversidad);
		Grupo<ElementoUniversidad> humanas = new Grupo<ElementoUniversidad>("humanas",compDesUniversidad);
		Grupo<ElementoUniversidad> historia = new Grupo<ElementoUniversidad>("historia",compDesUniversidad);
		Alumno john = new Alumno("John","Doe",1200000);//añadir a unicen
		john.addIntereses("intercambio");
		Alumno mora = new Alumno("Mora","Diaz",37124425);//añadir a humanas
		mora.addIntereses("psicologia");
		mora.addIntereses("Freud");
		Alumno federico = new Alumno("Federico","Lopez",35999888);//añadir a exactas
		federico.addIntereses("redes");
		federico.addIntereses("php");
		federico.addIntereses("java");
		federico.addIntereses("Python");
		Alumno juana = new Alumno("Juana","Garcia",27123455);//añadir a exactas
		juana.addIntereses("programacion");
		juana.addIntereses("php");
		juana.addIntereses("java");
		Alumno flora = new Alumno("Flora","Rivas",34555111);//añadir a historia
		flora.addIntereses("historia");
		flora.addIntereses("antigua");
		Alumno martin = new Alumno("Martin","Gomez",34111222);//añadir a historia
		martin.addIntereses("romanos");
		martin.addIntereses("egipcios");
		martin.addIntereses("griegos");
		Alumno roman = new Alumno("Roman","Bazan",32555111);//añadir a historia
		roman.addIntereses("argentina");

		
		unicen.addElementoUniversidad(exactas);
		unicen.addElementoUniversidad(humanas);
		humanas.addElementoUniversidad(historia);
		historia.addElementoUniversidad(roman);
		historia.addElementoUniversidad(martin);
		historia.addElementoUniversidad(flora);
		humanas.addElementoUniversidad(mora);
		exactas.addElementoUniversidad(federico);
		exactas.addElementoUniversidad(juana);
		unicen.addElementoUniversidad(john);
		lista1.insertar(unicen);
		
		for(Object n:lista1) {
			System.out.println(n);
		}
	}

}
