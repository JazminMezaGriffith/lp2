package estudiante;
public class RegistroEstudiantes {
    // Arreglo de estudiantes
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    
    // Getters y setters
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }
    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public RegistroEstudiantes(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        cantidadEstudiantes = 0;
    }
    
    // Métodos para agregar, eliminar y buscar estudiantes por nombre
    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("No se puede agregar el estudiante, la capacidad está llena.");
        }
    }

    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                for (int j = i; j < cantidadEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                cantidadEstudiantes--;
                System.out.println("ESTUDIANTE ELIMINADO");
                return;
            }
        }
        System.out.println("No se encontró el estudiante con el nombre " + nombre);
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                System.out.println("ESTUDIANTE ENCONTRADO = " + "Nombre: " + estudiantes[i].getNombre() + 
                    " | Apellido: " + estudiantes[i].getApellido() + 
                    " | Edad: " + estudiantes[i].getEdad() + 
                    " | Nota promedio: " + estudiantes[i].getNotaPromedio());
                return estudiantes[i];
            }
        }
        System.out.println("No se encontró el estudiante con el nombre " + nombre);
        return null;
    }
    
    public void mostrarEstudiantes(){
        System.out.println("ESTUDIANTES:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("- Nombre: " + estudiantes[i].getNombre() + 
                    " | Apellido: " + estudiantes[i].getApellido() + 
                    " | Edad: " + estudiantes[i].getEdad() + 
                    " | Nota promedio: " + estudiantes[i].getNotaPromedio());
            
            if (estudiantes[i] instanceof EstudianteInternacional estudianteInternacional) {
                System.out.println("    Es un estudiante internacional de " + estudianteInternacional.getPaisOrigen());
            }
        }
    }
}
