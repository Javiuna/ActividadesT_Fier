// Unidad 5
// Actividad 7.11
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad7;

public class Unidimensionales {

    public static void main(String[] args) {

    	// Arreglo de tipo entero
        int[] cuentas = new int[10]; 
        int[] bono = new int[15]; 
        int[] mejoresPuntuaciones = {10, 20, 30, 40, 50}; //Matriz para que salga en columnas

        // a) Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
        for(int i = 0; i < 10; i++) {
            cuentas[i] = 0;
        }

        // b) Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.
        for(int i = 0; i < 15; i++) {
            bono[i]++;
        }

        // c) Imprima los cinco valores del arreglo mejoresPuntuaciones 
        //de tipo entero en formato de columnas.
        
        for(int i = 0; i < 5; i++) {
            System.out.printf("%-5d", mejoresPuntuaciones[i]); // Imprime el valor en una columna de ancho 5
        }

    }

}

