

public class carrito {

    public static void carrito(String[] args) {

        // Crea un nuevo HashMap para almacenar los productos
        HashMap<String, Producto> productos = new HashMap<>();

        // Crea una lista de productos
        List<Producto> productosCarrito = new ArrayList<>();

        // Crea dos productos
        Producto producto1 = new Producto("Producto1", 10000);
        Producto producto2 = new Producto("Producto2", 20000);

        // Agrega los productos al HashMap
        productos.put("Producto1", producto1);
        productos.put("Producto2", producto2);

        // Agrega los productos al carrito
        productosCarrito.add(producto1);
        productosCarrito.add(producto2);

        // Imprime el carrito
        for (Producto producto : productosCarrito) {
            System.out.println(producto);
        }

        // Calcula el precio total del carrito
        int precioTotal = 0;
        for (Producto producto : productosCarrito) {
            precioTotal += producto.getPrecio();
        }

        // Imprime el precio total
        System.out.println("El precio total es de " + precioTotal);
    }
}

class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
