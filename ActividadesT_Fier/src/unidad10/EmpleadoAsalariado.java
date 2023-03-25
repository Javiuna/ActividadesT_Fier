// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;


public class EmpleadoAsalariado extends Empleado
{
private double salarioSemanal;

//constructor
public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,String numeroSeguroSocial, double salarioSemanal,int dia,int mes,int año)
{
super(primerNombre, apellidoPaterno, numeroSeguroSocial,dia,mes,año);

if (salarioSemanal < 0.0)
throw new IllegalArgumentException(
"El salario semanal debe ser >= 0.0");

this.salarioSemanal = salarioSemanal;
}


public void establecerSalarioSemanal(double salarioSemanal)
{
if (salarioSemanal < 0.0)
throw new IllegalArgumentException(
"El salario semanal debe ser >= 0.0");

this.salarioSemanal = salarioSemanal;
}


public double obtenerSalarioSemanal()
{
return salarioSemanal;
}


@Override
public double ingresos()
{
return obtenerSalarioSemanal();
}


@Override
public String toString()
{
return String.format("empleado asalariado: %s%n%s: $%,.2f",
super.toString(), "salario semanal", obtenerSalarioSemanal());
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