package carrerapopular;

public class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nEdad: ");
        sb.append(edad);
        return sb.toString();
    }

}
