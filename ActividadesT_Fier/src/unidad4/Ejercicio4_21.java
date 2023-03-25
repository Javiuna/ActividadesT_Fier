package unidad4;

import java.util.Scanner;
public class Ejercicio4_21 {
	
	//UNIDAD 4 
		//EJERCICIO 4.21
		//INTEGRANTES DEL EQUIPO:
		//Conde Orozco María Fernanda
		//De la Cruz Luna Javier
		//Tobon Cahum Marco David
	
	Scanner entrada = new Scanner(System.in);

	private int numero;
	private int contador = 1;
	private int mayor;

	public void Contador()
	{ 


	System.out.printf("\nEste programa recibe 10 números e imprime cual de ellos es el mayor.\n");
	System.out.printf("\nIntroduzca un número %d: ", contador++);
	mayor = entrada.nextInt();

	while ( 10 >= contador)
	{ // Abre while

	System.out.printf("\nIntroduzca un número %d: ", contador++);
	numero = entrada.nextInt();

	if ( numero > mayor)
	mayor = numero;
	} // Cierra while

	System.out.printf("\nEl numero mayor es: %d\n\n", Retorna());
	} 

	public int Retorna()
	{ 
	return mayor;
	} 
}
