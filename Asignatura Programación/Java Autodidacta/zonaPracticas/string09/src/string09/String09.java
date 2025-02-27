/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string09;

/**
 *
 * @author zerkje
 */
public class String09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] arr = new char[] {'1', '2', '3', '4'};
        String str = String.copyValueOf(arr, 1, 3);
        System.out.println("The book contains " + str + " pages");
    }
    
}
