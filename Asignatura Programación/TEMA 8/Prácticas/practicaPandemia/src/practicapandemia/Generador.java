/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapandemia;

import java.util.Random;

/**
 *
 * @author zerkje
 */
public class Generador {

    private static final Random rnd = new Random();
    private static final int ANYO_ACTUAL = 2030;

    private static final int EDAD_MIN_SANITARIO = 18;
    private static final int EDAD_MAX_SANITARIO = 65;

    private static final int EDAD_MIN_SEGURIDAD = 18;
    private static final int EDAD_MAX_SEGURIDAD = 65;

    private static final int ANYO_MIN_CIVIL = ANYO_ACTUAL - 110;
    private static final int ANYO_MAX_CIVIL = ANYO_ACTUAL;

    private static final int ANYO_MIN_SANITARIO = ANYO_ACTUAL - EDAD_MAX_SANITARIO;
    private static final int ANYO_MAX_SANITARIO = ANYO_ACTUAL - EDAD_MIN_SANITARIO;

    private static final int ANYO_MIN_SEGURIDAD = ANYO_ACTUAL - EDAD_MAX_SEGURIDAD;
    private static final int ANYO_MAX_SEGURIDAD = ANYO_ACTUAL - EDAD_MIN_SEGURIDAD;

    public static int generarAñoNacCivil() {
        return rnd.nextInt(ANYO_MIN_CIVIL, ANYO_MAX_CIVIL + 1);
    }

    public static int generarAñoNacSanitario() {
        return rnd.nextInt(ANYO_MIN_SANITARIO, ANYO_MAX_SANITARIO + 1);
    }

    public static int generarAñoNacSeguridad() {
        return rnd.nextInt(ANYO_MIN_SEGURIDAD, ANYO_MAX_SEGURIDAD + 1);
    }

    public static String generarIdPersona() {
        StringBuilder sb = new StringBuilder();
        sb.append((char) rnd.nextInt('A', 'Z' + 1));
        sb.append(rnd.nextInt(10000, 100000));
        return sb.toString();
    }

    public static String generarIdAnimal() {
        StringBuilder sb = new StringBuilder();
        sb.append((char) rnd.nextInt('A', 'Z' + 1));
        sb.append((char) rnd.nextInt('A', 'Z' + 1));
        sb.append(rnd.nextInt(10, 100));
        return sb.toString();
    }

    public static Genero generarGenero() {
        Genero[] generos = Genero.values();
        return generos[rnd.nextInt(generos.length)];
    }

    public static boolean generarEsSintomatico() {
        return rnd.nextBoolean();
    }

    public static TipoSanitario generarTipoSanitario() {
        TipoSanitario[] tiposSanitarios = TipoSanitario.values();
        return tiposSanitarios[rnd.nextInt(tiposSanitarios.length)];
    }

    public static TipoSeguridad generTipoSeguridad() {
        TipoSeguridad[] tiposSeguridad = TipoSeguridad.values();
        return tiposSeguridad[rnd.nextInt(tiposSeguridad.length)];
    }

    public static TipoMascota geneTipoMascota() {
        TipoMascota[] tiposMascota = TipoMascota.values();
        return tiposMascota[rnd.nextInt(tiposMascota.length)];
    }

}
