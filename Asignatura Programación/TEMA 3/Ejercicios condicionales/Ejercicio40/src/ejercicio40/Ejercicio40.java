/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio40;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String informe = "";
        double imc, peso, estatura;
        
        System.out.print("Introduce el peso en Kg: ");
        peso = sc.nextDouble();
        System.out.print("Introduce la altura en metros: ");
        estatura = sc.nextDouble();
        
        imc = peso / (estatura *  estatura);
        
        if (imc < 18.5) {
            informe = "Desnutricion";
        } else if (imc >= 18.5 && imc < 24.9) {
            informe = "Rango Normal";
        } else if (imc >= 25 && imc < 29.9) {
            informe = "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            informe = "Obesidad grado I";
        } else if (imc >= 35 && imc < 39.9) {
            informe = "Obesidad grado II";
        } else if (imc >= 40) {
            informe = "Obesidad grado III";
        }
        System.out.println("IMC: " + imc);
        System.out.println(informe);
        
    }
    
}
