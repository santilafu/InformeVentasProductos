/**
 * Creamos la clase abstracta representando un Producto generico.
 */
public abstract class Producto implements Comparable<Producto> {
    protected int id;
    protected String nombre;
    protected int stock;
    protected double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param id     Identificador del producto.
     * @param nombre Nombre del producto.
     * @param stock  Stock del producto.
     * @param precio Precio del producto.
     */
    public Producto(int id, String nombre, int stock, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }
    /**
     * Método abstracto para obtener el precio total (con arancel o sin arancel) del producto.
        * @return Precio total del producto.
        */
    public abstract double getPrecioTotal();
    /**
     * Implementacion Comparable para ordenar productos por precio.
     */
    @Override
    public int compareTo (Producto otro){
        return Double.compare(this.getPrecioTotal(), otro.getPrecioTotal());
    }
    @Override
    public String toString(){
        return nombre + " - Precio final: " + getPrecioTotal() + "€ - Stock: " + stock;

    }
}