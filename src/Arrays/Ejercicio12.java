/*
    === Ejercicio 12 | Arrays ===
    Iterando arrays de difrentes formas: 
    for, foreach, while, do...while
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        String[] productos = {"Kingston Pendrive", "Samsung Galxy", "SSD Samsung", "Asus Notebook", "Macbook Air", "Chromecast", "Bici Oxford"};         
                
        // === for ===
        Arrays.sort(productos);             // ordenar array alfabéticamente
        int total = productos.length;       // forma más eficiente para iterar el for
        for (int i = 0; i < total; i++) {
            System.out.println("Para índice " + i + " : " + productos[i]);
        }
        
        // === forEach ===
        for(String producto: productos) {
            System.out.println("Producto: " + producto);
        }
        
        // === while ===
        int i = 0;
        while(i < total) {
             System.out.println("Con while - para índice " + i + " : " + productos[i]);
             i++;
        }
        
        // === do... while ===
        int j = 0;
        do {            
            System.out.println("Con do while - para índice " + j + " : " + productos[j]);
             j++;
        } while (j < total);
        
        // =====================================================================
        
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("Introduce un número para el índice: " + k);
            numeros[k] = teclado.nextInt();
        }
        
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println(numeros[k]);
        }

	}

}
