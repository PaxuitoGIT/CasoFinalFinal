package CasoIntegrador;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    private static ArrayList<UserAccount> userList;

    public static void main(String[] args) {
        // Cargar lista de usuarios desde un archivo al iniciar el programa
        userList = cargarUsuariosDesdeArchivo("usuarios.txt");

        boolean salir = false;
        while (!salir) {
            System.out.println("1. Cargar usuario en memoria");
            System.out.println("2. Publicar tweet");
            System.out.println("3. Ordenar usuarios por email ascendente");
            System.out.println("4. Salir");
            int opcion = Utils.leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    cargarUsuarioEnMemoria();
                    break;
                case 2:
                    publicarTweet();
                    break;
                case 3:
                    ordenarUsuariosPorEmail();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }

    // Método para cargar usuarios desde un archivo y almacenarlos en una lista
    private static ArrayList<UserAccount> cargarUsuariosDesdeArchivo(String fileName) {
        ArrayList<UserAccount> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea en email y alias usando el espacio como delimitador
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String email = parts[0];
                    String alias = parts[1];
                    // Crear un nuevo objeto UserAccount y agregarlo a la lista
                    usuarios.add(new UserAccount(alias, email));
                } else {
                    // Manejar líneas incorrectas o mal formateadas
                    System.out.println("Línea incorrecta en el archivo: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return usuarios;
    }

    // Función para cargar un usuario en memoria mediante búsqueda secuencial
    private static UserAccount cargarUsuarioEnMemoria() {
        String alias = Utils.leerCadena("Ingrese el alias del usuario a cargar: ");
        UserAccount usuario = buscarUsuarioPorAlias(alias);
        if (usuario != null) {
            System.out.println("Usuario cargado en memoria: " + usuario);
        } else {
            System.out.println("El usuario no se encontró en la lista.");
        }
        return usuario;
    }

    // Función para buscar un usuario por alias
    private static UserAccount buscarUsuarioPorAlias(String alias) {
        for (UserAccount user : userList) {
            if (user.getAlias().equals(alias)) {
                return user;
            }
        }
        return null;
    }

    // Función para publicar un tweet por el usuario cargado en memoria
    private static void publicarTweet() {
        UserAccount usuario = cargarUsuarioEnMemoria();
        String mensaje = Utils.leerCadena("Ingrese el mensaje del tweet: ");
        try {
            if (mensaje.length() > 140) {
                throw new IllegalArgumentException("El tweet no puede exceder los 140 caracteres.");
            }
            usuario.tweet(new Tweet(mensaje, usuario));
            System.out.println("Tweet publicado correctamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al publicar el tweet: " + e.getMessage());
        }
    }

    // Función para ordenar los usuarios por email de forma ascendente
    private static void ordenarUsuariosPorEmail() {
        Collections.sort(userList, Comparator.comparing(UserAccount::getEmail));
        System.out.println("Usuarios ordenados por email (ascendente):");
        for (UserAccount user : userList) {
            System.out.println(user);
        }
    }
}
