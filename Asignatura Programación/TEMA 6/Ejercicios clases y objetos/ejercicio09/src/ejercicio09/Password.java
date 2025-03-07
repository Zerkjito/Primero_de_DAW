/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zerkje
 */
public class Password {

    private Random rnd = new Random();
    private Scanner sc = new Scanner(System.in);
    private String pass;

    public Password() {
        this.pass = generarPass();
    }

    private String generarPass() {
        StringBuilder sb = new StringBuilder();
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz._";
        for (int i = 0; i < 8; i++) {
            sb.append(caracteres.charAt(rnd.nextInt(0, caracteres.length())));
        }
        return sb.toString();
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean esFuerte(String password) {
        Pattern pattern = Pattern.compile("^(?=(.*[a-z]){2,})(?=(.*[A-Z]){2,})(?=(.*[\\d]){1,})(?=(.*[._]){1,}).{8,}$");
        /* EXPLICACIÓN DE REGEX -> (?=...) son
        lookahead assertions, que son esenciales para ir moviendose por la cadena sin consumir caracteres o avanazar la lectura, de modo que el
        orden no sea un factor prioritario sino encontrar el patrón con los filtros aplicados. El .* indica que puede haber cualquier cantidad de 
        caracteres antes de encontrarse el patron especificado.
         */
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean modificarContrasenya() {
        String newPass;
        System.out.println("\nPassword actual: " + this.pass);
        System.out.print("Introduce la nueva password: ");
        newPass = sc.nextLine();
        if (esFuerte(newPass)) {
            this.pass = newPass;
            System.out.println("Password actualizada correctamente.");
            return true;
        }
        System.out.println("Error: Password no es fuerte.");
        return false;
    }

    @Override
    public String toString() {
        return "Password generada: " + pass;
    }

}
