// Unidad 5
// Actividad 5.21
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad5;

public class ejercicio5_21 {
    private int Tamano;

    public ejercicio5_21(int tamano) {
        this.Tamano = tamano;
    }

    public void generarTernas() {
        System.out.print("\nEste programa prueba e imprime todas las ternas");
        System.out.printf(" pitagoricas para numeros no mayores que %d ", Tamano);
        System.out.print(" mediante la fuerza bruta.\n");

        for (int lado1 = 1; lado1 <= Tamano; lado1++) {
            for (int lado2 = lado1; lado2 <= Tamano; lado2++) {
                for (int hipotenusa = lado2; hipotenusa <= Tamano; hipotenusa++) {
                    if (lado1*lado1 + lado2*lado2 == hipotenusa*hipotenusa) {
                        System.out.println(lado1 + ", " + lado2 + ", " + hipotenusa);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
    	ejercicio5_21 t = new ejercicio5_21(500);
        t.generarTernas();
    }
}

