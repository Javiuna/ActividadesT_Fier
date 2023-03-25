// Unidad 7
// Actividad 7.36
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad7;

import java.util.Scanner;
public class Ejercicio7_36 {

	    // Constantes de operaciones de LMS
	    public static final int READ = 10;
	    public static final int WRITE = 11;
	    public static final int LOAD = 20;
	    public static final int STORE = 21;
	    public static final int ADD = 30;
	    public static final int SUBTRACT = 31;
	    public static final int DIVIDE = 32;
	    public static final int MULTIPLY = 33;
	    public static final int BRANCH = 40;
	    public static final int BRANCHNEG = 41;
	    public static final int BRANCHZERO = 42;
	    public static final int HALT = 43;

	    // Memoria y registros
	    private int[] memory = new int[100];
	    private int accumulator;
	    private int instructionCounter;
	    private int instructionRegister;

	    // Entrada / salida
	    private Scanner scanner = new Scanner(System.in);

	    // Ejecutar un programa
	    public void executeProgram() {
	        // Ciclo principal de ejecución
	        while (instructionCounter < memory.length) {
	            // Buscar la instrucción actual
	            instructionRegister = memory[instructionCounter];
	            int operationCode = instructionRegister / 100;
	            int operand = instructionRegister % 100;

	            // Ejecutar la instrucción
	            switch (operationCode) {
	                case READ:
	                    System.out.print("Ingrese un número: ");
	                    int input = scanner.nextInt();
	                    memory[operand] = input;
	                    instructionCounter++;
	                    break;
	                case WRITE:
	                    System.out.println(memory[operand]);
	                    instructionCounter++;
	                    break;
	                case LOAD:
	                    accumulator = memory[operand];
	                    instructionCounter++;
	                    break;
	                case STORE:
	                    memory[operand] = accumulator;
	                    instructionCounter++;
	                    break;
	                case ADD:
	                    accumulator += memory[operand];
	                    instructionCounter++;
	                    break;
	                case SUBTRACT:
	                    accumulator -= memory[operand];
	                    instructionCounter++;
	                    break;
	                case DIVIDE:
	                    accumulator /= memory[operand];
	                    instructionCounter++;
	                    break;
	                case MULTIPLY:
	                    accumulator *= memory[operand];
	                    instructionCounter++;
	                    break;
	                case BRANCH:
	                    instructionCounter = operand;
	            }
	        }
	    }
}

