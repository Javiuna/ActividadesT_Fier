// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

public class PruebaFiguras {

	    public static void main(String[] args) {
	        Figura[] figuras = new Figura[3];
	        figuras[0] = new FiguraBidimensional(5, 10);
	        figuras[1] = new FiguraTridimensional(3, 5);
	        figuras[2] = new FiguraTridimensional(2, 4);

	        for (Figura figura : figuras) {
	            System.out.println(figura.obtenerDescripcion());
	            if (figura instanceof FiguraBidimensional) {
	                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
	                System.out.println("Área: " + figuraBidimensional.obtenerArea());
	            } else if (figura instanceof FiguraTridimensional) {
	                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
	                System.out.println("Área superficial: " + figuraTridimensional.obtenerArea());
	                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
	            }
	            System.out.println();
	        }
	    }
	}
