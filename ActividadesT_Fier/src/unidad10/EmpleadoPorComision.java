// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;


public class EmpleadoPorComision extends Empleado
{
private double ventasBrutas; 
private double tarifaComision; 

//constructor
public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double ventas, double tarifaComision,int dia,int mes,int año)
{
super(primerNombre, apellidoPaterno, numeroSeguroSocial,dia,mes,año);

if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
throw new IllegalArgumentException(
"La tarifa de comision debe ser > 0.0 y < 1.0");

if (ventasBrutas < 0.0)
throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

this.ventasBrutas = ventasBrutas;
this.tarifaComision = tarifaComision;
}


public void establecerVentasBrutas(double ventasBrutas)
{
if (ventasBrutas < 0.0)
throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

this.ventasBrutas = ventasBrutas;
}


public double obtenerVentasBrutas()
{
return ventasBrutas;
}


public void establecerTarifaComision(double tarifaComision)
{
if (tarifaComision <= 0.0 || tarifaComision >= 1.0) // valida
throw new IllegalArgumentException(
"La tarifa de comision debe ser > 0.0 y < 1.0");

this.tarifaComision = tarifaComision;
}


public double obtenerTarifaComision()
{
return tarifaComision;
}


@Override
public double ingresos()
{
return obtenerTarifaComision() * obtenerVentasBrutas();
}


@Override
public String toString()
{
return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
"empleado por comision", super.toString(),
"ventas brutas", obtenerVentasBrutas(),
"tarifa de comision", obtenerTarifaComision());
}


@Override
protected double obtenerMontoPago() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
protected Object getFechaNacimiento() {
	// TODO Auto-generated method stub
	return null;
}
} 