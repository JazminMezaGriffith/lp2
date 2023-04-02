package producto;
public class Envio {
    private String direccion;

    // Constructor de la clase Envio
    public Envio(String direccion) {
        this.direccion = direccion;
    }

    // Método para calcular el costo de envío en función de la distancia
    public double calcularCostoEnvio(double distancia) {
        double costo = 0.0;
        // Se establecen diferentes tarifas de costo de envío según la distancia recorrida
        if (distancia <= 10.0) {
            costo = 5.0;
        } else if (distancia > 10.0 && distancia <= 20.0) {
            costo = 8.0;
        } else if (distancia > 20.0 && distancia <= 50.0) {
            costo = 12.0;
        } else {
            costo = 15.0;
        }
        System.out.println("El costo de envío hasta " + direccion + " es de: $" + costo);
        return costo;
    }

    // Getters y setters
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
