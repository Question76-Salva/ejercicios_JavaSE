/*
    === Ejercicio 08 | Arrays ===
    Teniendo un array de String con el nombre de personas y otro de números con su edad, indicar quien es la persona
    más mayor.
*/

package Arrays;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		String[] nombres = {"Fernando", "Jaime", "Alberto", "Pepito"};
        int[] edades = {28, 31, 20, 40};
        
        // relacionar los dos arrays por sus índices | son de la misma longitud
        int mayor = edades[0];
        int posicionMayor = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
                posicionMayor = i;
            }
        }
        
        System.out.println("La persona más mayor es: " + nombres[posicionMayor] + " con " + mayor);
    }
		
}
     

