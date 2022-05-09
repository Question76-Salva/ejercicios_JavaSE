/*
 * 		=== Ejercicio 01 | Funciones ===
 * */

package Funciones;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// === invocar las funciones | desde el método principal | main ===
        
        // al ser las funciones static las invoco con el nombre de la clase 
		// por delante, seguida del punto
        MisFunciones.miFuncionSinArgumentos();
        
        // tiene que recibir entre los paréntesis dos datos (tipo int) 
        // separados por una coma
        MisFunciones.miFuncionConArgumentos(5, 10);
        
        // no imprime nada 
        // puesto que en la función no se define que imprima el resultado 
        // sólo que lo devuelva
        MisFunciones.miFuncionConValor(10, 20);
        
        // para imprimir el restulado de lo que devuelve 
        // la función con valor seria:
        System.out.println(MisFunciones.miFuncionConValor(10, 20));
        
        // también podemos sumar un valor a los parámetros
        System.out.println(MisFunciones.miFuncionConValor(10, 20) + 30);

	}	

}

class MisFunciones {
    
    public static void miFuncionSinArgumentos() {
        // static -> función estática, está dentro de la clase main  
    	// no hay que instanciarla. 
        // void -> no retorna ningún valor
        System.out.println("Al invocar esta función me evito el tener que escribir todo este texto una y otra vez");
    }
    
    public static void miFuncionConArgumentos(int a, int b) {
        // static -> función estática, está dentro de la clase main  
    	// no hay que instanciarla. 
        // void -> no retorna ningún valor
        System.out.println("La suma de a más b es igual a: " + (a + b));
    }
    
    public static int miFuncionConValor(int a, int b) {
        // las funciones que devuelven un valor del tipo que sea 
    	// (int, double, String...) siempre deben terminar 
        // en su última línea con "return"
        // retorna la suma de a más b
        return a + b;
    }
}
