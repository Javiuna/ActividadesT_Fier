// Unidad 5
// Actividad 5.31
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package unidad5;

import java.util.Scanner;
public class ejercicio5_31 {

	public static void main(String[] args) {

		String[] preguntas = {
                "¿Qué es el principal causante del aumento del dióxido de carbono en la atmósfera?",
                "¿Qué es el principal gas de efecto invernadero responsable del calentamiento global?",
                "¿Qué consecuencias podría tener el calentamiento global en la vida marina?",
                "¿Qué medidas podríamos tomar para reducir las emisiones de gases de efecto invernadero?",
                "¿Cómo afectaría el calentamiento global a la distribución de las precipitaciones en la Tierra?"
        };
        String[][] opciones = {
                {"La actividad volcánica", "La respiración de los animales", "El deshielo de los glaciares", "Las emisiones de la quema de combustibles fósiles"},
                {"Dióxido de carbono (CO2)", "Nitrógeno", "Helio", "Metano"},
                {"Reducción de la acidificación de los océanos", "Aumento del número de especies marinas", "Extinción de especies marinas", " Reducción de la temperatura del agua"},
                {"Promover el uso del transporte público", "Implementar políticas para reducir la tala de bosques", " Desarrollar tecnologías más contaminantes", "Aumentar la producción industrial"},
                {"Aumento de las precipitaciones en todas las regiones", "Aumento de las precipitaciones en algunas regiones y reducción en otras", " Sin cambios en la distribución de las precipitaciones", "Variaciones impredecibles en la distribución de las precipitaciones"}
        };
        int[] respuestas = {4, 1, 3, 1, 2};

        int correctas = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println((i + 1) + ". " + preguntas[i]);
            for (int j = 0; j < opciones[i].length; j++) {
	                System.out.println((j + 1) + ") " + opciones[i][j]);
            }
            int respuesta = entrada.nextInt();
            if (respuesta == respuestas[i]) {
                correctas++;
            }
        }

        System.out.println("Ha respondido correctamente a " + correctas + " de las 5 preguntas.");
        if (correctas == 5) {
            System.out.println("Excelente");
        } else if (correctas == 4) {
            System.out.println("Muy bien");
        } else {
            System.out.println("Es tiempo de aprender más sobre el calentamiento global.");
            System.out.println("-------------------------------------------------");
            System.out.println("Sitios web para aprender:");
            System.out.println("https://climate.nasa.gov/espanol/");
            System.out.println("https://www.ipcc.ch/report/ar6/wg1/");
            System.out.println("https://www.nationalgeographic.es/medio-ambiente/cambio-climatico");
        }
		
		entrada.close();
	}

}