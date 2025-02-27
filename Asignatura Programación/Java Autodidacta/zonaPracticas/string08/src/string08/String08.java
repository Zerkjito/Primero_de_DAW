/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string08;

/**
 *
 * @author zerkje
 */
public class String08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);
        System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));
        System.out.println("Comparing " + str2 + " and " + strbuf + ": " + str2.contentEquals(strbuf));
    }

}
