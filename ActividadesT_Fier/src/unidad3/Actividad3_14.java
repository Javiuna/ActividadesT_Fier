// Unidad 3
// Actividad 3.14
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

public class Actividad3_14 {
	private int dia = 0;
	private int mes = 0;
	private int año =0;
	//private int febrero =0;


public Actividad3_14 (int dia, int mes, int año) {
	if(dia > 0 && dia <= 31) {
		this.dia = dia;
	}
	else
	{
	System.out.println("El dia es inccorecto");	
	}
	
	if(mes > 0 && mes <= 12){
		this.mes = mes;
	}
	else
	{
	System.out.println("El mes es inccorecto");	
	}
	if(año > 2000 && año <= 2023){
		this.año = año;
	}
	else
	{
	System.out.println("El año es inccorecto");	
	}
}	
     public void asignarDia(int dia) {
	  this.dia = dia;
}

     public int obtenerDia() {
	     return this.dia;
}
     public void asignarMes(int mes) {
 		this.mes = mes;
 	}
 	
     public int obtenerMes() {
 		return this.mes;
 	}
     public void asignarAño(int año) {
  		this.año = año;
  	}
  	
      public int obtenerAño() {
  		return this.año;
      }
    
      public void mostrarFecha()
      {
          System.out.print( "\nFecha seleccionada: " );
          System.out.printf( "\n %d / %d / %d " , obtenerDia() , obtenerMes() , obtenerAño() );
      } 
  }

