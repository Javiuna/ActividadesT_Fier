// Unidad 9
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;

public class EmpleadoporHoras extends Empleado{
	    private int horas;
	    private double sueldo;

	    public EmpleadoporHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, int horas, double sueldo) {
	        super(primerNombre, apellidoPaterno, numeroSeguroSocial);



	        if (horas <= 0 || horas >= 168) {
	            throw new IllegalArgumentException("Las horas de trabajo deben ser > 0 y < 168");
	        }
	        if (sueldo <= 0.0) {
	            throw new IllegalArgumentException("El sueldo debe ser > 0.0");
	        }
	        this.horas = horas;
	        this.sueldo = sueldo;
	    }
	    public void establecerSueldopH(double sueldo) {
	        if (sueldo < 0.0) {
	        	throw new IllegalArgumentException("El salario base debe ser > 0.0");
	        }

	        this.sueldo = sueldo;
	    }

	    public double obtenerSueldopH() {
	        return sueldo;
	    }


	    public void establecerHoras(int horas) {
	        if (horas < 0.0) {
	            throw new IllegalArgumentException("Las horaas deben ser > 0.0");
	        }

	        this.horas = horas;
	    }

	    public double obtenerHoras() {
	        return horas;
	    }

	    public double sueldo() {
	        return obtenerSueldopH() * obtenerHoras();
	    }

	    @Override
	    public String toString() {
	        return String.format("Empleado por hora: %s%nSueldo por hora: $%,.2f \nHoras trabajadas: %,.1f",
	                super.toString(), obtenerSueldopH(), obtenerHoras());
	    }
	}