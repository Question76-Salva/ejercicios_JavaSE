/*
    === Ejercicio 01 | Estructuras Dinámicas ===
    ArrayList
    Crea un ArrayList y rellenalo con una cantidad 
    aleatoria de números aleatorios de entre 1 y 10. 
    
    Por ejemplo, en una iteración lo puedes rellenar 
    con 20 números y en otra lo puedes rellenar con 14 números.
*/

package EstructurasDinamicas;

import java.util.ArrayList;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();
        
        int cantidadNumeros = generarNumeroAleatorio(1, 20);
        
        for (int i = 0; i < cantidadNumeros; i++) {
            lista.add(generarNumeroAleatorio(1, 10));
        }
        
        for (Integer i : lista) {
            System.out.println(i);
        }
        
        // forma antigua
        int elemento;
        for (int i = 0; i < lista.size(); i++) {
            elemento = lista.get(i);
            System.out.println(elemento);
        }
		

	}
	
	public static int generarNumeroAleatorio (int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }

}
