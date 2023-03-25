// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

import java.util.ArrayList;

public class PruebaImpactoEcologico {
	    public static void main(String[] args) {
	        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
	        objetos.add(new Edificio(10, 500.0));
	        objetos.add(new Auto(25.0));
	        objetos.add(new Bicicleta(true));
	        
	        for (ImpactoEcologico objeto : objetos) {
	            String nombreDeClase = objeto.getClass().getSimpleName();
	            double impactoEcologico = objeto.obtenerImpactoEcologico();
	            System.out.println(nombreDeClase + " tiene un impacto ecológico de " + impactoEcologico);
	        }
	    }
	}