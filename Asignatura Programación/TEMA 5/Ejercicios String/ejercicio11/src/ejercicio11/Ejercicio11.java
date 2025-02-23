/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio11 {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String secuencia;
        System.out.print("Introduce la secuencia de numeros sin espacios: ");
        secuencia = sc.nextLine();
        if (!secuencia.matches("\\d+")) {
            throw new IllegalArgumentException("ERROR: La entrada debe ser un numero valido");
        }
        String secuenciaFormateada = formatearNumero(secuencia);
        System.out.println("Secuencia formateada: " + secuenciaFormateada);
    }
    
    public static String formatearNumero(String numero) {
        
        StringBuilder resultado = new StringBuilder();
        int contador = 0;
        for (int i = numero.length() - 1; i >= 0; i--) {
            resultado.append(numero.charAt(i));
            contador++;
            
            if (contador % 3 == 0 && i != 0) {
                resultado.append(".");
            }
        }
        resultado.reverse();
        return resultado.toString();
    }
    
}
