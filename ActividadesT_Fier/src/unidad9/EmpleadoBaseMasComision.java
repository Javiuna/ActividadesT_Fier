// Unidad 9
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;

public class EmpleadoBaseMasComision extends Empleado{
	
	    private double ventasBrutas;
	    private double tarifaComision;
	    private double salarioBase;

	    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
	        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

	        if (ventasBrutas < 0.0) {
	            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
	        }

	        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
	            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
	        }
	        if (salarioBase <= 0.0) {
	            throw new IllegalArgumentException("El salario base debe ser > 0.0");
	        }
	        this.ventasBrutas = ventasBrutas;
	        this.tarifaComision = tarifaComision;
	        this.salarioBase = salarioBase;
	    }
	    public void establecerSalarioBase(double salarioBase) {
	        if (salarioBase < 0.0) {
	        	throw new IllegalArgumentException("El salario base debe ser > 0.0");
	        }

	        this.salarioBase = salarioBase;
	    }

	    public double obtenerSalarioBase() {
	        return salarioBase;
	    }


	    public void establecerVentasBrutas(double ventasBrutas) {
	        if (ventasBrutas < 0.0) {
	            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
	        }

	        this.ventasBrutas = ventasBrutas;
	    }

	    public double obtenerVentasBrutas() {
	        return ventasBrutas;
	    }

	    public void establecerTarifaComision(double tarifaComision) {
	        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
	            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
	        }

	        this.tarifaComision = tarifaComision;
	    }

	    public double obtenerTarifaComision() {
	        return tarifaComision;
	    }

	    public double ingresos() {
	        return obtenerTarifaComision() * obtenerVentasBrutas() + obtenerSalarioBase();
	    }

	    @Override
	    public String toString() {
	        return String.format("empleado por comisión: %s%nVentas brutas: $%,.2f; \nTarifa de comisión: %.2f \nSalario base: %.2f",
	                super.toString(), obtenerVentasBrutas(), obtenerTarifaComision(), obtenerSalarioBase());
	    }
	}