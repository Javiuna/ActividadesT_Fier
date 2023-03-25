// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;
public class Edificio implements ImpactoEcologico {
    private int numeroDePisos;
    private double consumoDeEnergia;

    public Edificio(int numeroDePisos, double consumoDeEnergia) {
        this.numeroDePisos = numeroDePisos;
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public double obtenerImpactoEcologico() {
        return numeroDePisos * consumoDeEnergia * 0.7; // Cálculo aproximado del impacto ecológico del carbono para un edificio
    }
}