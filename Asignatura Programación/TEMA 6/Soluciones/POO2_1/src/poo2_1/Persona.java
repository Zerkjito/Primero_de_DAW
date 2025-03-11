package poo2_1;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private Fecha fechaNacimiento;
    private String direccion;
    private int codigoPostal;
    private String ciudad;

    public Persona() {
        fechaNacimiento = new Fecha();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fecha) {
        fechaNacimiento.setDia(fecha.getDia());
        fechaNacimiento.setMes(fecha.getMes());
        fechaNacimiento.setAño(fecha.getAño());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esMayorDeEdad() {
        LocalDate fechaActual = LocalDate.now();
        int diaActual = fechaActual.getDayOfMonth();
        int mesActual = fechaActual.getMonthValue();
        int añoActual = fechaActual.getYear();
        if (añoActual - fechaNacimiento.getAño() > 18) {
            return true;
        } else if (añoActual - fechaNacimiento.getAño() == 18 && mesActual > fechaNacimiento.getMes()) {
            return true;
        } else if (añoActual - fechaNacimiento.getAño() == 18 && mesActual == fechaNacimiento.getMes() && diaActual >= fechaNacimiento.getDia()) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("\nFecha de Nacimiento: ");
        sb.append(fechaNacimiento.fechaCorta());
        sb.append("\nDireccion: ");
        sb.append(direccion);
        sb.append("\n");
        sb.append(codigoPostal);
        sb.append(" ");
        sb.append(ciudad);
        sb.append("\n");
        return sb.toString();
    }

    
}
