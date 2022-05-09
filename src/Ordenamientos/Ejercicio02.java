/*
    === Ejercicio 02 | Ordenamientos ===
    Algoritmo burbuja "optimizado".
 */
package Ordenamientos;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String[] productos = {"Kingston Pendrive", "Samsung Galxy", "SSD Samsung", "Asus Notebook", "Macbook Air", "Chromecast", "Bici Oxford"};

		// forma más eficiente para iterar el for
        int total = productos.length;             
        // cuantas veces itera
        int contador = 0;                                 

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                // el segundo for cambia | comparamos sólo los "j" | 
            	// iterar tantas veces como elementos tenga el arreglo
                // y después vamos comparando "pares" de elementos, 
            	// el elemento actual con el siguiente "j+1"
                // si están en el orden equivocado lo organiza
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
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
