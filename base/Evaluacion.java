import java.time.LocalDateTime;

public class Evaluacion {
    
    // Propiedades
    private String tipo;
    private LocalDateTime fecha;
    private double puntuacionMax;
    private double puntuacionMin;

    // Constructor por defecto
    public Evaluacion() {
        this.tipo = "Tipo de evaluación no disponible";
        this.fecha = LocalDateTime.now();
        this.puntuacionMax = 0;
        this.puntuacionMin = 0;
    }
    
    // Constructor con parámetros
    public Evaluacion(String tipo, LocalDateTime fecha, double puntuacionMax, double puntuacionMin) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.puntuacionMax = puntuacionMax;
        this.puntuacionMin = puntuacionMin;
    }
}