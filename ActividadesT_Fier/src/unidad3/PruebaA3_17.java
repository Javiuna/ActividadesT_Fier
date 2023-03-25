// Unidad 3
// Actividad_Prueba 3.17
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

import java.util.Scanner;

public class PruebaA3_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Ingresa el primer nombre: ");
	        String nombre = scanner.nextLine();
	        
	     System.out.print("Ingresa el apellido: ");
	        String apellido = scanner.nextLine();
	        
		 System.out.print("Ingresa el sexo: ");
		        String sexo = scanner.nextLine();
	        
	     System.out.print("Ingresa el dia: ");
	        int dia = scanner.nextInt();   
	     
	     System.out.print("Ingresa el mes: ");
	        int mes = scanner.nextInt();
	    
	     System.out.print("Ingresa el año: ");
	        int año = scanner.nextInt();
	     
	     System.out.print("Ingresa la altura en cm: ");
	       double altura = scanner.nextDouble();
	        
	     System.out.print("Ingresar peso en kg: ");
	       double peso = scanner.nextDouble();

	   Actividad3_17 prue = new Actividad3_17(nombre, apellido, sexo, dia, mes, año,peso,altura);

       System.out.println("--------------------------------------------");
       
       System.out.println("           Información de la persona ");
       System.out.println("Nombre completo:                       " + prue.obtenerNombre() + " " + prue.obtenerApellido());
       System.out.println("Sexo:                                  " + prue.obtenerSexo());
       System.out.println("Fecha de nacimiento:                   " + prue.obtenerDia() + " / " + prue.obtenerMes() + " / " + prue.obtenerAño());
       System.out.println("Edad:                                  " + prue.obtenerEdad() + " años");
       System.out.println("IMD:                                   " + prue.obtenerIDM());
       System.out.println("Frecuencia cardiaca máxima:            " + prue.obtenerFcm() + " latidos por minuto");
       System.out.println("Rango de frecuencia cardiaca esperada: " + prue.obtenerFcd1() + " - " + prue.obtenerFcd2() );
       

       scanner.close();
	    
		   System.out.println("----------------------------");
		   System.out.println("     VALORES DE DMI");
		   System.out.println("Bajo peso: menos de 18.5");
		   System.out.println("Normal: entre 18.5 y 24.9");
		   System.out.println("Sobrepeso: entre 25 y 29.9");
		   System.out.println("Obeso: 30 o mas");
		   System.out.println("----------------------------");
		    
			}
}


