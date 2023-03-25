// Unidad 3
// Actividad_Prueba 3.16
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

import java.util.Scanner;

public class PuebasA3_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Ingresa el primer nombre: ");
	        String nombre = scanner.nextLine();
	        
	     System.out.print("Ingresa el apellido: ");
	        String apellido = scanner.nextLine();
	        
	     System.out.print("Ingresa el dia: ");
	        int dia = scanner.nextInt();   
	     
	     System.out.print("Ingresa el mes: ");
	        int mes = scanner.nextInt();
	    
	     System.out.print("Ingresa el año: ");
	        int año = scanner.nextInt();

	        Actividad3_16 prue = new Actividad3_16(nombre, apellido, dia, mes, año);
	        
	       System.out.println("--------------------------------------------");
	        
	        System.out.println("       Información de la persona ");
	        System.out.println("Nombre completo: " + prue.obtenerNombre() + " " + prue.obtenerApellido());
	        System.out.println("Fecha de nacimiento: " + prue.obtenerDia() + " / " + prue.obtenerMes() + " / " + prue.obtenerAño());
	        
	        System.out.println("Edad: " + prue.obtenerEdad() + " años");
	        System.out.println("Frecuencia cardiaca máxima: " + prue.obtenerFcm() + " latidos por minuto");
	        System.out.println("Rango de frecuencia cardiaca esperada: " + prue.obtenerFcd1() + " - " + prue.obtenerFcd2() );
	        

	        scanner.close();
	    }	
	}
