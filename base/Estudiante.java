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
}