/*
    === Ejercicio 15 | Arrays ===
    Detectar orden del array,
    detectar si el array está en orden ascendente o descendente.
    Partiendo de un array de números detectar si están ordenados o no.
 */

package Arrays;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		

        Scanner teclado = new Scanner(System.in);
        int[] a = new int[7];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa número para la posición: " + a[i]);
            a[i] = teclado.nextInt();
        }

        // recorrer y preguntar si cada elemento del array es mayor o menor al siguiente
        // si es mayor que el siguiente -> orden descendente
        // si es menor que el siguiente -> orden ascendente
        // mezclados -> desordenado
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) {
            // descendente
            if (a[i] > a[i + 1]) {
                descendente = true;
            }
            // ascendente
            if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        // resultado
        if (ascendente == true && descendente == true) {
            System.out.println("Arreglo = desordenado");
        }
        if (ascendente == false && descendente == false) {
            System.out.println("Arreglo = todos son iguales");
        }
        if (ascendente == true && descendente == false) {
            System.out.println("Arreglo = ordenado de forma ascendente");
        }
        if (ascendente == false && descendente == true) {
            System.out.println("Arreglo = ordenado de forma descendente");
        }

	}

}
