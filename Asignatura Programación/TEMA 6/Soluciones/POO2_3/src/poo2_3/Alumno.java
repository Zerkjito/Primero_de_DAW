package poo2_3;

import java.util.Scanner;

public class Alumno implements Comparable<Alumno> {

    private static int limiteDeFaltasGraves = 5;
    private int nia;
    private String curso;
    private String nombre;
    private Nif nif;
    private Fecha fechaNacimiento;
    private String direccion;
    private int codigoPostal;
    private String ciudad;
    private double notaMedia;
    private int numeroDeFaltasGraves;

    //constructor por defecto
    //se ceran los objetos Fecha y Nif
    public Alumno() {
        this.nif = new Nif();
        this.fechaNacimiento = new Fecha();
    }

    //métodos getters-setters
    public static int getLimiteDeFaltasGraves() {
        return limiteDeFaltasGraves;
    }

    public static void setLimiteDeFaltasGraves(int limiteDeFaltasGraves) {
        Alumno.limiteDeFaltasGraves = limiteDeFaltasGraves;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif.setDni(nif.getDni());
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento.setDia(fechaNacimiento.getDia());
        this.fechaNacimiento.setMes(fechaNacimiento.getMes());
        this.fechaNacimiento.setAño(fechaNacimiento.getAño());
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getNumeroDeFaltasGraves() {
        return numeroDeFaltasGraves;
    }

    public void setNumeroDeFaltasGraves(int numeroDeFaltasGraves) {
        this.numeroDeFaltasGraves = numeroDeFaltasGraves;
    }

    //método para introducir por teclado los valores de los atributos del objeto
    public void leer() {
        int dia, mes, año;
        Scanner sc = new Scanner(System.in);
        nif.leer(); //leer el nif utilizando el método leer de la clase NIF
        System.out.print("NIA: ");
        nia = sc.nextInt();
        sc.nextLine(); //limpiar el buffer
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Curso: ");
        curso = sc.nextLine();
        do {
            System.out.print("Fecha de nacimiento: ");
            System.out.print("dia: ");
            dia = sc.nextInt();
            System.out.print("mes: ");
            mes = sc.nextInt();
            System.out.print("año: ");
            año = sc.nextInt();
            fechaNacimiento.asignarFecha(dia, mes, año);
        } while (!fechaNacimiento.fechaCorrecta());
        sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("Código postal: ");
        codigoPostal = sc.nextInt();
        sc.nextLine(); //limpiar buffer
        System.out.print("Ciudad: ");
        ciudad = sc.nextLine();
        System.out.print("Nota media: ");
        notaMedia = sc.nextDouble();
        System.out.print("Número de faltas graves: ");
        numeroDeFaltasGraves = sc.nextInt();
        sc.nextLine(); //limpiar buffer
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIA: ");
        sb.append(nia);
        sb.append("\nNif: ");
        sb.append(nif.toString());
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nCurso: ");
        sb.append(curso);
        sb.append("\nFecha de nacimiento: ");
        sb.append(fechaNacimiento);
        sb.append("\nDirección: ");
        sb.append(direccion);
        sb.append("\n");
        sb.append(codigoPostal);
        sb.append(" ");
        sb.append(ciudad);
        sb.append("\nNota media: ");
        sb.append(notaMedia);
        sb.append("\nNúmero de faltas graves: ");
        sb.append(numeroDeFaltasGraves);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.nif != null ? this.nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.nif.equals(other.nif);
    }

    @Override
    public int compareTo(Alumno t) {
        return this.nombre.compareToIgnoreCase(t.nombre);
    }

}
