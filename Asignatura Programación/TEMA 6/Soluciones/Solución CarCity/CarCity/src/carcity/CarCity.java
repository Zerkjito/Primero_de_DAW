package carcity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CarCity {

    static ArrayList<Coche> coches = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leer();
            switch (opcion) {
                case 1 -> nuevoCoche();
                case 2 -> mostrarTodos();
                case 3 -> circulanHoy();
            }
        } while (opcion != 0);
    }

    public static void nuevoCoche() {
        LocalDate fecha = LocalDate.now();
        int añoActual = fecha.getYear();
        Coche coche = new Coche();
        boolean ok, electrico;
        int año, e;
        String marca, matriculaCoche;
        do {
            ok = true;
            System.out.print("\nMatricula (4 dígitos + 3 letras): ");
            matriculaCoche = sc.nextLine();
            if (!matriculaCorrecta(matriculaCoche)) {
                System.out.println("Matrícula no válida");
                ok = false;
            }
        } while (!ok);
        Matricula matricula = new Matricula(matriculaCoche.substring(0, 4), matriculaCoche.substring(4));
        coche.setMatricula(matricula);
        if (coches.contains(coche)) {
            System.out.println("\n--->> Esa matrícula ya existe\n");
        } else {
            do {
                System.out.print("Año de matriculación: ");
                año = sc.nextInt();
                if (año > añoActual) {
                    System.out.println("El año de matriculación no puede ser superior al año actual");
                }
            } while (año > añoActual);
            do {
                System.out.print("Electrico? 1-> SI 2-> NO: ");
                e = sc.nextInt();
            } while (e < 1 || e > 2);

            if (e == 1) {
                electrico = true;
            } else {
                electrico = false;
            }
            sc.nextLine();
            do {
                System.out.print("Marca: ");
                marca = sc.nextLine();
            } while (marca.isEmpty());

            coche.setAñoMatriculacion(año);
            coche.setElectrico(electrico);
            coche.setMarca(marca);
            coches.add(coche);
        }
    }

    public static void mostrarTodos() {
        if (coches.isEmpty()) {
            System.out.println("\n--->> No hay coches\n");
        } else {
            System.out.println("\nCoches ordenados por año de matriculación");
            Collections.sort(coches);
            for (Coche c : coches) {
                System.out.println(c);
            }
            System.out.println();
        }

    }

    public static void circulanHoy() {
        if (coches.isEmpty()) {
            System.out.println("\n--->> No hay coches\n");
        } else {
            LocalDate fecha = LocalDate.now();
            int añoActual = fecha.getYear();       ///obtenemos el año actual
            int diaActual = fecha.getDayOfMonth(); ///obtenemos el día de hoy    
            boolean par = (diaActual % 2 == 0);    ///comprobamos si hoy es un dia par o impar
            char numero;
            Coche aux;
            ArrayList<Coche> cochesAux = new ArrayList<>(); //ArrayList auxiliar que contendrá los coches que pueden circular hoy
            for (int i = 0; i < coches.size(); i++) {
                aux = coches.get(i);
                if (aux.isElectrico() || aux.getAñoMatriculacion() == añoActual) {
                    cochesAux.add(aux);
                } else {
                    numero = aux.getMatricula().getNumeros().charAt(0); ////primer caracter de la matrícula
                    if (par) { ////si hoy es un dia par
                        if (numero == '0' || numero == '2' || numero == '4' || numero == '6' || numero == '8') {
                            cochesAux.add(aux);
                        }
                    } else {////si es un dia impar
                        if (numero == '1' || numero == '3' || numero == '5' || numero == '7' || numero == '9') {
                            cochesAux.add(aux);
                        }
                    }
                }
            }
            Collections.sort(cochesAux, new Comparator<Coche>() { //Ordenamos el ArrayList auxiliar alfabéticamente por marca

                @Override
                public int compare(Coche o1, Coche o2) {
                    return o1.getMarca().compareToIgnoreCase(o2.getMarca());

//-------->>> la instrucción return anterior es equivalente a estos if anidados: 
//
//                    if (o1.getMarca().compareToIgnoreCase(o2.getMarca()) < 0) {
//                        return -1;
//                    } else if (o1.getMarca().compareToIgnoreCase(o2.getMarca()) > 0) {
//                        return 1;
//                    } else {
//                        return o1.getAñoMatriculacion() - o2.getAñoMatriculacion();
//                    }
                }

            });
            System.out.println("\nCoches que pueden circular hoy ordenados por marca");
            for (Coche c : cochesAux) {
                System.out.println(c);
            }
            System.out.println();
        }

    }

    public static boolean matriculaCorrecta(String matricula) {
        if (matricula.length() != 7) {
            return false;
        }
        String numeros = matricula.substring(0, 4);
        String letras = matricula.substring(4);

        return numerosCorrectos(numeros) && letrasCorrectas(letras);
    }

    public static boolean numerosCorrectos(String numeros) {
        if (numeros.length() != 4) {
            return false;
        }
        for (int i = 0; i < numeros.length(); i++) {
            if (!Character.isDigit(numeros.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean letrasCorrectas(String letras) {
        if (letras.length() != 3) {
            return false;
        }
        for (int i = 0; i < letras.length(); i++) {
            if (!Character.isLetter(letras.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
