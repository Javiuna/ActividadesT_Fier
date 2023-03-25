package unidad4;

import java.util.Scanner;

//UNIDAD 4
	//EJERCICIO 4.19
	//INTEGRANTES DEL EQUIPO:
	//Conde Orozco María Fernanda
	//De la Cruz Luna Javier
	//Tobon Cahum Marco David

public class Ejercicio4_19 {

	Scanner entrada = new Scanner(System.in);
	private int numeroEmpleado;
	private int numero;
	private double salarioEmpleado = 0;

	public void Recibe()
	{ 
	System.out.println("\nIntroduzca el número/código numérico del empleado o -1 para terminar:");
	numeroEmpleado = entrada.nextInt();

	while (-1 != numeroEmpleado)
	{ // Abre while

	System.out.printf("\nIntroduzca que artículo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
	numero = entrada.nextInt();

	while ( -1 != numero)
	{ // Abre while anidado

	if ( 1 == numero )
	salarioEmpleado += 239.99;
	if ( 2 == numero)
	salarioEmpleado += 129.75;
	if ( 3 == numero)
	salarioEmpleado += 99.95;
	if ( 4 == numero)
	salarioEmpleado += 350.89;

	System.out.printf("\nIntroduzca que artículo ha vendido el empleado %d (1, 2, 3, 4 ) o -1 para terminar: ", numeroEmpleado);
	numero = entrada.nextInt();
	} // Cierra while anidado

	System.out.printf("\nEl salario total del empleado %d es %.2f\n", numeroEmpleado, 200 + Retorna(salarioEmpleado));

	System.out.println("\nIntroduzca el número/código numérico del siguiente empleado o -1 para terminar: ");
	numeroEmpleado = entrada.nextInt();
	} // Cierra while
	}

	public double Retorna( double salario)
	{ 
	return salario*9/100;
	} // 
	} // 
