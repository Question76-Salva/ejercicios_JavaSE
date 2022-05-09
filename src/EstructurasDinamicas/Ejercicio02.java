/*
 * 		=== Ejercicio 02 | Estructuras Dinámicas ===
 * 		Cola/Queue 
 * 		El primero que entra es el primero que sale
 * 
*/

package EstructurasDinamicas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// === definir y crear la cola/queue | no se puede instanciar, es una clase abstracta ===
        Queue<Integer> cola = new LinkedList<Integer>();
        
        // === evitar excepción si la cola está vacia y queremos sacar un elemento de ella ===
        if (cola.isEmpty()) {
            System.out.println("La cola está vacia");
        }
        
        // === add -> añadir elementos a la cola ===
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        
        // === size -> comprobar el tamaño de la cola ===
        System.out.println("La cola tiene " + cola.size() + " elementos");
        
        // === peek -> obtener copia del primer elemento de la cola pero sin sacarlo de ella | la cola no se modifica ===
        int copiaPrimerElemento = cola.peek();
        System.out.println(copiaPrimerElemento);
        System.out.println(cola);
        
        // === poll -> extraer elementos de la cola | el primero de la cola ===
        cola.poll();
        System.out.println(cola);

	}

}
