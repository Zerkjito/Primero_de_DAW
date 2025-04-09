package gestionactores;

public class Perro extends Animal {

    private RazaPerro raza;
    private int edad;

    public Perro() {
    }

    public Perro(RazaPerro raza, int edad, String identificador, String nombre) {
        super(identificador, nombre);
        this.raza = raza;
        this.edad = edad;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" Raza: ").append(raza);
        sb.append(" Edad: ").append(edad);
        return sb.toString();
    }

}
