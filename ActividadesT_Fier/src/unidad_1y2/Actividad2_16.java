// Unidad 1 y 2
// Actividad 2.16
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 

package unidad_1y2;

import java.util.Scanner;

public class Actividad2_16 {
	public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)) {
		int a;
		int b;
		
		System.out.print("Introducir numero: ");
		a = entrada.nextInt();
		System.out.print("Introducir numero: ");
		b = entrada.nextInt();
		
		if( b > a )
			System.out.print( b + " Es mas grande");
		
		if( a > b )
			   System.out.print( a + " Es mas grande "); 
		
		if( a == b )
		   System.out.println("Son iguales");
	}
	

	}
}
