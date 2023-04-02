package producto;
import java.util.Arrays;

public class Venta {
    // Arreglo de productos
    private Producto[] productos;
    private int numProductos;

    // Constructor de la clase Venta
    public Venta(int capacidadMaxima) {
        productos = new Producto[capacidadMaxima];
        numProductos = 0;
    }

    // métodos para agregar, eliminar y buscar productos por nombre
    public void agregarProducto(Producto producto) {
        productos[numProductos] = producto;
        numProductos++;
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                // Desplazar los elementos hacia la izquierda para eliminar el producto
                for (int j = i; j < numProductos - 1; j++) {
                    productos[j] = productos[j+1];
                }
                numProductos--;
                System.out.println("PRODUCTO ELIMINADO");
                return;
            }
        }
        System.out.println("No se encontró el producto con el nombre " + nombre);
    }

    public Producto buscarProducto(String nombre) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                System.out.println("PRODUCTO ENCONTRADO = " + "Nombre: " + productos[i].getNombre() + 
                    " | Descripción: " + productos[i].getDescripcion() + 
                    " | Cantidad en stock: " + productos[i].getCantidadStock() + 
                    " | Precio: " + productos[i].getPrecio());
                return productos[i];
            }
        }
        return null;
    }
    
    public void mostrarProductos(){
        Arrays.sort(productos);
        System.out.println("PRODUCTOS:");
        for (int i = 0; i < numProductos; i++) {
            System.out.println("- Nombre: " + productos[i].getNombre() + 
                    " | Descripción: " + productos[i].getDescripcion() + 
                    " | Cantidad en stock: " + productos[i].getCantidadStock() + 
                    " | Precio: " + productos[i].getPrecio());
        }
    }
}
