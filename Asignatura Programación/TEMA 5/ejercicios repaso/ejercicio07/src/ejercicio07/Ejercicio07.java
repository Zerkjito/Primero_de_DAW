/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zerkje
 */
public class Ejercicio07 {

    /**
     7. Escribe un método que reciba una matriz irregular de String y un carácter y devuelva un Arraylist con todas las
palabras de la matriz que contengan el carácter recibido excepto aquellas palabras que lo contengan en la primera
posición.
Por ejemplo, si el método recibe la matriz:
*       patata pimiento naranja
        ajo cebolla
        albahaca perejil zanahoria puerro aguacate
        Y recibe el carácter: 'a'
Devolverá el ArrayList: [patata, naranja, cebolla, zanahoria]
     */
    public static void main(String[] args) {
        String[][] matrIrregular = {
            {"patata", "pimiento" , "naranja"},
            {"ajo", "cebolla"},
            {"albahaca", "perejil", "zanahoria", "puerro", "aguacate"}
        };
        ArrayList<String> arrayList = matchedWords(matrIrregular, 'a');
        System.out.println("Array list ordenado: " + arrayList);
    }
    
    public static ArrayList<String> matchedWords(String[][] s, char caracter) {
        ArrayList<String> matchedWords = new ArrayList<String>();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                char c = s[i][j].charAt(0);
                if (c != caracter && s[i][j].contains(String.valueOf(caracter))) {
                    matchedWords.add(s[i][j]);
                }
            }
        }
        return matchedWords;
    }
}
