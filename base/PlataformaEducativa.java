import java.time.LocalDateTime;

public class PlataformaEducativa {
    
    // Propiedades
    private String nombrePlataforma;
    private String url;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;

    // Constructor por defecto
    public PlataformaEducativa() {
        this.nombrePlataforma = "Nombre de plataforma desconocido";
        this.url = "URL desconocido";
    }

    // Constructor con parámetros
    public PlataformaEducativa(String nombrePlataforma, String url) {
        this.nombrePlataforma = nombrePlataforma;
        this.url = url;
    }
}
