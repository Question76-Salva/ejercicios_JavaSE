/*
    === Ejercicio 05 | Arrays ===
    Mostrar el menor y mayor de un array de números creado por tí mismo.
*/

package Arrays;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {

		int[] numeros = {23, 55, 32, 12, 69, 73, 1, 98, 84};
        
        System.out.println("El mayor número del array es: " + mostrarMayor(numeros));
        System.out.println("El menor número del array es: " + mostrarMenor(numeros));
        
        mostrarMayorMenor(numeros);

	}
	
	public static int mostrarMayor(int[] array) {
        int mayor = -99;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }    
    
    public static int mostrarMenor(int[] array) {
        int menor = 9999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
    
    public static void mostrarMayorMenor(int [] array) {
        Arrays.sort(array);                                     // ordena array
    int menor = array[0];                                 	 	// el primero será el menor
        int mayor = array[array.length - 1];           			// el último será el mayor
        System.out.println("Versión 2 - con métood Arrays.sort - El menor número del array es: " + menor);
        System.out.println("Versión 2 - con método Arrays.sort - El mayor número del array es: " + mayor);
    }

}
