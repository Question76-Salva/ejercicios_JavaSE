/*
    === Ejercicio 10 | Arrays ===
    Máximo, mínimo y media de un array
    Haz un programa que le pida 10 números enteros al usuario
    y los introduzca en un array, al finalizar,
    le muestre por pantalla el valor mínimo, el máximo y la media
    de los datos introducidos.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        int [] numeros = new int[10];
        
        int mayor = numeros[0];
        int menor = numeros[0];
        int suma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce número en la posición " + i);
            numeros[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
             
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
              
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("El menor número del array es: " + menor);
        System.out.println("El mayor número del array es: " + mayor);
        System.out.println("La media del array es: " + (suma / 10.0));
	}
}
