package LDP_Clase4;

import estudiante.Estudiante;
import estudiante.EstudianteInternacional;
import estudiante.RegistroEstudiantes;

import producto.Envio;
import producto.Producto;
import producto.Venta;

public class Main {
    public static void main(String[] args) {
        System.out.println("ACTIVIDAD N°1_______________________________________");
        RegistroEstudiantes registro = new RegistroEstudiantes(4);
        // Agregar estudiantes
        registro.agregarEstudiante(new Estudiante("María", "García", 19, 4.0));
        registro.agregarEstudiante(new Estudiante("Pedro", "Giménez", 23, 5.0));
        registro.agregarEstudiante(new EstudianteInternacional("Sofía", "López", 22, 4.5, "Colombia"));
        registro.agregarEstudiante(new EstudianteInternacional("Daniel", "Silva", 25, 3.5, "Brasil"));
        
        registro.mostrarEstudiantes();
        // Eliminar un estudiante
        registro.eliminarEstudiante("Sofía");
        // Buscar un estudiante
        registro.buscarEstudiante("Pedro");
        // Vuelvo a imprimir para verificar la eliminacion
        registro.mostrarEstudiantes();
        
        
        System.out.println("\n\nACTIVIDAD N°2_______________________________________");
        Venta venta = new Venta(4);
        // Agregar productos
        venta.agregarProducto(new Producto("Producto 1", "Descripción 1", 10.0, 5));
        venta.agregarProducto(new Producto("Producto 2", "Descripción 2", 20.0, 3));
        venta.agregarProducto(new Producto("Producto 3", "Descripción 3", 15.0, 8));
        venta.agregarProducto(new Producto("Producto 4", "Descripción 4", 12.0, 1));
        
        venta.mostrarProductos();
        // Eliminar un producto
        venta.eliminarProducto("Producto 4");
        // Buscar un producto
        venta.buscarProducto("Producto 1");
        // Vuelvo a imprimir para verificar la eliminacion
        venta.mostrarProductos();
        // Calcular costo de envio a una dirección en funcion de la distancia en km
        Envio envio = new Envio("Calle Falsa 123");
        envio.calcularCostoEnvio(25.0);
    }
}
