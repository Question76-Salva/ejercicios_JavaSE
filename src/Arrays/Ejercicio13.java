/*
    === Ejercicio 13 | Arrays ===
    Iterando en orden inverso un array
*/

package Arrays;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		String[] productos = {"Kingston Pendrive", "Samsung Galxy", "SSD Samsung", "Asus Notebook", "Macbook Air", "Chromecast", "Bici Oxford"};         
        
        // === for ===
        Arrays.sort(productos);             // ordenar array alfabéticamente
        int total = productos.length;       // forma más eficiente para iterar el for
        for (int i = 0; i < total; i++) {
            System.out.println("Para índice " + i + " : " + productos[i]);
        }
        
        // === for | a la inversa ===
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("Para índice " + i + " valor: " + productos[i]);
        }

	}

}
