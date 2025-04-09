
package gestionactores;

public class Amateur extends Actor {
 
    private int numeroHoras;

    public Amateur() {
    }

    public Amateur(String nif, String nombre, int edad, Genero genero, int numeroHoras) {
        super(nif, nombre, edad, genero);
        this.numeroHoras = numeroHoras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calcularSueldo() {
        return numeroHoras * Actor.getPrecioHora();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor Amateur ");
        sb.append(super.toString());
        sb.append(" Horas: ");
        sb.append(numeroHoras);
        sb.append(String.format(" Sueldo: %,.2f", calcularSueldo()));
        sb.append("\n");
        return sb.toString();
    }
    
}
