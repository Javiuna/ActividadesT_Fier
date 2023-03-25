// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

public abstract class Empleado 
{
private final String primerNombre;
private final String apellidoPaterno;
private final String numeroSeguroSocial;
private int mes;
private int dia; 
private int año;


public Empleado(String primerNombre, String apellidoPaterno,String numeroSeguroSocial,int dia,int mes,int año){

this.primerNombre = primerNombre;
this.apellidoPaterno = apellidoPaterno;
this.numeroSeguroSocial = numeroSeguroSocial;
this.dia=dia;
this.mes=mes;
this.año=año;
}




public int getMes() {
	return mes;
}




public int getDia() {
	return dia;
}




public int getAño() {
	return año;
}




public String obtenerPrimerNombre()
{
return primerNombre;
}

public String obtenerApellidoPaterno()
{
return apellidoPaterno;
}


public String obtenerNumeroSeguroSocial()
{
return numeroSeguroSocial;
}


@Override
public String toString() {
    return String.format("%s %s%nNúmero de seguro social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(),getDia(),getMes(),getAño());
}

public abstract double ingresos();




protected abstract double obtenerMontoPago();




protected abstract Object getFechaNacimiento(); 
} 