// Unidad 5
// Actividad 7.17
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad7;

import java.util.Random;
public class TiroDeDados {

	    public static void main(String[] args) {

	    	//Objeto de la clase Random
	        Random random = new Random(); 
	        
	        //Arreglo para registrar el número de veces que aparece cada suma
	        int[] sumas = new int[11]; 
	        
	        // Tiro de los dados 36,000,000 veces
	        for (int i = 0; i < 36000000; i++) {
	            int dado1 = random.nextInt(6) + 1; // primer dado
	            int dado2 = random.nextInt(6) + 1; // segundo dado
	            int suma = dado1 + dado2; // suma
	            
	            // Registramos la suma en el arreglo de sumas
	            switch (suma) {
	            case 2:
	                    sumas[0]++;
	                    break;
	                case 3:
	                    sumas[1]++;
	                    break;
	                case 4:
	                    sumas[2]++;
	                    break;
	                case 5:
	                    sumas[3]++;
	                    break;
	                case 6:
	                    sumas[4]++;
	                    break;
	                case 7:
	                    sumas[5]++;
	                    break;
	                case 8:
	                    sumas[6]++;
	                    break;
	                case 9:
	                    sumas[7]++;
	                    break;
	                case 10:
	                    sumas[8]++;
	                    break;
	                case 11:
	                    sumas[9]++;
	                    break;
	                case 12:
	                    sumas[10]++;
	                    break;
	            }
	        }
	        
	        // Mostramos los resultados en una tabla
	        System.out.printf("%10s%15s%20s\n", "Suma", "Frecuencia", "Porcentaje");
	        for (int i = 0; i < sumas.length; i++) {
	            int suma = i + 2;
	            int frecuencia = sumas[i];
	            double porcentaje = (double) frecuencia / 36000000 * 100;
	            System.out.printf("%10d%15d%20.2f%%\n", suma, frecuencia, porcentaje);
	        }
	    }

	}