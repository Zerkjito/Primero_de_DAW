package gestionactores;

public class Profesional extends Actor {

    private int numeroDeRepresentaciones;

    public Profesional() {
    }

    public Profesional(String nif, String nombre, int edad, Genero genero, int numeroDeRepresentaciones) {
        super(nif, nombre, edad, genero);
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    public int getNumeroDeRepresentaciones() {
        return numeroDeRepresentaciones;
    }

    public void setNumeroDeRepresentaciones(int numeroDeRepresentaciones) {
        this.numeroDeRepresentaciones = numeroDeRepresentaciones;
    }

    @Override
    public double calcularSueldo() {
        return numeroDeRepresentaciones * Actor.getImporteFijo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor Amateur ");
        sb.append(super.toString());
        sb.append(" Representaciones: ");
        sb.append(numeroDeRepresentaciones);
        sb.append(String.format(" Sueldo: %,.2f", calcularSueldo()));
        sb.append("\n");
        return sb.toString();
    }

}
