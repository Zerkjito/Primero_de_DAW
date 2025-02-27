/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string01;

/**
 *
 * @author zerkje
 */
public class String01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "Java Exercises!";
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);
        System.out.println("Original string: " + str);
        System.out.println("The character at position 0 is " + (char) index1);
        System.out.println("The character at position 10 is " + (char) index2);
    }
    
}
