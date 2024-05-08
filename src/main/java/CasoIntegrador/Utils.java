package CasoIntegrador;

import java.util.Scanner;

public class Utils {
    private static Scanner scanner = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        return numero;
    }

    public static float leerFloat(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextFloat()) {
            System.out.print("Ingrese un número válido: ");
            scanner.next();
        }
        float numero = scanner.nextFloat();
        scanner.nextLine(); // Consumir el salto de línea
        return numero;
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}

