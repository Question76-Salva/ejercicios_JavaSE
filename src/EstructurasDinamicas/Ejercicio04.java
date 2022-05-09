/*
	=== Ejercicio 04 | Estructuras Dinámicas ===
	Crear un arraylist y que tenga 4 opciones:
	- si escribo por consola 1, me pida que inserte un elemento a la lista.
	- 2, me pida que elemento de la lista quiero eliminar
	- 3, me muestre la lista
	- 0, terminar el programa
*/

package EstructurasDinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		// === definir la lista/arraylist ===
        ArrayList<String> lista = new ArrayList<String>(5);
        
        // === leer por teclado ===
        Scanner sc = new Scanner(System.in);
        
        // === variable para las opciones del programa ===
        int opcion = 1;
        
        // === mientras no sea 0 la opción | ejecuta el bucle ===
        while (opcion != 0) {
            System.out.println("Lista de datos");
            System.out.println("Inserte 1 para añadir un elemento");
            System.out.println("Inserte 2 para eliminar un elemento");
            System.out.println("Inserte 3 para mostrar la lista");
            System.out.println("Inserte 0 para salir del programa");
            
            // === en opcion se almacena lo que introduzcamos por consola | convertido a int ===
            opcion = sc.nextInt();
            
            // === lógica del programa ===
            if (opcion == 1) {
                System.out.println("¿Que elemento quiere añadir?");
                Scanner scanner = new Scanner(System.in);       // lee del teclado
                String elementoAdd = scanner.nextLine();            // guarda dato introducido
                lista.add(elementoAdd);                                         // introduce dato en la lista
            } 
            else if (opcion == 2) {
                System.out.println("Diga el número de elemento que quiere eliminar: ");     // pide número de índice
                int elementoDelete = sc.nextInt();                                                                   // guarda dato introducido
                
                // el tamaño de la lista debe ser mayor al número introducido, así que sí existe esa posición en la lista
                if (lista.size() > elementoDelete) {
                    lista.remove(elementoDelete);                           // elimina elemento
                } else {
                    // hemos introducido un número mayor que el tamaño de la lista, no existe tal cantidad de elementos
                    System.out.println("La lista no contiene tantos elementos. Seleccione una opción");
                    continue;                                                               // continua con el bucle while desde el principio
                }
            } 
            else if (opcion == 3) {
                // mostrar la lista
                System.out.println("Esta es la lista actual: ");
                System.out.println(lista);
            } 
            else if (opcion == 0) {
                System.out.println("Adios");
                break;                                                                            // rompe el bucle while y se sale/interrumpe el programa
            }
            else {
                // en caso de que se introduzca una opción no válida | que no sea 1, 2, 3, 0
                System.out.println("Opción incorrecta. Intenteló otra vez");
                continue;                                                                        // continua con el bucle while desde el principio
            }
        }
		
	}

}
