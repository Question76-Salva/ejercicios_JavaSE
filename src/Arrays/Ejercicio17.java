/*
    === Ejercicio 17 | Arrays ===
    Buscar elementos en un array.
    Buscar un número, si se encuentra, mostrar su posición, 
    si no se encuentra, notificar con un mensaje.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        int[] a = new int[10];
        
        System.out.println("Introduce los números para llenar el array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = teclado.nextInt();
        }
        
        System.out.println("Ingrese un número a buscar: ");
        int numeroABuscar = teclado.nextInt();
                
        // itera mientras:
        // estemos dentro del tamaño del array | que encuentre la posición del número que estamos buscando
        int i = 0;
        while (i < a.length && a[i] != numeroABuscar) {
            i++;
        }
        
        if (i == a.length) {
            System.out.println("Número no encontrado");
        } else if (a[i] == numeroABuscar) {
            System.out.println("Encontrado en la posición: " + i);
        }

	}

}
