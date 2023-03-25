// Unidad 3
// Actividad_Prueba 3.13
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad3;

public class PruebaA3_13 {

	public static void main(String[] args) {
		Actividad3_13 emple = new Actividad3_13("Jorge", "Nitales", 20000);
		Actividad3_13 emple1 = new Actividad3_13("Benito", "Camela", 15000);
		
		System.out.println("     Empleado 1  ");
		System.out.println("Nombre:       " + emple.obtenerNombre());
		System.out.println("Apellido:     " + emple.obtenerApellido());
		System.out.println("Salario:      " + emple.obtenerSalario());
		System.out.println("Porcentaje:   " + emple.obtenerPorcentaje());	
		System.out.println("Anualidad  :  " + emple.obtenerAnualidad());	
		double a = emple.obtenerPorcentaje() + emple.obtenerAnualidad();
		System.out.println("An + Po:      " + a);
		
		System.out.println("------------------------");
		
		System.out.println("     Empleado 2  ");
		System.out.println("Nombre:       " + emple1.obtenerNombre());
		System.out.println("Apellido:     " + emple1.obtenerApellido());
		System.out.println("Salario:      " + emple1.obtenerSalario());
		System.out.println("Porcentaje:   " + emple1.obtenerPorcentaje());	
		System.out.println("Anualidad  :  " + emple1.obtenerAnualidad());	
		double b = emple1.obtenerPorcentaje() + emple1.obtenerAnualidad();
		System.out.println("An + Po:      " + b);
		
		
	}
}
