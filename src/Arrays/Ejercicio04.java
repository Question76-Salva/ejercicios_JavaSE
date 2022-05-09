/*
    === Ejercicio 04 | Arrays ===
    Crea dos arrays e indica si son iguales.
*/

package Arrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int [] arrayUno = {1, 2, 3, 4, 5};
        int [] arrayDos = {1, 2, 3, 4, 5};
        
        compararArrays(arrayUno, arrayDos);

	}
	
	public static void compararArrays(int [] array1, int [] array2 ) {
        if(Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }
    }  

}
