
public class U {

    public static void U(String[] args) {

        // Crea un nuevo HashMap para almacenar las estadísticas
        HashMap<String, Integer> estadisticas = new HashMap<>();

        // Crea una lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();

        // Crea dos usuarios
        Usuario usuario1 = new Usuario("1234567890", "Estudiante");
        Usuario usuario2 = "9876543210", "Directivo");

        // Agrega los usuarios a la lista
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        // Itera sobre la lista de usuarios
        for (Usuario usuario : usuarios) {

            // Obtén el tipo de usuario
            String tipoUsuario = usuario.getTipo();

            // Si el usuario es estudiante
            if (tipoUsuario.equals("Estudiante")) {

                // Incrementa el contador de usuarios estudiantes
                estadisticas.put("Estudiantes", estadisticas.get("Estudiantes") + 1);

            } else {

                // Incrementa el contador de usuarios directivos
                estadisticas.put("Directivos", estadisticas.get("Directivos") + 1);
            }
        }

        // Imprime las estadísticas
        for (String tipoUsuario : estadisticas.keySet()) {
            System.out.println("Cantidad de usuarios " + tipoUsuario + ": " + estadisticas.get(tipoUsuario));
        }
    }
}

class Usuario {

    private String cedula;
    private String tipo;

    public Usuario(String cedula, String tipo) {
        this.cedula = cedula;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


