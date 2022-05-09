/*
 
	=== Ejercicio 02 | Búsquedas ===
	Búsqueda Secuencial

	El array puede estar ordenado o desordenado, da lo mismo, 
	ya que va a buscar en todas las posiciones.
	Esto no es muy eficiente, porque si el array 
	tiene 1000 posiciones vamos a tener que dar muchas vueltas.

*/

package Busquedas;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// === definir el array ===
        int arreglo[] = {4, 1, 5, 2, 3};
        
        // === valor a buscar | en el array ===
        int dato;
        
        // === bandera | comprobar ===
        boolean bandera = false;
        
        // === preguntar al usuario el dato que quiere buscar ===
        dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a buscar: "));
        
        // ===============================================================
        // === busqueda secuencial | buscar el "dato" dentro del array ===
        // ===============================================================        
        // tenemos que recorer el array posición por posición 
        // si el número que estamos buscando se encuentra ahí,
        // si se encuentra le mostramos al usuario la posición/índice 
        // en donde se encuentra el número dentro del array,
        // si no se encuentra le decimos con un mensaje que el número 
        // no está dentro del array
        
        int i = 0;
        // mientras no se haya recorrido todo el array
        // y además no hayamos encontrado el valor buscado... 
        // sigue buscando
        while (i < 5 && bandera == false ) {
            // si el número en el array en el que vamos es igual 
        	// al dato que estamos buscando... encontrado
            if (arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }
        
        // === resultados ===
        
        // si bandera sigue siendo falso, no encontró el número 
        // nunca entró en la condiciónal del while...
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "El número " + dato + " no se encuentra en el arreglo.");
        } else {
            // si está el valor en el arreglo
            // (i - 1) -> porque cuando se encuentra el dato el i++ 
        	// salta una vez a la siguiente posición, por eso 
            // debemos retroceder en una posición
            JOptionPane.showMessageDialog(null, "El número " + dato + " ha sido encontrado en la posición: " + (i - 1));
        }

	}

}
