package unidad4;

import java.util.Scanner;
public class Ejercicio4_20 {

	//UNIDAD 4 
		//EJERCICIO 4.20
		//INTEGRANTES DEL EQUIPO:
		//Conde Orozco María Fernanda
		//De la Cruz Luna Javier
		//Tobon Cahum Marco David
	
	Scanner entrada = new Scanner(System.in);

	public void Salario()
	{
	int numeroEmpleado = 1;
	int horas = 0;
	double tarifa_hora = 0;
	double sueldo_bruto = 0;

	while ( 3 >= numeroEmpleado)
	{ // Abre while
	System.out.printf("\nIntroduzca el numero de horas que trabajo el empleado %d: ", numeroEmpleado);

	horas = entrada.nextInt();

	System.out.printf("\nIntroduzca la tarifa por hora del empleado %d: ", numeroEmpleado);
	tarifa_hora = entrada.nextDouble();

	if ( 40 >= horas)
	sueldo_bruto = horas*tarifa_hora;
	else
	sueldo_bruto = 40*tarifa_hora + (horas - 40)*(tarifa_hora + tarifa_hora/2);

	System.out.printf("\nEl sueldo bruto del empleado número %d es %.2f\n", numeroEmpleado++, sueldo_bruto);
	} // Cierra while


	} 

	} 
