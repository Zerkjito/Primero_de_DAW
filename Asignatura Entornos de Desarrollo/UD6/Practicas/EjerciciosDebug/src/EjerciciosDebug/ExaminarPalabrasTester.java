package EjerciciosDebug;

public class ExaminarPalabrasTester {

    public static void main(String[] args) {
        test("aardvark");  // esperado: a
        test("ccoo");      // esperado: c (no o)
        test("debug");     // esperado: 0 (no hay letras duplicadas)
        test("critico");   // esperado: 0 (la i no se repite)
    }

    public static void test(String s) {
        ExaminarPalabras ap = new ExaminarPalabras(s);
        char resultado = ap.primerCaracterRepetidoAdyacente();
        if (resultado == 0) {
            System.out.println("No hay caracteres repetidos.");
        } else {
            System.out.println("Primer caracter repetido = " + resultado);
        }
    }
}
