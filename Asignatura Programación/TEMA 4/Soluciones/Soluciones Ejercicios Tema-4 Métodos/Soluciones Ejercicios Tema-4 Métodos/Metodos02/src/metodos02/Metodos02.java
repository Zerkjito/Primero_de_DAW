/*
 * 2. Escribe un método que reciba dos números enteros A y B. 
  El método debe calcular y devolver el producto de A * B sin utilizar 
  el operador *. El cálculo del producto se realizará mediante sumas.
  Por ejemplo, si el método recibe los valores A = 3 B = 4 
  debe calcular 3 * 4 realizando las sumas 3 + 3 + 3 + 3. 
  Para realizar el cálculo y obtener el resultado correcto debemos tener en 
  cuenta que A y B pueden ser positivos o negativos.  
 */
package metodos02;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Metodos02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Introduce x: ");
        x = sc.nextInt();
        System.out.print("Introduce y: ");
        y = sc.nextInt();
        System.out.println(x + " * " +  y + " = " + multiplicar(x, y));
    }

    
    //Método para realizar la multiplicación de dos números enteros mediante sumas
    public static int multiplicar(int A, int B) {
        int resultado = 0, auxA = A, auxB = B; //guardamos A y B en dos variables auxiliares
        
        //Comprobamos si A o B son negativos
        //Si alguno es negativo lo convertimos en positivo para realizar el cálculo
        //Un número negativo lo podemos convertir en positivo de varias formas, entre ellas:
        // -> Multiplicando el número por -1
        // -> Utilizando el método Math.abs que devuelve el valor absoluto de un número
        
        if(A < 0){ //Si A es negativo lo convertimos en positivo mediante Math.abs(). 
           A = Math.abs(A);   //También lo podemos convertir a positivo multiplicanco por -1 -> A = A * -1
        }                     
        if(B < 0){ //lo mismo para B
             B = Math.abs(B);
        }
        for (int i = 1; i <= B; i++) { //se realiza la suma de A tantas veces como indique B
            resultado = resultado + A; 
        }
        
        //el resultado que hemos obtenido en el for anterior es positivo. 
        //si A o B eran negativos (pero no ambos) el resultado debe ser negativo
        //para comprobarlo utilizamos los valores originales de A y B que tenemos guardados en las variables auxiliares
        if(auxA < 0 && auxB > 0 || auxA > 0 && auxB < 0){
            resultado = resultado * -1; //multiplicamos por -1 para que el resultado sea negativo
        }
        return resultado;
    }
}
