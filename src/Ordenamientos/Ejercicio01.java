/*
    // === Ejercicio 01 | Ordenamientos ===
    Ordenamiento burbuja
    Simple, poco eficiente y con muchas comparaciones. 
    No se puede usar con arrays de muchos elementos. 
    Itera muchas veces y se ralentiza.

    Lo hace Array.sort también, pero lo vamos a hacer con algoritmia
    de forma manual para ordenar un array.
    
    Son dos for, el primero recorre cada elemento del array, y el segundo compara cada elemento con cada uno del resto del array,
    comparar todos con todos
 */

package Ordenamientos;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String[] productos = {"Kingston Pendrive", "Samsung Galxy", "SSD Samsung", "Asus Notebook", "Macbook Air", "Chromecast", "Bici Oxford"};

		// forma más eficiente para iterar el for
        int total = productos.length;             
        // cuantas veces itera
        int contador = 0;                                 

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {           
                	// compar cada elemento del i con cada elemento del j
                    String auxiliar = productos[i];                                    
                    // intercambiar posiciones, darle la vuelta
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("El algoritmo itera: " + contador + " veces.");
        
        for (int i = 0; i < total; i++) {
            System.out.println(productos[i]);
        }

	}

}
