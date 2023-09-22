

public class Main {

    public static void main(String[] args) {

       
        HashMap<String, Habitacion> habitaciones = new HashMap<>();

        
        Habitacion habitacion1 = new Habitacion("Individual", true, 2);
        Habitacion habitacion2 = new Habitacion("Doble", false, 4);
        habitaciones.put("Habitacion1", habitacion1);
        habitaciones.put("Habitacion2", habitacion2);

        System.out.println("El número de habitaciones es: " + habitaciones.size());

       
        for (Habitacion habitacion : habitaciones.values()) {
            System.out.println(habitacion);
        }

        
        System.out.println("Ingrese el nombre de la habitación que desea reservar: ");
        String nombreHabitacion = System.console().readLine();

       
        Habitacion habitacion = habitaciones.get(nombreHabitacion);

        
        if (habitacion != null) {
            System.out.println("La habitación " + habitacion.getNombre() + " es: ");
            System.out.println("Tipo: " + habitacion.getTipo());
            System.out.println("Fumador: " + habitacion.isFumador());
            System.out.println("Capacidad: " + habitacion.getCapacidad());
        } else {
            
            System.out.println("La habitación no existe.");
        }
    }
}
