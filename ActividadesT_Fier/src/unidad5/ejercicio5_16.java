// Unidad 5
// Actividad 5.16
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad5;
import java.util.Scanner;

public class ejercicio5_16 {

public static void main( String args[])
{     
System.out.print("\nIntroduce cinco numeros entre el 1 y 30 por favor");
 

Scanner entrada = new Scanner(System.in);

int numero;
int contador = 1;

while ( contador <= 5 )
{         
System.out.printf("\nPor favor introduzca el numero %d:\n ", contador);
numero = entrada.nextInt();

if ((0 < numero) && ( 30 >= numero))
{    

for ( int i = 1; i <= numero; i++ )
System.out.print("*");

System.out.println();

contador++;

}
}
entrada.close();
}
}