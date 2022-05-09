/*
    === Ejercicio 14 | Arrays ===
    Combinar dos arrays en un tercero | arrays combinados.
*/
package Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
				             
		// inicializar 3 arrays de enteros y darles dimensiones
		int [] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        // === llenar a y b, poblar el c con los datos de a y b ===        
        for (int i = 0; i < a.length; i++) {
        	// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            a[i] = i + 1;                                               
        }
        
        for (int i = 0; i < b.length; i++) {
        	// 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
            b[i] = (i + 1) * 5;                                         
        }
        
        // c -> contendrá un elemento del a y un elemento del b... y así sucesivamente  1, 5, 2, 10, 3, 15, 4, 20...
        // 10 -> recorrer los elementos de a y b, en cada iteración insertar 2 elementos, uno de cada, a y b
        // aux -> vairable auxiliar para el índice del array c | se incrementa en cada iteración 2 veces, una por cada índice de a y b
        int aux = 0;
        for (int i = 0; i < 10; i++) {
        	// primero se asigna y después se incrementa, 
        	// posincremento aux++
            c[aux++] = a[i];                    
            c[aux++] = b[i];
        }
        
        for (int i = 0; i < c.length; i++) {
            System.out.println("posición " + i + " : " + c[i]);
        }

	}

}
