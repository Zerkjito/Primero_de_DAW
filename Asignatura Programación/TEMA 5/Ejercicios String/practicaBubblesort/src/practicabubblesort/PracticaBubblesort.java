/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicabubblesort;

/**
 *
 * @author Erick
 */
public class PracticaBubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 9, 15, 0, 4, -5};
        bubbleSort(nums);
        System.out.println("\nArreglo ordenado descendentemente:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    public static void bubbleSort(int[] a) {
        int n = a.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
}
