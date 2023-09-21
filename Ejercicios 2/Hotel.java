import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crea un nuevo HashMap para almacenar las habitaciones
        HashMap<String, Habitacion> habitaciones = new HashMap<>();

        // Agrega dos habitaciones al HashMap
        Habitacion habitacion1 = new Habitacion("Individual", true, 2);
        Habitacion habitacion2 = new Habitacion("Doble", false, 4);
        habitaciones.put("Habitacion1", habitacion1);
        habitaciones.put("Habitacion2", habitacion2);

        // Imprime el número de habitaciones
        System.out.println("El número de habitaciones es: " + habitaciones.size());

        // Imprime las habitaciones
        for (Habitacion habitacion : habitaciones.values()) {
            System.out.println(habitacion);
        }

        // Pregunta al usuario el nombre de la habitación que desea reservar
        System.out.println("Ingrese el nombre de la habitación que desea reservar: ");
        String nombreHabitacion = System.console().readLine();

        // Encuentra la habitación en el HashMap
        Habitacion habitacion = habitaciones.get(nombreHabitacion);

        // Si la habitación existe, imprime su información
        if (habitacion != null) {
            System.out.println("La habitación " + habitacion.getNombre() + " es: ");
            System.out.println("Tipo: " + habitacion.getTipo());
            System.out.println("Fumador: " + habitacion.isFumador());
            System.out.println("Capacidad: " + habitacion.getCapacidad());
        } else {
            // Si la habitación no existe, imprime un mensaje de error
            System.out.println("La habitación no existe.");
        }
    }
}
