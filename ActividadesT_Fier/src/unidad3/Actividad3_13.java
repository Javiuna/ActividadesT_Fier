// Unidad 3
// Actividad 3.13
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

// Clase Empleado
public class Actividad3_13 {
	private String nombre;
	private String apellido;
	private double salario=0;
	public double porcentaje=0;
	
	public Actividad3_13 (String nombre, String apellido, double salario)
	{
		this.nombre = nombre;
		
		this.apellido = apellido;
		
		//this.salario = salario;
		
		if(salario < 0)
			this.salario=0;
	}
	
	public void asignarNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public String obtenerNombre() {
		return this.nombre;
	}
    
    public void asignarApellido(String apellido) {
		this.apellido = apellido;
	}
	
    public String obtenerApellido() {
		return this.apellido;
	}
    
    public void asignarSalario(double salario) {
		this.salario = salario;
    }
    public double obtenerSalario() {
	return this.salario;
	}
   
   public double obtenerPorcentaje() {
    	return this.salario*.10;
    	
    }  
   public double obtenerAnualidad() {
   	return this.salario*12;
   }
}

