// Unidad 3
// Actividad_Prueba 3.15
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;
import java.util.Scanner;

public class PruebaA3_15 {

	 public static void main(String[] args)
	 {
		 Actividad3_15 cuenta1 = new Actividad3_15("Jane Green", 50.00);
		 Actividad3_15 cuenta2 = new Actividad3_15("John Blue", -7.53);

	     cuenta1.mostrarCuenta();
	     {
	    	 System.out.println();
	     
	     }  
	     
	     cuenta2.mostrarCuenta();
	     {
	    	 System.out.println();
	     
	     }
	 // muestra el saldo inicial de cada objeto
	 //System.out.printf("Saldo de %s: $%.2f%n",
	// cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
	 //System.out.printf("Saldo de %s: $%.2f%n%n",
	 //cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
System.out.println("-------------------");
	 try (// crea un objeto Scanner para obtener la entrada de la ventana de comandos
	Scanner entrada = new Scanner(System.in)) {
		System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
		 double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		 System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
		 montoDeposito);
		 cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1
		 

		 cuenta1.mostrarCuenta();
		 {
			 System.out.println();
		 
		 }  
		 
		 cuenta2.mostrarCuenta();
		 {
			 System.out.println();
		 
		 }
		 // muestra los saldos
		// System.out.printf("Saldo de %s: $%.2f%n",
		// cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
		 //System.out.printf("Saldo de %s: $%.2f%n%n",
		 //cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
System.out.println("---------------------");
		 System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
		 montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		 System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
		 montoDeposito);
		 cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2
	}

	 

	 // muestra los saldos
	 //System.out.printf("Saldo de %s: $%.2f%n",
	 //cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
	// System.out.printf("Saldo de %s: $%.2f%n%n",
	 //cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

     cuenta1.mostrarCuenta();
     {
    	 System.out.println();
     
     }  
     
     cuenta2.mostrarCuenta();
     {
    	 System.out.println();
     
     }
	 
	 } // fin de main
 } // fin de la clase PruebaCuenta
