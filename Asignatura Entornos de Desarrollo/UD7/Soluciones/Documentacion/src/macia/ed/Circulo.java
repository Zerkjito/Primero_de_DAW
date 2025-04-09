package macia.ed;

/**
 * <strong>Representa un circulo.</strong>
 * Esta clase representa un círculo en un plano bidimensional, con un centro
 * definido por las coordenadas (centroX, centroY) y un radio.
 *
 * <p>
 * Los atributos de esta clase son:</p>
 * <ul>
 * <li>{@code centroX}: La coordenada X del centro del círculo.</li>
 * <li>{@code centroY}: La coordenada Y del centro del círculo.</li>
 * <li>{@code radio}: El radio del círculo.</li>
 * <li>{@code color}: El color del círculo.</li>
 * </ul>
 *
 * <p>
 * El centro del círculo está ubicado en el punto ({@code centroX},
 * {@code centroY}) del plano. El radio define la distancia desde el centro
 * hasta cualquier punto de la circunferencia.</p>
 *
 * @author Macia
 * @version 1.0
 * @since 01.04.2022
 */
public class Circulo {

    /**
     * Coordenada X del centro del círculo. La coordenada X define la posición
     * horizontal del centro del círculo en el plano.
     */
    private double centroX;

    /**
     * Coordenada Y del centro del círculo. La coordenada Y define la posición
     * vertical del centro del círculo en el plano.
     */
    private double centroY;

    /**
     * Radio del círculo. El radio define la distancia desde el centro del
     * círculo hasta cualquier punto de su circunferencia.
     */
    private double radio;

    /**
     * Color del círculo. Color del círculo que estamos creando.
     */
    private Color color;

    /**
     * <strong>Constructor.</strong>
     *
     * @param cx centro: coordenada X.
     * @param cy centro: coordenada Y.
     * @param r radio.
     * @param c color del círculo.
     */
    public Circulo(double cx, double cy, double r, Color c) {
        centroX = cx;
        centroY = cy;
        radio = r;
        color = c;
    }

    /**
     * <strong>Recupera el valor de X.</strong>
     *
     * @return centroX: coordenada X.
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * <strong>Recupera el valor de Y.</strong>
     *
     * @return centroY: coordenada Y.
     */
    public double getCentroY() {
        return centroY;
    }

    /**
     * <strong>Recupera el valor del radio.</strong>
     *
     * @return radio: radio del circulo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * <strong>Calcula la longitud de la circunferencia.</strong>
     *
     * @return circunferencia.
     */
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    /**
     * <strong>Desplaza el círculo a otro lugar.</strong>
     *
     * @param deltaX movimiento en el eje X.
     * @param deltaY movimiento en el eje Y.
     */
    public void mueve(double deltaX, double deltaY) {
        centroX = centroX + deltaX;
        centroY = centroY + deltaY;
    }

    /**
     * <strong>Escala el círculo (cambia su radio).</strong>
     *
     * @param s factor de escala.
     */
    public void escala(double s) {
        radio = radio * s;
    }

    /**
     * <strong>Obtiene el color del círculo.</strong>
     *
     * @return El color del círculo.
     */
    public Color getColor() {
        return color;
    }

    /**
     * <strong>Establece el color del círculo.</strong>
     *
     * @param color El nuevo color del círculo.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * <strong>Establece el radio del círculo.</strong>
     *     
     * @param radio el nuevo radio del circulo.
     * @exception IllegalArgumentException si el radio es negativo.
     */
    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        this.radio = radio;
    }

}
