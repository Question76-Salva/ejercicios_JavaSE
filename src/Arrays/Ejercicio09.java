/*
    === Ejercicio 09 | Arrays ===
    Búsqueda en un array
    Haz un programa que le pida 10 números enteros al usuario y, 
    al finalizar, le pida un número a buscar y le responda
    si era uno de los datos introducidos inicialmente.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        int[] datos = new int[10];
        int numeroABuscar;
        boolean encontrado = false;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime el número " + (i + 1) + ": ");
            datos[i] = teclado.nextInt();
        }
        
        System.out.println("¿Qué número buscamos?: ");
        numeroABuscar = teclado.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (datos[i] == numeroABuscar) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Encontrado el número " + numeroABuscar);
        } else {
            System.out.println("No se ha encontrado el número " + numeroABuscar);
        }

	}

}
