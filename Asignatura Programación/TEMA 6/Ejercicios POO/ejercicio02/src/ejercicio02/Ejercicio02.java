/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author zerkje
 */
public class Ejercicio02 {

    static Empleado[] empleados = new Empleado[20];
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerEmpleado(empleados);
        
        
        System.out.println("\nEmpleado que mas cobra:");
        System.out.println(salarioMasAlto());
        
        System.out.println("\nEmpleado que menos cobra:");
        System.out.println(salarioMasBajo());
        
        System.out.println("Salarios ordenados de menor a mayor:\n");
        ordenarSalarioMenorMayor();
    }

    public static void leerEmpleado(Empleado[] e) {
        int cantEmpleados, horasExtras, estadoCivilOpcion, numHijos;
        String dni = "", nombre;
        double sueldoBase, irpf;
        boolean casado;
        do {
            System.out.print("Introduce cuantos empleados van a agregarse: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Entrada invalida, introduce un numero.");
                sc.nextLine();
                System.out.print("Introduce cuantos empleados van a agregarse: ");
            }
            cantEmpleados = sc.nextInt();
            if (cantEmpleados < 1) {
                System.out.println("Error: Debe leerse como minimo 1 empleado.");
            } else if (cantEmpleados > 20) {
                System.out.println("Error: Pueden leerse como maximo 20 empleados.");
            }
        } while (cantEmpleados < 1 || cantEmpleados > 20);
        
        sc.nextLine();

        for (int i = 0; i < cantEmpleados; i++) {

            boolean dniValido = false;
            while (!dniValido) {
                System.out.print("\nIntroduce el DNI del empleado " + (i + 1) + ": ");
                dni = sc.nextLine();

                while (!dni.matches("[0-9]{8}[A-Z]$")) {
                    System.out.println("Error: DNI invalido, debe contener 9 digitos y 1 letra.");
                    System.out.print("Introduce el DNI del empleado " + (i + 1) + ": ");
                    dni = sc.nextLine().trim();
                }

                boolean dniRepetido = false;
                for (int j = 0; j < i; j++) {
                    if (e[j] != null && e[j].equals(new Empleado(dni, "", 0, 0, 0, false, 0))) {
                        dniRepetido = true;
                        break;
                    }
                }

                if (dniRepetido) {
                    System.out.println("Error: El DNI ya esta registrado.");
                } else {
                    dniValido = true;
                }
            }

            System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
            nombre = sc.nextLine();
            while (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]{1,50}$")) {
                System.out.println("Error: Nombre invalido.");
                System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
                nombre = sc.nextLine();
            }

            do {
                System.out.print("Introduce el sueldo base del empleado: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Entrada invalida, introduce un numero valido.");
                    sc.nextLine();
                    System.out.print("Introduce el sueldo base del empleado: ");
                }
                sueldoBase = sc.nextDouble();
                if (sueldoBase <= 0) {
                    System.out.println("Error: Introduce una cantidad valida.");
                }
            } while (sueldoBase <= 0);

            sc.nextLine();

            do {
                System.out.print("Introduce las horas extras: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Entrada invalida, introduce un numero valido.");
                    sc.nextLine();
                    System.out.print("Introduce las horas extras: ");
                }
                horasExtras = sc.nextInt();
                if (horasExtras < 0) {
                    System.out.println("Error: Entrada negativa.");
                }
            } while (horasExtras < 0);

            do {
                System.out.print("Introduce el tipo de IRPF: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Entrada invalida, introduce un numero valido.");
                    sc.nextLine();
                    System.out.print("Introduce el tipo de IRPF: ");
                }
                irpf = sc.nextDouble();
                if (irpf < 0) {
                    System.out.println("Error: IRPF no puede ser negativo.");
                }
            } while (irpf < 0);

            do {
                System.out.print("Estado civil (1 -> Casado/a, 2 -> Soltero/a): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Entrada invalida, introduce solo 1 o 2.");
                    sc.nextLine();
                    System.out.print("Estado civil (1 -> Casado/a, 2 -> Soltero/a): ");
                }
                estadoCivilOpcion = sc.nextInt();

                if (estadoCivilOpcion != 1 && estadoCivilOpcion != 2) {
                    System.out.println("Error: Entrada invalida, introduce solo 1 o 2.");
                }
            } while (estadoCivilOpcion != 1 && estadoCivilOpcion != 2);

            if (estadoCivilOpcion == 1) {
                casado = true;
            } else {
                casado = false;
            }
            
            sc.nextLine();

            do {
                System.out.print("Introduce el numero de hijos: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Entrada invalida, introduce un numero valido.");
                    sc.nextLine();
                    System.out.print("Introduce el numero de hijos: ");
                }
                numHijos = sc.nextInt();

                if (numHijos < 0) {
                    System.out.println("Error: Cantidad de hijos no puede ser negativa.");
                }
            } while (numHijos < 0);
            e[i] = new Empleado(dni, nombre, sueldoBase, horasExtras, irpf, casado, numHijos);
            sc.nextLine();
        }
    }

    public static Empleado salarioMasAlto() {
        Empleado empleadoConMayorSalario = null;

        for (Empleado empleado : empleados) {
            if (empleado != null && (empleadoConMayorSalario == null || empleado.getSueldoBase() > empleadoConMayorSalario.getSueldoBase())) {
                empleadoConMayorSalario = empleado;
            }
        }
        return empleadoConMayorSalario;
    }

    public static Empleado salarioMasBajo() {
        Empleado empleadoConMenorSalario = null;

        for (Empleado empleado : empleados) {
            if (empleado != null && (empleadoConMenorSalario == null || empleado.getSueldoBase() < empleadoConMenorSalario.getSueldoBase())) {
                empleadoConMenorSalario = empleado;
            }
        }
        return empleadoConMenorSalario;
    }
    
public static void ordenarSalarioMenorMayor() {
    ArrayList<Empleado> empleadosNoNull = new ArrayList<>();
    
    for (Empleado e : empleados) {
        if (e != null) {
            empleadosNoNull.add(e);
        }
    }

    empleadosNoNull.sort(Comparator.naturalOrder());

    for (Empleado e : empleadosNoNull) {
        System.out.println(e);
    }
}

    

}
