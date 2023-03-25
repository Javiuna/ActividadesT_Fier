// Unidad 9
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;
import java.util.Scanner;

public class PruebaEPH {

		    public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);
		    	
		    	System.out.print("Ingresa el primer nombre: ");
		        String nombre = scanner.nextLine();
		        
		        System.out.print("Ingresa el apellido: ");
		        String apellido = scanner.nextLine();
		        
		        System.out.print("Ingresa el numero del seguro social: ");
		        String SS = scanner.nextLine();
			   
		        System.out.print("Ingresa las horas trabajadas: ");
			    int hora = scanner.nextInt();
			       
			    System.out.print("Ingresa el sueldo por hora: ");
			    double sueldo = scanner.nextDouble();
			    
			    EmpleadoporHoras empleado = new EmpleadoporHoras (nombre, apellido, SS, hora, sueldo);

		        System.out.println("-------------------------------------------------------");
		        System.out.println("Información del empleado: ");
		        System.out.println( empleado.toString());
		        System.out.println("Sueldo total: $" + empleado.sueldo());       


		        scanner.close();
		    }
		}