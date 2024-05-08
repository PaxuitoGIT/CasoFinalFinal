package CasoIntegrador;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}

