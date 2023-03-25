// Unidad 9
// Actividad 9_10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad9;

public class Actividad9_10 {
//	En las figuras 9.10 y 9.11, los métodos ingresos y
//	toString llaman a varios métodos obtener dentro de la misma clase. Explique los beneficios de llamar a estos métodos
//	obtener dentro de las clases.
	
	
//	La razón principal para llamar a los métodos obtener dentro de las clases es encapsular las variables de instancia y proporcionar 
//	acceso controlado a ellas. Las variables de instancia se definen como privadas para que no se puedan modificar directamente desde 
//	fuera de la clase. Para acceder a estas variables desde fuera de la clase, se deben proporcionar métodos públicos (getters y setters) 
//	que permitan la lectura y escritura de estas variables.
//
//	Al llamar a los métodos obtener dentro de la clase, se puede acceder a las variables de instancia de forma controlada y segura, ya 
//	que estos métodos solo devuelven el valor de la variable de instancia y no permiten su modificación. Además, si se necesita modificar 
//	la implementación de estos métodos en el futuro, solo se necesitaría modificarlos en un solo lugar en la clase.
//
//	En el caso específico de la clase EmpleadoPorComision, los métodos obtener son utilizados por los métodos ingresos() y toString() para 
//	obtener el valor de las variables de instancia y realizar los cálculos necesarios. De esta manera, se asegura que solo se utilice el valor 
//	actual de las variables y no un valor antiguo o incorrecto.
}
