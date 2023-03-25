// Unidad 3
// Actividad 3.17
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

public class Actividad3_17 {
	private String nombre; 
	private String apellido;
	private String sexo;
	private int dia;
	private int mes;
	private int año;
	private int edad;
	private int fcma;
	private int fcd1;
	private int fcd2;
	private double altura;
	private double peso;

	
	
	
	public Actividad3_17 (String nombre, String apellido, String sexo, int dia, int mes, int año,double peso,double altura)
	{
		this.nombre = nombre;
		this.apellido  = apellido;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		
		if(dia > 0 && dia <= 31) {
			this.dia = dia;
		}
		else
		{
			System.out.println("Dia inccoreecto: ");
		}
		
		if(mes > 0 && mes <= 12) {
			this.mes = mes;
		}
		else
		{
			System.out.println("Mes inccoreecto: ");
		}
		
		if(año > 1923 && mes <= 2023) {
			this.año = año;
		}
		else
		{
			System.out.println("Año inccoreecto: ");
		}
		
	}
    
	public void asignarNombre(String nombre) {
	   	  this.nombre = nombre;
	}
	public String obtenerNombre() {
		return this.nombre;
	}
	
	public void asignarSexo(String sexo) {
	   	  this.sexo = sexo;
	}
   
	public String obtenerSexo() {
		return this.sexo;
	}
	
	public void asignarApellido(String apellido) {
	   	  this.apellido = apellido;
	}
    public String obtenerApellido() {
		return this.apellido;
	}
    
    public void asignarAltura(double altura) {
	   	  this.altura = altura;
	}
    public double obtenerAltura() {
		return this.altura;
	}
    public void asignarPeso(double peso) {
	   	  this.peso = peso;
	}
    public double obtenerPeso() {
		return this.peso;
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
             System.out.print( "\nFecha de nacimiento: " );
             System.out.printf( "\n %d / %d / %d " , obtenerDia() , obtenerMes() , obtenerAño() );
         } 
        
     public void asignarEdad(int edad) {
    		this.edad = edad;
}
     public int obtenerEdad() {
    	edad = 2023- año;
    	 return this.edad;
    	}    
    
     public void asignarFcm (int fcma) {
    		this.fcma = fcma;
}
     public int obtenerFcm() {
    	 fcma = 220-edad;
    	return this.fcma;
    	}   
    
     public int obtenerFcd1() {
    	fcd1 = (fcma * 50)/100; 
    	
    	return fcd1;
    	}  

     public int obtenerFcd2() {
    	 fcd2 = (fcma * 85)/100;
    	return fcd2;
    	}   
    
     public double obtenerIDM() {
    	 double IMD = (( peso )/((altura/100) * (altura/100)));

 	    
 	    if( IMD < 18.5)
 	    	System.out.println("Peso bajo");
 	    
 	    if( IMD > 18.5 )
 	    if( IMD < 24.9 )
 	    	System.out.println("Normal");
 	    
 	    if( IMD > 25 )
 	    if( IMD < 29.9 )
 	    	System.out.println("Sobrepeso");
 	    
 	    if( IMD > 30)
 	    	System.out.println("Obesidad");
 	    return IMD;
     }
     
}

    
