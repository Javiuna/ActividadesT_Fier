// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

public class Auto implements ImpactoEcologico {
    private double kilometrosPorGalon;

    public Auto(double kilometrosPorGalon) {
        this.kilometrosPorGalon = kilometrosPorGalon;
    }

    public double obtenerImpactoEcologico() {
        return 19.4 / kilometrosPorGalon; // Cálculo aproximado del impacto ecológico del carbono para un automóvil
    }
}
