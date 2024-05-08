package CasoIntegrador;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<UserAccount> userList;

    public static void main(String[] args) {
        // Cargar lista de usuarios desde un archivo al iniciar el programa
        userList = cargarUsuariosDesdeArchivo("usuarios.txt");


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
    private static void cargarUsuarioEnMemoria() {
        String alias = Utils.leerCadena("Ingrese el alias del usuario a cargar: ");
        UserAccount usuario = buscarUsuarioPorAlias(alias);
        if (usuario != null) {
            System.out.println("Usuario cargado en memoria: " + usuario);
        } else {
            System.out.println("El usuario no se encontró en la lista.");
        }
    }
}
