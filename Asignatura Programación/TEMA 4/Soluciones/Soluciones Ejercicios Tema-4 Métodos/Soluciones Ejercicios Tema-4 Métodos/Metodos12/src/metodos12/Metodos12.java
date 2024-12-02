/*
 12. Escribe un método que reciba un número entero positivo y devuelva true 
 si la primera cifra del número es igual a la última. El método devolverá false
 en caso contrario. Si el número tiene solo una cifra el método devolverá true.
 */
package metodos12;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce número >0: ");
            n = sc.nextInt();
            if(n <= 0){
                System.out.println("Valor no válido");
            }
        } while (n <= 0);
        if(primeraUltimaCifraIguales(n)){
            System.out.println("Primera y última cifra iguales");
        }else{
            System.out.println("Primera y última cifra distintas");
        }
       
    }
    
    //método que recibe un entero positivo y comprueba si la primera cifra y la última son iguales.
    public static boolean primeraUltimaCifraIguales(int numero){
        int cifras, primeraCifra, ultimaCifra;
        cifras = contarCifras(numero);
        ultimaCifra = numero % 10;
        primeraCifra = numero / (int)Math.pow(10, cifras-1);
        return primeraCifra == ultimaCifra;
        //La instrucción return devuelve el resultado de comprobar si primeraCifra y ultimaCifra son iguales
        // primeraCifra == ultimaCifra  dará como resultado true o false y eso es lo que se devuelve
        //es equivalente a escribir:
        //   if(primeraCifra == ultimaCifra){
        //      return true;
        //   }else{
        //      return false;
        //   }
        
    }
    
    //método que recibe un entero y devuelve el número de cifras que tiene
    public static int contarCifras(int n){
        int contador = 0;
        while(n != 0){
            n = n / 10;
            contador++;
        }
        return contador;
    }
    
}
