// Unidad 1 y 2
// Actividad 2.17
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 

package unidad_1y2;

import java.util.Scanner;

public class Actividad2_17 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int a;
			int b;
			int c;
			
			System.out.print("Introduzca un numero: ");
			a = entrada.nextInt();
			
			System.out.print("Introduzca un numero: ");
			b = entrada.nextInt();
			
			System.out.print("Introduzca un numero: ");
			c = entrada.nextInt();
			
			int suma = a + b + c;
			System.out.println("Suma: " + suma);
			
			int promedio = (a + b + c)/3;
			System.out.println("Promedio: " + promedio);
			
			int producto = a * b * c;
			System.out.println("Producto: " + producto);
			
			if (a > b && a > c)
			    System.out.println(a + " es el mayor de los enteros ");

			if (b > a && b > c)
				System.out.println(b + " es el mayor de los enteros ");
			if (c > a && c > b)
				System.out.println(c + " es el mayor de los enteros ");

			if (a < b && a < c)
				System.out.println( a +" es el menor de los enteros ");
			if (b < a && b < c)
				System.out.println( b +" es el menor de los enteros ");
			if (c < a && c < b)
				System.out.println( c +" es el menor de los enteros ");
		}

}
}
