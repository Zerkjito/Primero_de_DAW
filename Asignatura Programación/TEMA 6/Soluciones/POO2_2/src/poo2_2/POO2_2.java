/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class POO2_2 {

    final static int MAXIMO_EMPLEADOS = 20;
    static Empleado[] empleados = new Empleado[MAXIMO_EMPLEADOS];
    static int indice = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double importe;
        Empleado e;
        leerEmpleados();
        if (numeroDeEmpleados() > 0) {

            //mostrar empleados
            System.out.println("\n\nEmpleados introducidos: ");
            ordenarAlfabeticamente();
            mostrar();

            importe = leerImporteHorasExtras();

            //asignar el atributo estático pagoPorHoraExtra
            Empleado.setPagoPorHoraExtra(importe);

            //calcular el empleado que más cobra
            e = empleadoQueMasCobra();
            System.out.println("\n\nEmpleado que más cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

            //calcular el empleado que menos cobra
            e = empleadoQueMenosCobra();
            System.out.println("\n\nEmpleado que menos cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

            //calcular el empleado que más cobra por horas extra
            e = empleadoQueMasCobraPorHorasExtras();
            System.out.println("\n\nEmpleado que más cobra por horas extras:");
            System.out.println(e);
            System.out.printf("Total horas extras: %.2f €", e.calcularImporteHorasExtras());

            //calcular el empleado que menos cobra por horas extra
            e = empleadoQueMenosCobraPorHorasExtras();
            System.out.println("\n\nEmpleado que menos cobra por horas extras:");
            System.out.println(e);
            System.out.printf("Total horas extras: %.2f €", e.calcularImporteHorasExtras());

            //ordenar por salario de menor a mayor
            ordenarPorSalario();
            System.out.println("\n\nEmpleados ordenados por salario:");
            mostrarEmpleadosYSalarios();

        }
    }

    public static void leerEmpleados() {
        Empleado e;
        String dni, nombre;
        double sueldoBase;
        int horasExtras;
        double tipoIRPF;
        char casado;  // S ó N
        int numeroHijos;
        int i, N;
        boolean yaExiste;
        do {
            System.out.print("Número de empleados? (Máximo " + MAXIMO_EMPLEADOS + "): ");
            N = sc.nextInt();
            if (N > MAXIMO_EMPLEADOS) {
                System.out.println("No puede haber más de " + MAXIMO_EMPLEADOS + " empleados");
            }
        } while (N < 0 || N > MAXIMO_EMPLEADOS);

        for (i = 1; i <= N; i++) {
            sc.nextLine(); //limpiar el buffer
            //Falta comprobar que los valores introducidos para cada campo son correctos
            do {
                yaExiste = false;
                System.out.println("Empleado " + i);
                System.out.print("Nif: ");
                dni = sc.nextLine();
                e = new Empleado(dni); //crear una nueva instancia de empleado con el constructor con un parámetro
                if (!existeEmpleado(e)) {
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Sueldo Base: ");
                    sueldoBase = sc.nextDouble();
                    System.out.print("Horas extra: ");
                    horasExtras = sc.nextInt();
                    System.out.print("Tipo de IRPF: ");
                    tipoIRPF = sc.nextDouble();
                    sc.nextLine();//limpiar buffer
                    System.out.print("Casado (S/N): ");
                    casado = sc.nextLine().charAt(0);
                    System.out.print("Número de hijos: ");
                    numeroHijos = sc.nextInt();
                    e.setNombre(nombre);
                    e.setSueldoBase(sueldoBase);
                    e.setHorasExtras(horasExtras);
                    e.setTipoIRPF(tipoIRPF);
                    e.setCasado(Character.toUpperCase(casado));
                    e.setNumeroHijos(numeroHijos);
                    empleados[indice] = e; //se añade al array
                    indice++;
                } else {
                    System.out.println("Ya existe un empleado con ese nif");
                    yaExiste = true;
                }
            } while (yaExiste);
        }
    }

    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleados[i]);
            System.out.println();
        }
    }

    public static double leerImporteHorasExtras() {
        double importe;
        do {
            System.out.print("Introduce el importe a pagar por cada hora extra: ");
            importe = sc.nextDouble();
        } while (importe < 0);
        return importe;
    }

    public static int numeroDeEmpleados() {
        return indice;
    }

    public static Empleado empleadoQueMasCobra() {
        Empleado mayor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularSueldo() > mayor.calcularSueldo()) {
                mayor = empleados[i];
            }
        }
        return mayor;
    }

    public static Empleado empleadoQueMenosCobra() {
        Empleado menor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularSueldo() < menor.calcularSueldo()) {
                menor = empleados[i];
            }
        }
        return menor;
    }

    public static Empleado empleadoQueMasCobraPorHorasExtras() {
        Empleado mayor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularImporteHorasExtras() > mayor.calcularImporteHorasExtras()) {
                mayor = empleados[i];
            }
        }
        return mayor;
    }

    public static Empleado empleadoQueMenosCobraPorHorasExtras() {
        Empleado menor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularImporteHorasExtras() < menor.calcularImporteHorasExtras()) {
                menor = empleados[i];
            }
        }
        return menor;
    }

    //ordenar el array alfabéticamente por nombre de los empleados
    public static void ordenarAlfabeticamente() {
        //La clase Empleado implementa la interfaz Comparable 
        //Arrays.sort ordenará según el método compareTo escrito en la clase Empleado
        //En este caso el método compareTo de la clase Empleado indica que se deben comparar los nombre
        //Se realiza el orden alfebético por nombre
        Arrays.sort(empleados, 0, indice);
        //En este caso el array empleados tiene un tamaño máximo de 20 elementos pero
        //debemos tener en cuenta que puede no estar completamente lleno
        //Si para ordenarlo ejecutamos Arrays.sort(empleados) 
        //cuando lleguemos a un elemento de lso del final del array que esté vacío (null)
        //se producirá un error ya que Arrays.sort va a ordenar el array completo 
        //y los elementos que contienen null provocan un error.
        //Por este motivo al ordenar hay que indicar la posición de inicio y la del final
        //que queremos ordenar.
        //Vamos a ordenar desde la primera posición del array: posición 0
        //hasta la posición donde se encuentra el último empleado: posición indice-1
        //
        //Arrays.sort(empleados, 0, indice) ordena el array empleados desde la posición 0
        //hasta la posición indice-1. 
        //la posición indicada por indice no entra en la ordenación.
    }

    //Método alternativo para ordenar alfabéticamente
    //se emplea el método de la burbuja
    //En este caso no es necesario que la clase Empleado tenga el método compareTo
