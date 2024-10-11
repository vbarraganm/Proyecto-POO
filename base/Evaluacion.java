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

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getPuntuacionMax() {
        return puntuacionMax;
    }

    public void setPuntuacionMax(double puntuacionMax) {
        this.puntuacionMax = puntuacionMax;
    }

    public double getPuntuacionMin() {
        return puntuacionMin;
    }

    public void setPuntuacionMin(double puntuacionMin) {
        this.puntuacionMin = puntuacionMin;
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Información de evaluación: ");
        System.out.println("La evaluación es de tipo " + tipo);
        System.out.println("La fecha de la evaluación es " + fecha);
        System.out.println("La puntuación máxima es " + puntuacionMax);
        System.out.println("La puntuación mínima es " + puntuacionMin);
    }
}