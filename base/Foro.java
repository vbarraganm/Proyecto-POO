public class Foro {
    
    // Propiedades
    private String tema;
    private String descripcion;
    private String mensaje;

    // Constructor por defecto
    public Foro() {
        this.tema = "Tema desconocido";
        this.descripcion = "Descripción no disponible";
        this.mensaje = "No hay mensaje disponible";
    }
    
    // Constructor con parámetros
    public Foro(String tema, String descripcion, String mensaje) {
        this.tema = tema;
        this.descripcion = descripcion;
        this.mensaje = mensaje;
    }

    // Getters y setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}