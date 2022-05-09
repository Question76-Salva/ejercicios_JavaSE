/*
        === Ejercicio 03 | Ordenamientos ===
        Método burbuja
         
        Funciona revisando/comparando cada elemento de la lista/array
        que va a ser ordeanda con el siguiente, intercambiándolos 
        de posición si están en el orden equivocado. 
        
        Es necesario revisar varias veces toda la lista 
        hasta que no se necesiten más intercambios, lo cual significa
        que la lista está ordenada.

        Ejemplo -> array [4, 5, 2, 1, 3]

        Si
        numeroActual > numeroSiguiente
                        cambio de números

        "Son dos ciclos for anidados"
*/

package Ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        // no sabemos el número de elementos del array
        int arreglo[], nElementos;
        
        // pedir al usuario el número de elementos que va a contener el array 
        // jOptionPanel 
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de elementos del array: "));
        
        // asignarle al array el número de elementos
        // que el usuario nos ha dicho
        arreglo = new int[nElementos]; 
        
        // pedir los elementos/números al usuario | rellenar el array
        for (int i = 0; i < nElementos; i++) {
            // (i + 1) -> para empezar desde el 1
            System.out.println((i + 1) + " - Introduzca un número: ");
            // guardar los números que se van introduciendo en el array
             arreglo[i] = teclado.nextInt();
        }
        
        // ======================
        // === método burbuja ===
        // ======================        
        // primer for | cuantas vueltas tiene que dar el ciclo 
        // siempre 1 menos que el tamaño del array
        for (int i = 0; i < (nElementos - 1); i++) {
            // segundo for | para ordenar el array | comparar números
            for (int j = 0; j < (nElementos - 1); j++) {
                // ordenar | SI numeroActual > numeroSiguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambiar valores | con ayuda de una variable auxilar
                    // aux -> guarda en aux el número actual
                    int aux = arreglo[j];
                    // al númeroActual le asignamos el valor del númeroSiguiente
                    arreglo[j] = arreglo[j + 1];
                    // el númeroSiguiente va a ser igual al númeroActual (aux)
                    arreglo[j + 1] = aux;                  
                }
            }
        }
        
        // === mostrar el array ordenado | de forma creciente ===
        System.out.println("Array ordenado en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(arreglo[i] + " - ");
        }
        
         // === mostrar el array ordenado | de forma decreciente ===
        System.out.println("Array ordenado en forma decreciente: ");
        for (int i = nElementos - 1; i >= 0 ; i--) {
            System.out.println(arreglo[i] + " - ");
        }

	}

}
