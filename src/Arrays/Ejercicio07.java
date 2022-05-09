/*
    === Ejercicio 07 | Arrays ===
    Dado un array de números, indica cual es el elemento más repetido, 
    en caso de empate, mostrar el último más repetido.
*/

package Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 4, 3, 1, 2, 4, 3, 3, 6, 5, 5, 3 };

		int contador = 0;
		int mayor = 0;
		int mayorRepeticiones = 0;

		int numeroBuscado; 			// primer bucle
		int numeroActual; 			// bucle anidado

		for (int i = 0; i < array.length; i++) {
			numeroBuscado = array[i];
			contador = 0;
			for (int j = 0; j < array.length; j++) {
				numeroActual = array[j];
				if (numeroBuscado == numeroActual) {
					contador++;
				}
			}
			if (contador >= mayorRepeticiones) {
				mayor = numeroBuscado;
				mayorRepeticiones = contador;
			}
		}

		System.out.println("El número más repetido es: " + mayor + " con " + mayorRepeticiones + " repeticiones.");

	}

}
