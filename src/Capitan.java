public class Capitan {
    private String nombre;
    private String apellido;
    private String matriculaNavegacion;

    public Capitan(String apellido, String nombre, String matriculaNavegacion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void setMatriculaNavegacion(String matriculaNavegacion) {
        this.matriculaNavegacion = matriculaNavegacion;
    }
}
