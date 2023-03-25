// Unidad 5
// Actividad 5.24
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad5;

import java.util.Scanner;

public class ejercicio5_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la altura del rombo (debe ser un número impar): ");
        int tamano = entrada.nextInt();

        // imprimir la mitad superior del rombo
        for (int i = 0; i < tamano/2 + 1; i++) {
            // imprimir espacios en blanco
            for (int j = tamano/2; j > i; j--) {
                System.out.print(" ");
            }
            // imprimir asteriscos
            for (int k = 0; k < i*2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // saltar de línea
        }

        // imprimir la mitad inferior del rombo
        for (int i = tamano/2 - 1; i >= 0; i--) {
            // imprimir espacios en blanco
            for (int j = tamano/2; j > i; j--) {
                System.out.print(" ");
            }
            // imprimir asteriscos
            for (int k = 0; k < i*2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // saltar de línea
        }
        entrada.close();
    }
}