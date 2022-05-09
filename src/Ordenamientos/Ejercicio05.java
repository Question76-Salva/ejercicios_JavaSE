/*
        === Ejercicio 05 | Ordenamientos ===
        Método ordenamiento Selección
        
        Es un algoritmo de ordenamiento que requiere 
        ordenaciones O(n^2) operaciones
        para ordenar una lista de "n" números.
        
        Su funcionamiento es el siguiente:

        1. Buscar el mínimo elemento de la lista.
        2. Intercambiar con el primer elemento.
        3. Buscar el mínimo del resto de la lista.
        4. Intercambiar con el segundo.
        5. Y así sucesivamente.
        
*/

package Ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        // === no sabemos el número de elementos del array ===
        int arreglo[], nElementos;
        
        // === pedir al usuario el número de elementos 
        // que va a contener el array | jOptionPanel ===
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de elementos del array: "));
        
        // === asignarle al array el número de elementos 
        // que el usuario nos ha dicho ===
        arreglo = new int[nElementos]; 
        
        // === pedir los elementos/números al usuario | rellenar el array ===
        for (int i = 0; i < nElementos; i++) {
            // === (i + 1) -> para empezar desde el 1 ===
            System.out.println((i + 1) + " - Introduzca un número: ");
            // === guardar los números que se van introduciendo en el array  ===
             arreglo[i] = teclado.nextInt();
        }
        
        // ========================
        // === método selección ===
        // ========================       
         // iterador del bucle
        for (int i = 0; i < nElementos; i++) {
            // suponemos que la primera posición "i" es el número menor
            // min -> estará apuntando a la primera posición
            int min = i;
            // iterar desde la siguiente posición "i + 1"
            for (int j = i + 1; j < nElementos; j++) {
                // buscar el número menor del array 
            	// y cambiarlo por el iterador en el que vamos
                // si el elemento que va en arreglo[j] 
            	// es menor que el que va en arreglo[min] -> es el menor
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            
            // === intercambiar valor | posición ===
            int aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        
        // === mostrar el array ordenado | de forma creciente ===
        System.out.println("Array ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        
        System.out.println("");
        
        // === mostrar el array ordenado | de forma decreciente ===
        System.out.println("Array ordenado en forma decreciente: ");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

	}

}
