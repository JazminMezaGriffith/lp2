package estudiante;
public class EstudianteInternacional extends Estudiante {
    private String paisOrigen;

    public EstudianteInternacional(String nombre, String apellido, int edad, double notaPromedio, String paisOrigen) {
        super(nombre, apellido, edad, notaPromedio);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
