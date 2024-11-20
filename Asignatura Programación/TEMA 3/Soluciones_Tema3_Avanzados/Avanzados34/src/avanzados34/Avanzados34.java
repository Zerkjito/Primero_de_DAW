/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avanzados34;

/**
 *
 * @author enrique
 */
public class Avanzados34 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.print(i != 3 ? i : "E");
                            System.out.print(j != 3 ? j : "E");
                            System.out.print(k != 3 ? k : "E");
                            System.out.print(l != 3 ? l : "E");
                            System.out.println(m != 3 ? m : "E");
                        }
                    }
                }
            }
        }
    }

}
