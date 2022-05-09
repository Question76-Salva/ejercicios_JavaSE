/*
        === Ejercicio 04 | Arrays ===
        Método ordenamiento Inserción
        
        Es una manera muy natural de ordenar para un ser humano, 
        y puede usarse fácilmente para ordenar un mazo
        de cartas numeradas en forma arbitraria/aleatoria. 
        
        Requiere un orden O(n^2) operaciones para ordenar una lista 
        de "n" elementos.
        
        5, 3, 4, 1, 2

        Si
        numeroIzq > numeroActual
                        cambio de números

        "Son dos ciclos for anidados"
*/

package Ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        // no sabemos el número de elementos del array
        int arreglo[], nElementos;
        
        // pedir al usuario el número de elementos que va a contener el array 
        // jOptionPanel
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de elementos del array: "));
        
        // asignarle al array el número de elementos que el usuario nos ha dicho
        arreglo = new int[nElementos]; 
        
        // pedir los elementos/números al usuario | rellenar el array
        for (int i = 0; i < nElementos; i++) {
            // (i + 1) -> para empezar desde el 1
            System.out.println((i + 1) + " - Introduzca un número: ");
            // guardar los números que se van introduciendo en el array
             arreglo[i] = teclado.nextInt();
        }
        
        // ========================
        // === método inserción ===
        // ========================        
        // iterador del bucle
        for (int i = 0; i < nElementos; i++) {
            // pos -> posición del array | flecha del ejemplo del video
            int pos = i;
            // valor/número del array que vamos comprobando
            int aux = arreglo[i];
            
            // mientras que la posición sea mayor a cero y 
            // que el número a la izquierda sea mayor que el actual.
            // pos > 0 -> para no perder tiempo en el bucle ya que 
            // no vamos a poder compararlo con el número que está
            // a la izquierda de la posición 0, porque no hay ningún número...
            // y además de eso, necestiamos darnos cuenta que 
            // el número que está a la izquierda sea mayor 
            // que el número actual | si eso se cumple | cambiar números
            while (( pos > 0) && (arreglo[pos - 1] > aux)) {
                // igualar el número actual con el que estaba a la izquierda
                arreglo[pos] = arreglo[pos - 1];
                // pos--; -> para comprobar con los números 
                // que van a la izquierda hasta que llegue a la posición 1,
            	// porque en la posición 0 ya no hay ningún número a la izquierda
                pos--;
            }
            
            // === refrescar el número actual ===
            arreglo[pos] = aux;
            
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
