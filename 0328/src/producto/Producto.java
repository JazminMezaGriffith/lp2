package producto;
public class Producto implements Comparable<Producto>{
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;
    
    // Constructor que acepta todos los atributos
    public Producto(String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadEnStock;
    }

    // Métodos getters y setters para todos los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    
    // Interfaz Comparable para poder ordenar los productos por precio
    @Override
    public int compareTo(Producto o) {
        if (this.precio < o.getPrecio()) {
            return -1;
        } else if (this.precio > o.getPrecio()) {
            return 1;
        } else {
            return 0;
        }
    }
}
