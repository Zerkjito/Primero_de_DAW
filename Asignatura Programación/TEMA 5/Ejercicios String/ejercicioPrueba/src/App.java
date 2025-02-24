public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String texto = "hola";
        StringBuilder sb = new StringBuilder(texto);
        System.out.println(texto);
        sb.append("*");
        sb.insert(0, "*");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());        
        
    }
}
