package ejercicio07;

import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        double[][] multi = crearMatriz();
        mostrarDatos(multi);
    }

    public static double[][] crearMatriz() {
        Random rnd = new Random();
        double[][] multi = new double[10][13]; // 10 almacenes y 12 meses + 1 columna para la media
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length - 1; j++) { // Llenar solo los primeros 12 meses
                multi[i][j] = rnd.nextDouble(1000, 50000 + 1);
            }
        }
        return multi;
    }

    public static void mostrarDatos(double[][] m) {
        // Nombres de los meses
        String[] meses = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"};
        
        // Encabezado de los meses
        System.out.print("\t");
        for (int j = 0; j < 12; j++) { // Imprimir los nombres de los meses (12 columnas)
            System.out.printf("%-10s", meses[j]); // Ajuste del ancho a 10 caracteres para los nombres de los meses
        }
        System.out.println("MEDIA");

        // Calcular la media anual y mostrar las ventas
        double mediaTotal = 0;
        for (int i = 0; i < m.length; i++) { // Para cada almacén
            double suma = 0;
            System.out.printf("Almacén %2d:\t", i + 1); // Mostrar el número de almacén

            // Mostrar ventas mensuales y calcular la suma
            for (int j = 0; j < m[i].length - 1; j++) { // Excluir la última columna de la media
                System.out.printf("%10.2f\t", m[i][j]); // Ancho de 10 caracteres para las ventas mensuales
                suma += m[i][j];
            }

            // Calcular la media anual
            m[i][m[i].length - 1] = suma / 12;
            System.out.printf("%10.2f", m[i][m[i].length - 1]); // Mostrar la media anual con formato adecuado

            // Verificar si la venta anual supera la media
            mediaTotal += m[i][m[i].length - 1];
            if (m[i][m[i].length - 1] > mediaTotal / (i + 1)) {
                System.out.print(" *"); // Indicar si supera la media
            }
            System.out.println();
        }

        // Calcular la media total de las medias anuales
        mediaTotal /= m.length; // Promediar las medias anuales
        System.out.printf("\nMedia total de ventas: %,.2f\n", mediaTotal);
    }
}
