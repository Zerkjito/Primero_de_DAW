/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class POO2_3 {

    static ArrayList<Alumno> alumnos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
            switch (opcion) {
                case 0 -> System.out.println("\nFin programa");
                case 1 -> nuevoAlumno();
                case 2 -> mostrarAlumnos();
                case 3 -> buscarAlumnos();
                case 4 -> bajasAlumnos();
                case 5 -> modificarAlumnos();
                case 6 -> mostrarMediaTotal();
                case 7 -> modificarLimiteFaltasGraves();
                case 8 -> mostrarAlumnosConFaltasGraves();
                case 9 -> mostrarAlumnosExpulsados();
            }
        } while (opcion != 0);
    }

    public static void nuevoAlumno() {
        Alumno a = new Alumno(); //crear una nueva instancia de Alumno
        a.leer(); //se introducen sus datos por teclado

        //El siguiente if comprueba si el ArrayList contiene ya al alumno
        //Para ello se utiliza en método contains de ArrayList
        //El método contains decide si un objeto se encuentra o no en el ArrayList utilizando 
        //el método equals del objeto que quiere comprobar
        //La clase Alumno debe tener un método equals donde se indique cuando dos alumnos son iguales
        if (!alumnos.contains(a)) { //si no existe
            alumnos.add(a); //se añade al array
        } else {
            System.out.println("\n--->>> Ya existe un alumno con ese Nif\n");
        }
    }

    public static void mostrarAlumnos() {
        System.out.println("\nListado alfabético de alumnos");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            Collections.sort(alumnos); //Se ordena según el método compareTo de la clase Alumno
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println(alumnos.get(i));
                System.out.println();
            }
        }
    }

    public static void buscarAlumnos() {
        System.out.println("\nBuscar Alumnos");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            System.out.print("\nNIF (8 digitos) del alumno a buscar: ");
            int dni = sc.nextInt();
            Nif nif = new Nif(dni);
            Alumno alumno = getAlumno(nif);
            if (alumno != null) {
                System.out.println(alumno);
            } else {
                System.out.println("\n--->>> Alumno no encontrado\n");
            }
        }
    }

    public static void bajasAlumnos() {
        System.out.println("\nBajas de Alumnos");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            String s;
            System.out.print("\nNIF (8 digitos) del alumno a dar de baja: ");
            int dni = sc.nextInt();
            sc.nextLine();
            Nif nif = new Nif(dni);
            Alumno alumno = getAlumno(nif);
            if (alumno != null) {
                System.out.println(alumno);
                do {
                    System.out.print("Dar de baja? (SI/NO) ");
                    s = sc.nextLine();
                } while (!s.equalsIgnoreCase("SI") && !s.equalsIgnoreCase("NO"));
                if (s.equalsIgnoreCase("SI")) {
                    alumnos.remove(alumno);
                }
            } else {
                System.out.println("\n----> Alumno no encontrado\n");
            }
        }
    }

    public static void modificarAlumnos() {
        //Variables para introducir los nuevos datos del alumno
        int nia;
        String curso;
        String nombre;
        Fecha fechaNacimiento = new Fecha();
        String direccion;
        int codigoPostal;
        String ciudad;
        double notaMedia;
        int numeroDeFaltasGraves;
        int dia, mes, año;
        
        System.out.println("\nModificar datos de alumnos");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            String s;
            System.out.print("NIF (8 digitos) del alumno a modificar? ");
            int dni = sc.nextInt();
            sc.nextLine();
            Nif nif = new Nif(dni);
            Alumno alumno = getAlumno(nif); //Se obtiene el alumno con ese NIF
            if (alumno != null) {
                System.out.println(alumno);//Se muestran los datos actuales del alumno
                do {
                    System.out.print("Modificar? (SI/NO) ");
                    s = sc.nextLine();
                } while (!s.equalsIgnoreCase("SI") && !s.equalsIgnoreCase("NO"));
                if (s.equalsIgnoreCase("SI")) {
                    //Se introducen los nuevos datos del alumno
                    //El NIF no se introduce ya que no se puede modificar
                    System.out.print("Matrícula: ");
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
                    sc.nextLine();//limpiar buffer
                    System.out.print("Dirección: ");
                    direccion = sc.nextLine();
                    System.out.print("Código postal: ");
                    codigoPostal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Nota media: ");
                    notaMedia = sc.nextDouble();
                    System.out.print("Número de faltas graves: ");
                    numeroDeFaltasGraves = sc.nextInt();
                    sc.nextLine();//limpiar buffer
                    //modificar los atributos con los valores introducidos por teclado
                    alumno.setNia(nia);
                    alumno.setNombre(nombre);
                    alumno.setCurso(curso);
                    alumno.setFechaNacimiento(fechaNacimiento);
                    alumno.setCiudad(ciudad);
                    alumno.setCodigoPostal(codigoPostal);
                    alumno.setDireccion(direccion);                   
                    alumno.setNotaMedia(notaMedia);
                    alumno.setNumeroDeFaltasGraves(numeroDeFaltasGraves);
                }
            } else {
                System.out.println("\n----> Alumno no encontrado\n");
            }
        }
    }

    //Método que recibe un NIF y devuelve el alumno con ese NIF o null si el alumno no existe.
    public static Alumno getAlumno(Nif nif) {
        Alumno a = new Alumno();
        a.setNif(nif);
        int pos = alumnos.indexOf(a);
        if (pos != -1) {
            return alumnos.get(pos);
        }
        return null;
    }

