// Unidad 1 y 2
// Actividad 2.33
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad_1y2;

import java.util.Scanner;

public class Actividad2_33 {

	public static void main(String[] args) {
    try (Scanner entrada = new Scanner (System.in)) {
		double a;
		double b;

		System.out.print("introducir peso en Kg: ");
		a = entrada.nextDouble();
		
		System.out.print("introducir altura en m: ");
		b = entrada.nextDouble();
		
   System.out.println("----------------------------");
   System.out.println("     VALORES DE BMI");
   System.out.println("Bajo peso: menos de 18.5");
   System.out.println("Normal: entre 18.5 y 24.9");
   System.out.println("Sobrepeso: entre 25 y 29.9");
   System.out.println("Obeso: 30 o mas");
   System.out.println("----------------------------");
		
		double c = ( a )/(b * b);
		System.out.println("IDM: " + c);
		
		if( c < 18.5)
			System.out.println("Peso bajo");
		
		if( c > 18.5 )
		if( c < 24.9 )
			System.out.println("Normal");
		
		if( c > 25 )
		if( c < 29.9 )
			System.out.println("Sobrepeso");
		
		if( c > 30)
			System.out.println("Obesidad");
	}
	}

}
