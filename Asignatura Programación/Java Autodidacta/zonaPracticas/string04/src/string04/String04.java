/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string04;

/**
 *
 * @author zerkje
 */
public class String04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "this is Exercise 1";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\""
                    + " is less than "
                    + "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\""
                    + " is equal to "
                    + "\"" + str2 + "\"");;
        } else {
            System.out.println("\"" + str1 + "\""
                    + " is greater than "
                    + "\"" + str2 + "\"");;
        }
    }

}