//  Forma alternativa de hacer el método getAlumno
//  recorrer el array y buscar el nif
//     public static Alumno getAlumno(Nif nif) {
//        for (Alumno alumno : alumnos) {
//            if (alumno.getNif().equals(nif)) {
//                return alumno;
//            }
//        }
//        return null;  
//    }
    public static void mostrarMediaTotal() {
        if (alumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos\n");
        } else {
            System.out.println("\nNota media global: " + calcularMediaTotal());
            System.out.println();
        }
    }

    public static double calcularMediaTotal() {
        double media = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            media = media + alumnos.get(i).getNotaMedia();
        }
        return media / alumnos.size();
    }

    public static void modificarLimiteFaltasGraves() {
        int n;
        System.out.println("\nLimite actual de faltas graves: " + Alumno.getLimiteDeFaltasGraves());

        do {
            System.out.print("Nuevo límite: ");
            n = sc.nextInt();
        } while (n < 1);
        Alumno.setLimiteDeFaltasGraves(n);
    }

    public static void mostrarAlumnosConFaltasGraves() {
        ArrayList<Alumno> faltas = new ArrayList<>(); //ArrayList para guardar los alumnos con faltas graves y mostrarlo ordenado
        System.out.println("\nAlumnos con faltas graves:");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getNumeroDeFaltasGraves() > 0) {
                    faltas.add(alumnos.get(i)); //se añade al ArrayList de faltas
                }
            }
            if (faltas.isEmpty()) {
                System.out.println("\n----> No hay alumnos con faltas graves");
            } else {
                Collections.sort(faltas, new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno t, Alumno t1) {
                        return t.getNumeroDeFaltasGraves() - t1.getNumeroDeFaltasGraves();
                    }
                });
                for (int i = 0; i < faltas.size(); i++) {
                    System.out.println(faltas.get(i));
                }
                System.out.println();
            }
        }
    }

    public static void mostrarAlumnosExpulsados() {
        ArrayList<Alumno> expulsados = new ArrayList<>(); //ArrayList para guardar los alumnos expulsados y mostrarlo ordenado
        System.out.println("\nAlumnos expulsados:");
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos\n");
        } else {
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getNumeroDeFaltasGraves() >= Alumno.getLimiteDeFaltasGraves()) {
                    expulsados.add(alumnos.get(i));
                }
            }
            if (expulsados.isEmpty()) {
                System.out.println("\n---->>> No hay alumnos expulsados");
            } else {
                Collections.sort(expulsados); //orden alfabético
                for (int i = 0; i < expulsados.size(); i++) {
                    System.out.println(expulsados.get(i));
                }
                System.out.println();
            }

        }
    }

}
