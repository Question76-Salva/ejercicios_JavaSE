/*
 	=== Ejercicio 01 | Busquedas ===
 	Búsqueda Binaria

	el array debe estar ordenado en forma ascendente 
	para poder buscar un elemento, para así buscarlo de una manera
	muy óptima.
 
*/
package Busquedas;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// === definir el array | ordenado ascendente ===
        int arreglo[] = {1, 2, 3, 4, 5};
        
        // === valor a buscar | en el array ===
        int dato;
                      
        // === preguntar al usuario el dato que quiere buscar ===
        dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a buscar: "));
        
        // ========================
        // === busqueda binaria ===
        // ========================        
        // === bandera | comprobar ===
        boolean bandera = false;
        
        // === número inferior ===
        int inf = 0;
        
        // === número superior ===
        // la cantidad de elementos que tiene el array
        int sup = 5;
        
        // === mitad ===
        int mitad = (inf + sup) / 2;
        
        // === iterador ===
        int i = 0;
        
        // mientras "inf" sea menor o igual a "sup" y además 
        // la cantidad de elementos del array no sea superior a 5
        while (inf <= sup && i < 5) {
            // comprobar si el número en el que vamos es exactamente 
        	// el dato que estamos buscando.
            // si el array en la posición "mitad" es igual al "dato" 
        	// lo hemos encontrado.
            if (arreglo[mitad] == dato) {
                bandera = true;
                // rompemos el bucle | ya no necesitamos seguir iterando
                break;
            }
            
            // si no lo hemos encontrado 
            // el número es "mayor" al que estamos buscando
            if (arreglo[mitad] > dato) {
                // refrescar "sup"
                sup = mitad;
                // refrescar "mitad"
                mitad = (inf + sup) / 2;
            }
            
            // si no lo hemos encontrado 
            // el número es "menor" al que estamos buscando
             if (arreglo[mitad] < dato) {
                // refrescar "sup"
                inf = mitad;
                // refrescar "mitad"
                mitad = (inf + sup) / 2;
            }
             
             i++;
        }
        
        // === se ha encontrado el elemento buscado ===
        if (bandera == true) {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: " + mitad);
        } else {
            // === no se ha encontrado el elemento buscado ===
            JOptionPane.showMessageDialog(null, "El número no ha sido encontrado en el array");
        }

	}

}
