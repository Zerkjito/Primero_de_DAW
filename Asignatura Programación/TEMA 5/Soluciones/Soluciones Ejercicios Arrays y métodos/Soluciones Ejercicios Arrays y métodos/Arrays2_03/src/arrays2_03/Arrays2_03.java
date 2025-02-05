/*
 * Arrays2_03 Dado un número entero positivo de 6 cifras, escribe un programa 
 * que compruebe si el número es capicúa utilizando un array de 6 componentes. 
 * Utiliza un método para pasar las cifras del número al array y otro para 
 * calcular si es o no capicúa.
 */
package arrays2_03;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Arrays2_03 {

    public static void main(String[] args) {
        int[] A = new int[6];
        int N;
        N = leerNumero6(); //método para leer un número de 6 cifras
        pasarNumeroArray(A, N); //método para pasar cada cifra del número al array
        if (esCapicua(A)) { //comprobar si es o no capicua
            System.out.println("Capicua");
        } else {
            System.out.println("No es capicua");
        }
    }

    //método que lee por teclado y devuelve yn número de 6 cifras
    public static int leerNumero6() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número entero de 6 cifras: ");
            n = sc.nextInt();
        } while (n < 100000 || n > 999999); //mientras no tenga 6 cifras
        return n;
    }

    //Método que recibe un número entero y un array de enteros.
    //El método pasa las cifras del número al array.
    public static void pasarNumeroArray(int[] v, int n) {
        int i = 0; //indice del array
        while (n != 0) {
            v[i] = n % 10; //se obtiene una cifra de n y se pasa al array en la posición i
            i++; //siguiente posición
            n = n / 10;  //se quita al número la cifra que hemos pasado al array
        }
    }

    //método que recibe un array de enteros y comprueba si los valores que contiene son capicua.
    //Se empieza comparando el primer elemento con el último
    //después el segundo con el penúltimo
    //etc.
    public static boolean esCapicua(int[] v) {
        int i = 0, j = v.length - 1;//i tiene la posición del primer elemento y j la del último
        while (v[i] == v[j] && i < j) { //mientras sean iguales y queden cifras por comparar
            i++;
            j--;
        }
        return i > j; //si i > j devuelve true, sino devuelve false
    }

}
