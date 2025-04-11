package carrerapopular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class CarreraPopular {

    static ArrayList<Carrera> carrera = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int distanciaCarrera;
    static int totalParticipantes;
    static int numActualparticipantes;
    static boolean terminada;

    public static void main(String[] args) {
        crearCarrera();
        Menu menu = new Menu();
        int opcion;
        do {
            menu.mostrar();
            opcion = menu.leerOpcion();
            switch (opcion) {
                case 1 -> mostrarCarrera();
                case 2 -> avanzarParticipantes();
                case 3 -> amonestarParticipantes();
                case 4 -> mostrarGanadores();
                case 5 -> mostrarGanadoresPorCategorias();
                case 6 -> mostrarPosiciónMasJoven();
            }
        } while (opcion != 0);
    }

    public static void crearCarrera() {
        Bicicleta b;
        Patinete pt;
        Corredor c;
        Persona p;
        int tipoParticipante, tipoBici, numRuedas, edad;
        String nombre;
        double peso;
        terminada = false;
        do {
            System.out.print("Introduzca distancia (en metros y >=100): ");
            distanciaCarrera = sc.nextInt();
        } while (distanciaCarrera < 100);
        do {
            System.out.print("Introduzca número de participantes en la carrera (>1): ");
            totalParticipantes = sc.nextInt();
        } while (totalParticipantes <= 1);
        numActualparticipantes = totalParticipantes;
        for (int i = 1; i <= totalParticipantes; i++) {
            System.out.println("Dorsal " + i + ":");
            System.out.print("Tipo de participante 1->Bicicleta 2->Patinete 3-> Corredor --> ");
            tipoParticipante = sc.nextInt();
            sc.nextLine();
            switch (tipoParticipante) {
                case 1, 2 -> {
                    do {
                        System.out.print("Nombre del conductor: ");
                        nombre = sc.nextLine();
                    } while (nombre.isBlank());
                    do {
                        System.out.print("Edad: ");
                        edad = sc.nextInt();
                    } while (edad < 18);  ////--->>>> el ejercicio no dice nada sobre un límite inferior de edad por lo que se puede tomar 18 u otro diferente
                    p = new Persona(nombre, edad);
                    do {
                        System.out.print("Peso del vehículo: ");
                        peso = sc.nextDouble();
                    } while (peso < 0);
                    if (tipoParticipante == 1) { ///--->> Bicicleta
                        b = new Bicicleta();
                        b.setDorsal(i);
                        b.setEnCarrera(true);
                        b.setConductor(p);
                        b.setPeso(peso);
                        do {
                            System.out.print("Tipo de bicicleta 1-> Paseo 2-> Montaña: ");
                            tipoBici = sc.nextInt();
                        } while (tipoBici != 1 && tipoBici != 2);

                        if (tipoBici == 1) {
                            b.setTipo(TipoBicicleta.PASEO);
                        } else {
                            b.setTipo(TipoBicicleta.MONTAÑA);
                        }
                        carrera.add(b);
                    } else { ///--->> Patinete
                        pt = new Patinete();
                        pt.setDorsal(i);
                        pt.setEnCarrera(true);
                        pt.setConductor(p);
                        pt.setPeso(peso);
                        do {
                            System.out.print("Número de ruedas: ");
                            numRuedas = sc.nextInt();
                        } while (numRuedas < 2);
                        pt.setNumeroDeRuedas(numRuedas);
                        carrera.add(pt);
                    }
                }
                case 3 -> {
                    do {
                        System.out.print("Nombre del corredor: ");
                        nombre = sc.nextLine();
                    } while (nombre.isBlank());
                    do {
                        System.out.print("Edad: ");
                        edad = sc.nextInt();
                    } while (edad < 18);  ////--->>>> el ejercicio no dice nada sobre un límite inferior de edad por lo que se puede tomar 18 u otro diferente
                    c = new Corredor(i, nombre, edad);
                    carrera.add(c);
                }
            }
        }
    }

    public static void mostrarCarrera() {
        if (numActualparticipantes > 0) {
            System.out.println("Situación de la carrera:\n");
            ArrayList<Carrera> carreraOrdenada = ordenarArrayPorDistancia();
            for (Carrera c : carreraOrdenada) {
                if (c.enCarrera()) {
                    System.out.println(c);
                    System.out.println("------------------------");
                }
            }
        } else {
            System.out.println("No quedan participantes en la carrera");
        }
    }

    public static void avanzarParticipantes() {
        if (!terminada) {
            Random rnd = new Random();
            int posicion, n;
            do {
                posicion = rnd.nextInt(totalParticipantes);
                n = carrera.get(posicion).avanzar();
            } while (n == -1); //si avanzar devuelve -1 el participante seleccionado no estaba en carrera
            if (n >= distanciaCarrera) { //la carrera acaba si un participante supera la distancia total
                terminada = true;
                System.out.println("-->> Carrera finalizada");
            }
        } else {
            System.out.println("-->> Carrera finalizada");
        }
    }

    public static void amonestarParticipantes() {
        if (!terminada) {
            int dorsal;
            do {
                System.out.print("Introduce dorsal a amonestar (entre 1 y " + totalParticipantes + "): ");
                dorsal = sc.nextInt();
            } while (dorsal < 1 || dorsal > totalParticipantes);
            dorsal--; //el dorsal coincide con la posición del participante en el array. Se puede usar esta variable como índice 
            if (carrera.get(dorsal).amonestar()) { ///--->> si el método amonestar devuelve true significa que el participante está en carrera 
                if (!carrera.get(dorsal).enCarrera()) { ///--->>> si después de amonestarlo ya no se encuentra en carrera
                    numActualparticipantes--;
                    if (numActualparticipantes == 0) {
                        terminada = true;
                        System.out.println("La carrera ha terminado porque no quedan corredores");
                    }
                }
            } else { //Si no está en la carrera no se puede amonestar
                System.out.println(carrera.get(dorsal));
                System.out.println("No se puede amonestar. Ya está fuera de la carrera");
            }
        } else {
            System.out.println("-->> Carrera finalizada");
        }
    }

    public static void mostrarGanadores() {
        if (numActualparticipantes > 0) {
            if (terminada) {
                carrera = ordenarArrayPorDistancia();
                int i = 0, cont = 0;
                String mensaje = null;
                //se muestran los tres primeros que siguen en carrera 
                //si quedan menos de 3 se mostrarán los que queden
                //si no queda nadie no se mostrará ninguno
                while (cont < 3 && i < carrera.size()) {
                    if (carrera.get(i).enCarrera()) {
                        switch (cont) {
                            case 0 -> mensaje = "Primer Puesto: ";
                            case 1 -> mensaje = "Segundo Puesto: ";
                            case 2 -> mensaje = "Tercer Puesto: ";
                        }
                        System.out.println(mensaje);
                        System.out.println(carrera.get(i));
                        System.out.println("------------------------");
                        cont++;
                    }
                    i++;
                }
            } else {
                System.out.println("-->> La carrera no ha finalizado");
            }
        } else {
            System.out.println("No quedan participantes en la carrera");
        }
    }

    public static void mostrarGanadoresPorCategorias() {
        if (numActualparticipantes > 0) {
            if (terminada) {
                carrera = ordenarArrayPorDistancia();
                boolean bicicleta = false, patinete = false, corredor = false; //indican si ya he mostrado la aprimera bicicleta, coche o profesional
                for (int i = 0; i < carrera.size(); i++) {
                    if (!bicicleta || !patinete || !corredor) { //si queda alguna categoría por mostrar
                        //si es una bicicleta y es la primera
                        if (carrera.get(i) instanceof Bicicleta && !bicicleta && carrera.get(i).enCarrera()) {
                            System.out.println("Primera Bicicleta en la posición " + (i + 1));
                            System.out.println(carrera.get(i));
                            System.out.println();
                            bicicleta = true;
                        }
                        //si es un patinete y es el primero
                        if (carrera.get(i) instanceof Patinete && !patinete && carrera.get(i).enCarrera()) {
                            System.out.println("Primer Patinete en la posición " + (i + 1));
                            System.out.println(carrera.get(i));
                            System.out.println();
                            patinete = true;
                        }
                        //si es un profesional y es el primero
                        if (carrera.get(i) instanceof Corredor && !corredor && carrera.get(i).enCarrera()) {
                            System.out.println("Primer Corredor en la posición " + (i + 1));
                            System.out.println(carrera.get(i));
                            System.out.println();
                            corredor = true;
                        }
                    }
                }
                //Se muestra un mensaje si no hay totalParticipantes de alguna de las categorías
                if (!bicicleta) {
                    System.out.println("No hay bicicletas en carrera");
                }
                if (!patinete) {
                    System.out.println("No hay patinetes en carrera");
                }
                if (!corredor) {
                    System.out.println("No hay corredores en carrera");
                }
            } else {
                System.out.println("-->> La carrera no ha finalizado");
            }
        } else {
            System.out.println("No quedan participantes en la carrera");
        }
    }

    public static void mostrarPosiciónMasJoven() {
        int menorEdad, posicion = 0, edad;
        if (numActualparticipantes > 0) {
            if (terminada) {
                carrera = ordenarArrayPorDistancia();
                if (carrera.get(0) instanceof Vehiculo) {
                    menorEdad = ((Vehiculo) carrera.get(0)).getConductor().getEdad();
                } else {
                    menorEdad = ((Persona) carrera.get(0)).getEdad();
                }
                for (int i = 1; i < carrera.size(); i++) {
                    if (carrera.get(i) instanceof Vehiculo) {
                        edad = ((Vehiculo) carrera.get(i)).getConductor().getEdad();
                    } else {
                        edad = ((Persona) carrera.get(0)).getEdad();
                    }
                    if (edad < menorEdad) {
                        menorEdad = edad;
                        posicion = i;
                    }
                }
                System.out.println("Posición final del participante más joven");
                System.out.println("Posición: " + (posicion + 1));
                System.out.println(carrera.get(posicion));

            } else {
                System.out.println("-->> La carrera no ha finalizado");
            }
        } else {
            System.out.println("No quedan participantes en la carrera");
        }
    }

    //ordena por distancia recorrida de mayor a menor
    public static ArrayList<Carrera> ordenarArrayPorDistancia() {
        ArrayList<Carrera> carreraOrdenada = new ArrayList<>(carrera);///--->>> se crea un nuevo ArrayList copia de carrera
        Collections.sort(carreraOrdenada, new Comparator<Carrera>() {

            @Override
            public int compare(Carrera t, Carrera t1) {
                return t1.obtenerDistanciaRecorrida() - t.obtenerDistanciaRecorrida();
            }

        });
        return carreraOrdenada;
    }
}
