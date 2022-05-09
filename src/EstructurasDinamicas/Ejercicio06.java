/*
 * 		=== Ejercicio 06 | Estructuras Dinámicas ===
 * 		Diccionario/HashTable 
 * 		Estructura que almacena pares de valores, clave - valor
 * 
*/

package EstructurasDinamicas;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// === definir/crear hashtable === 
        Hashtable<String, String> diccionario = new Hashtable<String, String>(3);
		
		// ======================================
        // === métodos de Hastable más usados ===
        // ======================================
        
        // === put(clave, valor) -> añadir elementos al hashtable ===
        diccionario.put("String", "Tipo de variable que almacena texto");
        diccionario.put("int", "Tipo de variable que almacena un numero entero");
        diccionario.put("Double", "Tipo de variable que almacena un numero decimal");
        System.out.println(diccionario);
        
        // === size -> saber el tamaño del diccionario ===
        System.out.println(diccionario.size());
        
        // === isEmpty -> comprobar si el diccionario está vacio | true/fase ===
        System.out.println(diccionario.isEmpty());
        
        // === -> enumerar los elementos del diccionario ===
        Enumeration valoresDiccionario = diccionario.elements();
        
        while (valoresDiccionario.hasMoreElements()) {            
            // mientras el diccionario tenga más elementos el bulce se sigue ejecutando...
            // imprime el siguiente elemento
            System.out.println(valoresDiccionario.nextElement());
        }
        
        // === contains -> comprobar si existe un 'valor' en el diccionario | true/false ===
        System.out.println(diccionario.contains("Tipo de variable que almacena texto"));
        
        // ===  containsKey -> comprobar si existe una 'clave' en el diccionario | true/false ===
        System.out.println(diccionario.containsKey("String"));
        
        // ===  get -> obtener un valor del diccionario por su clave asociada ===
        System.out.println(diccionario.get("Double"));
        
        // === put -> ampliar/añadir nuevos elementos al diccionario ===
        System.out.println(diccionario.put("Boolean", "Tipo de variable que almacena true o false"));
        System.out.println(diccionario);
        
        // === remove -> borrar un valor del diccionario por su clave ===
        diccionario.remove("Double");
        System.out.println(diccionario);
        
        // === clear -> borrar todo el contenido del diccionario ===
        diccionario.clear();
        System.out.println(diccionario);

	}

}
