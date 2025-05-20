// Creamos la clase Nacional que hereda de Producto
// y representa un producto nacional.
public class Nacional extends Producto {
    private String ciudadFrabricacion;

    /**
     * Constructor de la clase Nacional.
     *
     * @param id       Identificador del producto.
     * @param nombre   Nombre del producto.
     * @param stock    Stock del producto.
     * @param precio   Precio del producto.
     * @param ciudadFrabricacion Ciudad donde se fabrica.
     */
    public Nacional(int id, String nombre, int stock, double precio, String ciudadFrabricacion) {
        super(id, nombre, stock, precio);
        this.ciudadFrabricacion = ciudadFrabricacion;
    }
    /**
     * Devolvenmos el precio total (sin arancel) del producto nacional.
     */
    @Override
    public double getPrecioTotal() {
        return precio;
    }
}