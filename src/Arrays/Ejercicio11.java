/*
    === Ejercicio 11 | Arrays ===
    Guardar 5 números en un array (pedir al usuario) 
    y mostrarlos en orden inverso.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        
        int [] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número en la posición: " + i);
            numeros[i] = teclado.nextInt();
        }
        
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

	}

}
