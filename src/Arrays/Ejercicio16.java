/*
    === Ejercicio 17 | Arrays ===
    Comprobar cuales son pares e impares en una array, 
    y guardar los pares en un array aparte y los impares en otro.
*/

package Arrays;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
        
        int[] a, pares, impares;        
        a = new int[10];
        
        System.out.println("Introduce 10 elementos para el array a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = teclado.nextInt();
        }
        
        int totalPares = 0;
        int totalImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        
        // crear los arrays para los pares e impares
        pares = new int[totalPares];
        impares = new int[totalImpares];
        
        int indicePares = 0;
        int indiceImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
            	// posincremento, primero se asigna y luego se incrementa
                pares[indicePares++] = a[i];        
            } else {
                impares[indiceImpares++] = a[i];
            }
        }
        
        System.out.println("Imprimir el array de los números pares:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        
        System.out.println(" ");
        
        System.out.println("Imprimir el array de los números impares:");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

	}

}
