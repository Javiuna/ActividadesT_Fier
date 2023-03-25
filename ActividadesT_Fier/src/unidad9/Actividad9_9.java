// Unidad 9
// Actividad 9_9
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;

public class Actividad9_9 {
	public static void main(String[] args) {
		System.out.println(" a) Suponga que la siguiente llamada a método se encuentra en un método ingresos sobrescrito en una subclase: super.ingresos()");
		System.out.println("La respues es:");
		System.out.println("Dentro de un método ingresos sobrescrito en una subclase invoca el método ingresos"); 
        System.out.println("de la superclase de la subclase actual. Esto se hace para acceder a la funcionalidad de la implementación de la superclase");
	    System.out.println("de ingresos que puede haber sido cambiada en la subclase");
	    System.out.println("--------------------------------------");
	
	    System.out.println(" b) Suponga que la siguiente línea de código aparece antes de la declaración de un método:\r\n"
	    		+ "@Override");
		System.out.println("La respues es:");
		System.out.println("La anotación \"@Override\" se utiliza para indicar que un método en una clase se está sobrescribiendo de un método de la superclase."); 
        System.out.println("Esto ayuda a detectar errores de programación al verificar que el método anotado");
	    System.out.println("con \"@Override\" en realidad está sobrescribiendo un método de la superclase.");
	    System.out.println("--------------------------------------");
	    
	    System.out.println("c) Suponga que aparece la siguiente línea de código como la primera instrucción en el cuerpo de un constructor:\r\n"
	    		+ "super(primerArgumento, segundoArgumento);");
		System.out.println("La respues es:");
		System.out.println("La línea de código \"super(primerArgumento, segundoArgumento);\" en un constructor llama al constructor de la superclase de la subclase actual con los argumentos especificados."); 
        System.out.println("Esto se utiliza para inicializar las variables de instancia heredadas de la superclase y se debe llamar como la primera línea de código dentro del cuerpo del constructor de la subclase.");
	    System.out.println("--------------------------------------");
	}
}