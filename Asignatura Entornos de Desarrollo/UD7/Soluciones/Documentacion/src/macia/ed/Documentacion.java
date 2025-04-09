package macia.ed;

/**
 * <strong>Clase principal que ejecuta el programa.</strong>
 * Esta clase representa el punto de entrada del programa y se utiliza para
 * ejecutar el código principal.
 *
 * <p>
 * En este ejemplo, se crea un objeto de tipo Circulo con coordenadas de centro
 * (10, 10) y radio 20. Luego, se imprime la coordenada X del centro del
 * círculo.</p>
 *
 * @author Macia
 * @version 1.0
 * @since 01.04.2022
 */
public class Documentacion {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     *
     * @param args Los argumentos de la línea de comandos. No se utilizan en
     * este ejemplo.
     */
    public static void main(String[] args) {

        // Crear un objeto de tipo Circulo con coordenadas de centro (10, 10) y radio 20
        Circulo c = new Circulo(10, 10, 20, Color.AZUL);

        // Imprimir la coordenada X del centro del círculo
        System.out.println("Centro del círculo es : " + c.getCentroX());
    }
}
