/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zerkje
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "23-239 12-120:23=5203 28340:23\n238";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(cadena);
        ArrayList<String> numeros = new ArrayList<>();
        while (matcher.find()) {
            numeros.add(matcher.group());
        }
        System.out.println(cadena);
        System.out.println("Hay " + numeros.size() + " numeros");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i) + " Quedan " + (numeros.size() - i - 1));
        }
    }
    
}
