/*
14. Escribe un método que reciba un número entero positivo N y otro número
    entero p y devuelva la cifra de N que se encuentra en la posición p. 
    En el método main se introducirá por teclado el valor del número y la 
    posición de la cifra que queremos obtener y se comprobarán que sean
    válidos. El valor de la posición debe ser un número entero positivo menor o
    igual que el número total de cifras que tenga el número del que queremos
    obtener la cifra. Si el valor de la posición no es correcto se vuelve 
    a pedir. Se considerará que la cifra de la derecha ocupa la posición 1.
    Aunque en el método main se compruebe que el valor del número y el de la
    posición sean valores correctos, dentro del método también se comprobará.
    En este caso si los valores que se reciben no son válidos 
    el método devolverá -1.
 */
package metodos14;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, posicion, cifra;
        boolean repetir;
        do {
            System.out.print("Introduce número entero positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        do {
            repetir = false;
            System.out.println("Introduce posición de la cifra a obtener (entero > 0)");
            System.out.println("La posición 1 corresponde a la cifra de la derecha del número");
            System.out.print("Posición: ");
            posicion = sc.nextInt();
            if (posicion < 1 || posicion > contarCifras(numero)) {
                System.out.println("Posición no válida");
                repetir = true;
            }
        } while (repetir);
        System.out.println("Cifra en la posición " + posicion + " -> " + cifraPosicion(numero, posicion));
    }

    //método que devuelve la cifra que se encuentra en una posición determinada p
    //Para obtener la cifra se divide el número entre una potencia de 10
    //de forma que la cifra que queremos obtener quede como primera cifra (cifra a la derecha)
    //por ejemplo si N = 528917 y p = 3 el método tiene que devolver -> 9
    //Hay que dividir N / 100 -> N / 10^2 -> En general habrá que dividir: N / 10^p-1
    //de forma que nos queda aux = 5289
    //ahora solo tenemos que hacer aux % 10 para obtener el 9 que es la cifra que buscamos
    //Si por ejemplo N = 528917 y p = 5 hay que devolver el 2
    //se divide N / 10000 que es lo que se realiza en la operación N / 10^p-1
    //aux = 52   y la operación aux % 10 obtiene el 2
    public static int cifraPosicion(int N, int p) {
        if(N <= 0 || p < 1 || p > contarCifras(N) ){
            return -1;
        }
        int aux = N / (int)Math.pow(10, p-1);
        return aux % 10;
    }

    //método que recibe un entero y devuelve el número de cifras que tiene
    public static int contarCifras(int n) {
        int contador = 0;
        while (n != 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }

}
