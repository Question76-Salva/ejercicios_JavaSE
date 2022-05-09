/*
 * 		=== Ejercicio 03 | Estructuras Dinámicas ===
 * 		Lista -> ArrayList 
 * 		Lista de elementos
 * 
*/

package EstructurasDinamicas;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// === declarar y definir ArrayList ===
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        // =================================
        // === métodos más usados de ArrayList ===
        // =================================
        
        // === add -> añadir valores al ArrayList ===
        lista.add(1);
        lista.add(100);
        lista.add(50);
        lista.add(25);        
        System.out.println(lista);
        
        // === contrains -> saber si en la lisa está un elemento determinado | true/false ===
        System.out.println(lista.contains(50));
        
        // === get -> obtener un elemento de la lista por número de índice ===
        System.out.println(lista.get(1));
        
        // === set -> incluir un elemento en la lista por número de índice ===
        System.out.println(lista.set(0, 200));
        System.out.println(lista);
        
        // === isEmpty -> comprobar si la lista está vacia o no | true/false ===
        System.out.println(lista.isEmpty());
        
        // === indexOf -> conocer la posición/índice que ocupa en la lista el elemento indicado ===
        System.out.println(lista.indexOf(100));
        
        // === remove -> eliminar un elemento de una determinada posición/índice ===
        System.out.println(lista.remove(0));
        System.out.println(lista);
        
        // === Collections.sort -> ordenar los elementos de la lista ===
        Collections.sort(lista);
        System.out.println(lista);
        
        // === clear -> borrar todos los elementos de la lista ===
        lista.clear();
        System.out.println(lista);

	}

}