//    public static void ordenarAlfabeticamente() {
//        int i, j;
//        Empleado aux;
//        for (i = 0; i < indice - 1; i++) {
//            for (j = 0; j < indice - i - 1; j++) {
//                if (empleados[j + 1].getNombre().compareToIgnoreCase(empleados[j].getNombre()) < 0) {
//                    aux = empleados[j + 1];
//                    empleados[j + 1] = empleados[j];
//                    empleados[j] = aux;
//                }
//            }
//        }
//    }
    
    //ordenar el array por el sueldo de los empleados de menor a mayor
    public static void ordenarPorSalario() {
        Arrays.sort(empleados, 0, indice, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return Double.compare(o1.calcularSueldo(), o2.calcularSueldo());
            }

        });
        //se ordenan los elementos del array por sueldo
        //el orden se indica en el método compare del Comparator
        //debemos indicar desde y hasta qué elemento ordenar ya que 
        //el array puede no estar completo.
        //Si el array tiene elemento nulos al final, al realizar la ordenación
        //se producirá un error. Por eso se indica que ordene desde 
        //el elemento 0 hasta el último que se ha introducido
    }

    //Método alternativo para ordenar el array por sueldo
    //se emplea el método de la burbuja
    //En este caso no es necesario el Comparator
//    public static void ordenarPorSalario() {
//        int i, j;
//        Empleado aux;
//        for (i = 0; i < indice - 1; i++) {
//            for (j = 0; j < indice - i - 1; j++) {
//                if (empleados[j + 1].calcularSueldo() < empleados[j].calcularSueldo()) {
//                    aux = empleados[j + 1];
//                    empleados[j + 1] = empleados[j];
//                    empleados[j] = aux;
//                }
//            }
//        }
//    }
    public static void mostrarEmpleadosYSalarios() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleados[i]);
            System.out.printf("Sueldo: %.2f € %n%n", empleados[i].calcularSueldo());
        }
    }

    public static boolean existeEmpleado(Empleado e) {
        for (int i = 0; i < indice; i++) {
            if (empleados[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
}
