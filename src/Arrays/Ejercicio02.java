/*
    === Ejercicio 02 | Arrays ===
    Crea un array de 10 posiciones y rellenalo con números aleatorios. Muestralos al final.
    Crea una función para rellenarlo y otra para mostrar.
*/

package Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int[] numerosArray = new int[10];
        
        rellenarArrayAleatorios(numerosArray, 5, 50);
        
        mostrarArray(numerosArray);
		

	}
	
	public static int generarAleatorios(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1) + (minimo));
    }
    
    public static void rellenarArrayAleatorios(int[] array, int minimo, int maximo) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarAleatorios(minimo, maximo);
        }
    }
    
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
