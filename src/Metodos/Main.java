package Metodos;

public class Main {

	public static void main(String[] args) {
		
		// public -> una función siempre va a empezar por la palabra reservada public
        // static -> no depende de instancias | sólo depende de la clase
        // void -> tipo de retorno | no devuelve nada | para imprimir, actualizar...      
        
        // cuando se usa el . es cuando se invoca un método desde otras clases, 
		// no son métodos estáticos 
        
		// invocar método estático desde el método estático main
		mostrarMensaje();    
       
		//mostrarNumero(5);   // no se puede invocar desde el main porque no es estático

	}
	
	// todo método en java tiene la siguiente estructura:
    
    public static void mostrarMensaje() {
        System.out.println("Entrando al método mostrarMensaje en el main");
        // con void no podemos ejecutar el método en el "main"
        // para usar dentro del "main" tenemos que hacer el método estático, 
        // ya que "main" es static
        // porque sólo estamos en la misma clase | main
    }
    
    
    public void mostrarNumero(int numero) {
        System.out.println(numero);
        // con void no podemos ejecutar el método en el "main"
        // este método no podemos invocarlo en el main | 
        // tendríamos que convertirlo a static.
        // para usar dentro del "main" tenemos que hacer el método estático, 
        // ya que "main" es static
        // porque sólo estamos en la misma clase | main
    }

}
