/*
 * 		=== Ejercicio 05 | Estructuras Dinámicas ===
 * 		Pila 
 * 		El último que entra es el último que sale.
 * 
*/

package EstructurasDinamicas;

import java.util.Stack;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// === definir y crear la pila/stack ===
        Stack <Integer> pila = new Stack<Integer>();
        
        // === evitar excepción si la pila está vacia y queremos sacar un elemento de ella ===
        if (pila.empty()) {
            System.out.println("La pila no contiene elementos, está vacia");
        }
        
        // === push -> introducir elementos en la pila ===
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("La pila tiene " + pila.size() + " elementos");
        
        // === peek -> obtener copia del último elemento de la pila pero sin sacarlo de ella | la pila no se modifica ===
        int copiaUltimoElemento = pila.peek();
        System.out.println("El último elemento de la pila = " + copiaUltimoElemento);
        System.out.println(pila);
        
        // === -> sacar/extraer el último elemento de la pila | modificando la pila ===
        pila.pop();
        System.out.println(pila);

	}

}
