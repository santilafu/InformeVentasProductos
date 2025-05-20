import java.util.ArrayList;
import java.util.Collections;
/**
 * Clase principal para probar la funcionalidad.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Añadimos productos nacionales
        productos.add(new Nacional(1, "Producto Nacional 1", 10, 100.0, "Madrid"));
        productos.add(new Nacional(2, "Producto Nacional 2", 5, 200.0, "Barcelona"));

        // Añadimos productos de exportación
        productos.add(new Exportacion(3, "Producto Exportación 1", 8, 150.0, 0.21));
        productos.add(new Exportacion(4, "Producto Exportación 2", 3, 300.0, 0.15));

        // Ordenamos los productos por precio total
        Collections.sort(productos);

        // Mostramos los productos ordenados
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}