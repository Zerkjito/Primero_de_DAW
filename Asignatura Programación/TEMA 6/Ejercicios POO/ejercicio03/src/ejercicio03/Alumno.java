/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zerkje
 */
public class Alumno {

    private static Scanner sc = new Scanner(System.in);
    private int nia;
    private String curso;
    private String nombre;
    private Nif nif;
    private Fecha fnac;
    private String direccion;
    private String codigoPostal; // el ejercicio pide int, pero yo quiero aplicarle una comprobacion regex para practicar :)
    private String ciudad;
    private double notaMedia;
    private int faltasGraves;
    private static int limiteFaltasGraves = 5;

    public Alumno(int nia, String curso, String nombre, Nif nif, Fecha fnac, String direccion, String codigoPostal, String ciudad, double notaMedia, int faltasGraves) {
        this.nia = nia;
        this.curso = curso;
        this.nombre = nombre;
        this.nif = nif;
        this.fnac = fnac;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.notaMedia = notaMedia;
        this.faltasGraves = faltasGraves;
    }

    public Alumno() {
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
        this.nif = nif;
    }

    public Fecha getFnac() {
        return fnac;
    }

    public void setFnac(Fecha fnac) {
        this.fnac = fnac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
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

    public int getFaltasGraves() {
        return faltasGraves;
    }

    public void setFaltasGraves(int faltasGraves) {
        this.faltasGraves = faltasGraves;
    }

    public static int getLimiteFaltasGraves() {
        return limiteFaltasGraves;
    }

    public static void setLimiteFaltasGraves(int limiteFaltasGraves) {
        Alumno.limiteFaltasGraves = limiteFaltasGraves;
    }

    private void pedirNia() {

        do {
            System.out.print("\nIntroduce el NIA (8 digitos): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el NIA: ");
            }
            this.nia = sc.nextInt();
            sc.nextLine();
            if (this.nia <= 10000000 || this.nia > 99999999) {
                System.out.println("Error: El NIA debe tener 8 digitos.");
            }
        } while (this.nia <= 0 || this.nia > 99999999);
    }

    private void pedirCurso() {
        System.out.print("\nIntroduce el curso que estudia: ");
        this.curso = sc.nextLine().trim();
        while (!this.curso.matches("^[1-4][a-zA-Z ]{1,20}$")) {
            System.out.println("Error: Nombre de curso invalido, vuelve a intentarlo.");
            System.out.print("Introduce el curso que estudia: ");
            this.curso = sc.nextLine();
        }
    }

    private void pedirNombre() {
        System.out.print("\nIntroduce el nombre completo del alumno: ");
        this.nombre = sc.nextLine().trim();
        while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,100}$")) {
            System.out.println("Error: Nombre de alumno invalido, vuelve a intentarlo.");
            System.out.print("Introduce el nombre completo del alumno: ");
            this.nombre = sc.nextLine();
        }
    }

    private void pedirNif() {
        this.nif = new Nif();
    }

    private void pedirFnac() {
        Fecha fechaNacimiento = new Fecha();
        int dia, mes, anyo;
        do {
            System.out.print("\nIntroduce el dia de nacimiento: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el dia de nacimiento: ");
            }
            dia = sc.nextInt();

            System.out.print("Introduce el mes de nacimiento: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el mes de nacimiento: ");
            }
            mes = sc.nextInt();

            System.out.print("Introduce el anyo de nacimiento: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el anyo de nacimiento: ");
            }
            anyo = sc.nextInt();
            sc.nextLine();

            fechaNacimiento.asignarFecha(dia, mes, anyo);
            if (!fechaNacimiento.fechaCorrecta()) {
                System.out.println("Error: Fecha invalida, vuelve a intentarlo.");
            }
        } while (!fechaNacimiento.fechaCorrecta());
        this.fnac = fechaNacimiento;
    }

    private void pedirDireccion() {
        System.out.print("\nIntroduce la direccion: ");
        this.direccion = sc.nextLine().trim();
        while (!this.direccion.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 ]{1,80}$")) {
            System.out.println("Error: Direccion invalida, vuelve a intentarlo.");
            System.out.println("Introduce la direccion: ");
            this.direccion = sc.nextLine();
        }
    }

    private void pedirCodigoPostal() {
        System.out.print("\nIntroduce el codigo postal: ");
        this.codigoPostal = sc.nextLine().trim();
        while (!this.codigoPostal.matches("^[0-9]{5}$")) {
            System.out.println("Error: Codigo postal invalido, vuelve a intentarlo: ");
            System.out.print("Introduce el codigo postal: ");
            this.codigoPostal = sc.nextLine();
        }
    }

    private void pedirCiudad() {
        System.out.print("\nIntroduce la ciudad: ");
        this.ciudad = sc.nextLine().trim();
        while (!this.ciudad.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}")) {
            System.out.println("Error: Nombre de ciudad invalido, vuelve a intentarlo.");
            System.out.print("Introduce la ciudad: ");
            this.ciudad = sc.nextLine();
        }
    }

    private void pedirNotaMedia() {
        do {
            System.out.print("\nIntroduce la nota media: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce la nota media: ");
            }
            this.notaMedia = sc.nextDouble();
            sc.nextLine();

            if (this.notaMedia < 0 || this.notaMedia > 10) {
                System.out.println("Error: Rango invalido, vuelve a intentarlo.");
            }
        } while (this.notaMedia < 0 || this.notaMedia > 10);
    }

    private void pedirFaltasGraves() {
        do {
            System.out.print("\nIntroduce el numero de faltas graves: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero valido.");
                sc.nextLine();
                System.out.print("Introduce el numero de faltas graves: ");
            }
            this.faltasGraves = sc.nextInt();
            sc.nextLine();

            if (this.faltasGraves < 0) {
                System.out.println("Error: Faltas graves no pueden ser negativas.");
            } else if (this.faltasGraves > limiteFaltasGraves) {
                System.out.println("Error: Se ha alcanzado el limite maximo de faltas asignadas.");
            }
        } while (this.faltasGraves < 0 || this.faltasGraves > limiteFaltasGraves);
    }

    public void leer() {
        //pedirNia();
        pedirCurso();
        pedirNombre();
        pedirNif();
        pedirFnac();
        pedirDireccion();
        pedirCodigoPostal();
        pedirCiudad();
        pedirNotaMedia();
        pedirFaltasGraves();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("nia=").append(nia);
        sb.append(", curso=").append(curso);
        sb.append(", nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append(", fnac=").append(fnac);
        sb.append(", direccion=").append(direccion);
        sb.append(", codigoPostal=").append(codigoPostal);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", notaMedia=").append(notaMedia);
        sb.append(", faltasGraves=").append(faltasGraves);
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(nia);
        result = 31 * result + nombre.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alumno other = (Alumno) obj;
        return nia == other.nia;
    }

}
