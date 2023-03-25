// Unidad 9
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;

import java.util.Scanner;

public class PruebaEPC {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.print("Ingresa el primer nombre: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.print("Ingresa el apellido: ");
	        String apellido = scanner.nextLine();
	        
	        System.out.print("Ingresa el numero del seguro social: ");
	        String SS = scanner.nextLine();
		   
	        System.out.print("Ingresa las ventas brutas: ");
		    double ventasb = scanner.nextDouble();
		       
		    System.out.print("Ingresa la tarifa por comision: ");
		    double tf = scanner.nextDouble();
		    
	        EmpleadoPorComision empleado = new EmpleadoPorComision(nombre, apellido, SS, ventasb, tf);

	        System.out.println("-------------------------------------------------------");
	        System.out.println("Información del empleado: ");
	        System.out.println( empleado.toString());
	        System.out.println("Ingresos: $" + empleado.ingresos());       


	        scanner.close();
	    }
	}