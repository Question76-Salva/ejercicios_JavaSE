/*
    === Ejercicio 01 | Arrays  ===
    Crea un array de 3 posiciones, 
    rellenalo pidiendo los números al usuario 
    y recorrelo para mostrarlo.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[3];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número en la posición: " + i);
			numeros[i] = teclado.nextInt();
		}

		System.out.println("Los números del array son:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
