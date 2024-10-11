public class Estudiante {
    
    // Propiedades
    private String nombreEstudiante;
    private String codigo;
    private String correoElectronico;
    private double promedio;

    // Constructor por defecto
    public Estudiante() {
        this.nombreEstudiante = "Nombre de estudiante desconocido";
        this.codigo = "Código desconocido";
        this.correoElectronico = "Correo electrónico desconocido";
        this.promedio = 0;
    }
    
    // Constructor con parámetros
    public Estudiante(String nombreEstudiante, String codigo, String correoElectronico, double promedio) {
        this.nombreEstudiante = nombreEstudiante;
        this.codigo = codigo;
        this.correoElectronico = correoElectronico;
        this.promedio = promedio;
    }

    // Getters y setters

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}