package unidad4;
import java.util.Scanner;

//UNIDAD 4 
//EJERCICIO 4.18
//INTEGRANTES DEL EQUIPO:
//Conde Orozco María Fernanda
//De la Cruz Luna Javier
//Tobon Cahum Marco David

public class Prueba4_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 System.out.print("Ingresa el Numero de Cuenta: ");
		 int numC = scanner.nextInt();
	        
		 System.out.print("Ingresa el saldo al inicio del mes: ");
		 double saldoIM = scanner.nextDouble();
	        
	     System.out.print("Ingresa el total de todos los artículos cargados por el cliente en el mes: ");
	     double totalACM = scanner.nextDouble();
	        
		 System.out.print("Ingresa el total de todos los créditos aplicados a la cuenta del cliente en el mes: ");
		 double totalCM = scanner.nextDouble();
	        
	     System.out.print("Ingresa el límite de crédito permitido: ");
	     double limiteCP = scanner.nextDouble();   
	     
	     Ejercicio4_18 prue = new Ejercicio4_18 (numC, saldoIM, totalACM, totalCM, limiteCP);

	       System.out.println("--------------------------------------------");
	       
	       System.out.println("           Información de la persona ");
	       System.out.println("Numero de Cuenta:                      " + prue.obtenerNombreC());
	     //  System.out.println("Saldo al inicio del mes:               " + prue.obtenerSaldoIM());
	     // System.out.println("Artículos cargados por el cliente:     " + prue.obtenerTotalACM());
	     //System.out.println("Créditos aplicados a la cuenta:        " + prue.obtenerTotalCM());
	       System.out.println("El límite de crédito permitido:        " + prue.obtenerLimiteCP());
           System.out.println("Saldo Final:                           " + prue.obtenerSaldo());
           
           scanner.close();
	
	}
}