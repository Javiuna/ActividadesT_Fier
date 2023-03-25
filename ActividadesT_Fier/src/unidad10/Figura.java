// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;
abstract class Figura {
    public abstract String obtenerDescripcion();
}

class FiguraBidimensional extends Figura {
    private double base;
    private double altura;

    public FiguraBidimensional(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double obtenerArea() {
        return base * altura;
    }

    public String obtenerDescripcion() {
        return "Figura bidimensional con base " + base + " y altura " + altura;
    }
}

class FiguraTridimensional extends Figura {
    private double radio;
    private double altura;

    public FiguraTridimensional(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double obtenerArea() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double obtenerVolumen() {
        return Math.PI * radio * radio * altura;
    }

    public String obtenerDescripcion() {
        return "Figura tridimensional con radio " + radio + " y altura " + altura;
    }
}

