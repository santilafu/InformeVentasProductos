# Proyecto: Informe Anual de Productos

Este proyecto corresponde a la unidad 7 del módulo de Programación del ciclo formativo de Desarrollo de Aplicaciones Multiplataforma (DAM). Su objetivo es aplicar conceptos avanzados de la programación orientada a objetos, como la herencia, la abstracción, las interfaces y el uso de colecciones.

## Descripción

Se ha desarrollado un sistema de representación de productos que permite calcular el precio total teniendo en cuenta si el producto es de tipo nacional o de exportación. Los productos se almacenan en una lista y se ordenan por su precio total mediante la implementación de la interfaz `Comparable`.

## Estructura del sistema

### Clases

- `Producto` (abstracta):  
  Clase base que contiene atributos comunes como `id`, `nombre`, `stock` y `precio`.  
  Incluye el método abstracto `getPrecioTotal()` y la implementación de `compareTo()` para permitir la ordenación por precio.

- `Nacional`:  
  Hereda de `Producto`. Añade el atributo `ciudadFabricacion`. El precio total es igual al precio base.

- `Exportacion`:  
  Hereda de `Producto`. Añade el atributo `arancel`. El precio total se calcula incrementando el precio base en función del arancel.

- `Main`:  
  Clase principal que crea una lista de productos, la rellena con instancias de ambas subclases, ordena la lista y muestra el resultado por consola.

## Ejemplo de ejecución

El siguiente fragmento corresponde al contenido de `Main.java`:

```java
ArrayList<Producto> productos = new ArrayList<>();

productos.add(new Nacional(1, "Producto Nacional 1", 10, 100.0, "Madrid"));
productos.add(new Nacional(2, "Producto Nacional 2", 5, 200.0, "Barcelona"));
productos.add(new Exportacion(3, "Producto Exportación 1", 8, 150.0, 0.21));
productos.add(new Exportacion(4, "Producto Exportación 2", 3, 300.0, 0.15));

Collections.sort(productos);

for (Producto producto : productos) {
    System.out.println(producto);
}
