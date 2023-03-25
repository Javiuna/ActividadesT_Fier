// Unidad 10
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad10;

public class Bicicleta implements ImpactoEcologico {
    private boolean esElectrica;

    public Bicicleta(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public double obtenerImpactoEcologico() {
        return esElectrica ? 0.1 : 0; // Cálculo aproximado del impacto ecológico del carbono para una bicicleta eléctrica o no eléctrica
    }
}