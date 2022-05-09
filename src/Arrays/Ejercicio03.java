/*
    === Ejercicio 03 | Arrays ===
    Crea un array de números (dale los valores tu mismo) 
    e indica cual es la suma y la media de ese array.
*/

package Arrays;

public class Ejercicio03 {

	public static void main(String[] args) {

		int[] numeros = { 16, 4, 45, 51, 22, 88, 87 };
		// sumaArray(numeros);
		System.out.println("La suma de los números del array es: " + sumaArray(numeros));

		// mediaArray(numeros, 313);
		System.out.println("La media de los números del array es: " + mediaArray(numeros, sumaArray(numeros)));

	}

	public static int sumaArray(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	public static int mediaArray(int[] array, int suma) {
		int media = 0;
		for (int i = 0; i < array.length; i++) {
			media = suma / array.length;
		}
		return media;
	}

}
