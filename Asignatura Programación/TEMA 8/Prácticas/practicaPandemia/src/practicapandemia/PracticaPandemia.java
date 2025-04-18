/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapandemia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author zerkje
 */
public class PracticaPandemia {

    static Random rnd = new Random();
    static ArrayList<Analizable> poblacion = new ArrayList<>();
    static int poblacionTotal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearPoblacion();
    }

    public static void crearPoblacion() {
        int civiles = UtilidadesInput.leerEnteroEnRangoMin("Introduce tamaño de la población civil (>=50): ", "Error: Tamaño mínimo debe ser 50", 50);
        int sanitarios = UtilidadesInput.leerEnteroEnRangoMin("Introduce número de sanitarios (>=0): ", "Error: Cantidad de sanitarios no puede ser negativa.", 0);
        int personalSeguridad = UtilidadesInput.leerEnteroEnRangoMin("Introduce número de personal de seguridad (>=0): ", "Error: Cantidad de personal de seguridad no puede ser negativa.", 0);
        int mascotas = UtilidadesInput.leerEnteroEnRangoMin("Introduce número de mascotas(>=0)", "Error: Cantidad de mascotas no puede ser negativa.", 0);
        poblacionTotal = civiles + sanitarios + personalSeguridad + mascotas;

        for (int i = 0; i < civiles; i++) {
            Persona civil = agregarPersona(TipoPersona.CIVIL);
            poblacion.add(civil);
        }

        for (int i = 0; i < sanitarios; i++) {
            Sanitario sanitario = agregarPersona(TipoPersona.SANITARIO);
            poblacion.add(sanitario);
        }

        for (int i = 0; i < personalSeguridad; i++) {
            Seguridad seguridad = agregarPersona(TipoPersona.SEGURIDAD);
            poblacion.add(seguridad);
        }

        for (int i = 0; i < mascotas; i++) {
            Mascota mascota = agregarMascota();
            poblacion.add(mascota);
        }
    }

    /*
    Este bloque hace uso de Generics para refactorizar el código que anteriormente tenía duplicado
    al crear distintos tipos de Persona y métodos para cada caso (civil, sanitario, seguridad).
    
    El tipo concreto se decide usando el switch, pero en realidad la flexibilidad reside en el uso de <T extends Persona>,
    consiguiendo así reutilizar la misma lógica para devolver tanto una Persona como cualquiera de sus
    clases hijas, según el contexto.
    
    El casting final a (T) es importante, ya que sin él el compilador no sabría qué tipo específico retornar.
     */
    public static <T extends Persona> T agregarPersona(TipoPersona tipo) {
        String id;
        do {
            id = Generador.generarIdPersona();
        } while (existeIdPersona(id));
        Persona nueva = switch (tipo) {
            case CIVIL ->
                new Persona(id, Generador.generarAñoNacCivil(), Generador.generarGenero(), Generador.generarEsSintomatico());
            case SANITARIO ->
                new Sanitario(id, Generador.generarAñoNacSanitario(), Generador.generarGenero(), Generador.generarEsSintomatico(), Generador.generarTipoSanitario());
            case SEGURIDAD ->
                new Seguridad(id, Generador.generarAñoNacSeguridad(), Generador.generarGenero(), Generador.generarEsSintomatico(), Generador.generTipoSeguridad());
        };
        return (T) nueva;
    }

    public static Mascota agregarMascota() {
        String id;
        do {
            id = Generador.generarIdAnimal();
        } while (existeIdAnimal(id));
        return new Mascota(id, Generador.geneTipoMascota());
    }

    public static boolean existeIdPersona(String id) {
        if (poblacion == null || poblacion.isEmpty()) {
            return false;
        }

        for (Analizable habitante : poblacion) {
            if (habitante instanceof Persona p) {
                if (p.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean existeIdAnimal(String id) {
        if (poblacion == null || poblacion.isEmpty()) {
            return false;
        }

        for (Analizable habitante : poblacion) {
            if (habitante instanceof Animal a) {
                if (a.getId().equals(id)) {
                    return true;
                }
            }
        }
        return false;
    }

}
