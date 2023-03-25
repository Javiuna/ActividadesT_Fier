// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
private double salarioBase; // salario base por semana

public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase,int dia,int mes,int año)
{
super(primerNombre, apellidoPaterno, numeroSeguroSocial,ventasBrutas, tarifaComision,dia,mes,año);

if (salarioBase < 0.0) 
throw new IllegalArgumentException("El salario base debe ser >= 0.0");

this.salarioBase = salarioBase;
}


public void establecerSalarioBase(double salarioBase)
{
if (salarioBase < 0.0) 
throw new IllegalArgumentException("El salario base debe ser >= 0.0");

this.salarioBase = salarioBase;
}


public double obtenerSalarioBase()
{
return salarioBase;
}


@Override
public double ingresos()
{
return obtenerSalarioBase() + super.ingresos();
}


@Override
public String toString()
{
return String.format("%s %s; %s: $%,.2f",
"con salario base", super.toString(),
"salario base", obtenerSalarioBase());
}
}