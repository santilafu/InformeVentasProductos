/**
 * Creamos la clase exportaciones que hereda de Producto
 * en la que tendremos un incremento de precio por los aranceles
 */
public class Exportacion extends Producto{
    private double arancel; // porcentaje de arancel, pòr ejemplo 0.21 para un 21%

    /**
     * Constructor de la clase Exportacion.
     *
     * @param id       Identificador del producto.
     * @param nombre   Nombre del producto.
     * @param stock    Stock del producto.
     * @param precio   Precio del producto.
     * @param arancel  Porcentaje de arancel aplicado al producto.
     */
    public Exportacion(int id, String nombre, int stock, double precio, double arancel) {
        super(id, nombre, stock, precio);
        this.arancel = arancel;
    }
    /**
     * Devolvemos el precio total (con arancel) del producto de exportación.
     */
    @Override
    public double getPrecioTotal() {
        return precio + (precio * arancel);
    }
    @Override
    public String toString(){
        return super.toString() + " (+ " + (arancel * 100) + "% arancel)";
    }
}