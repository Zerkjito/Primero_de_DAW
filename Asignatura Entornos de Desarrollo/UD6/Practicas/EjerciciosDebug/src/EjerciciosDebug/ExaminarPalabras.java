package EjerciciosDebug;

public class ExaminarPalabras {

    private final String palabra;

    public ExaminarPalabras(String palabra) {
        this.palabra = palabra;
    }

    /**
     * Obtiene el primer carácter repetido adyacente. Se considera <i>repetido adyacente</i>
     * si existen al menos dos ocurrencias del mismo carácter adyacentes. 
     * Por ejemplo, la "l" se repite adyacente en "paella", pero no la "a".
     *
     * @return El primer carácter repetido adyacente, si no, 0.
     */
    public char primerCaracterRepetidoAdyacente() {
        for (int i = 0; i < palabra.length() - 1; i++) {
            char ch = palabra.charAt(i);
            if (ch == palabra.charAt(i + 1)) {
                return ch;
            }
        }
        return 0;
    }    
}
