import java.time.LocalDateTime;

public class Examen {

    private String Tematica;
    private int NumeroIntentos;
    private double Calificacion;
    private LocalDateTime HoraInicio;
    private LocalDateTime HoraCierre;
    private int TiempoLimite;

    public Examen(){
        this.Tematica = "Tematica no asignada";  
        this.NumeroIntentos = 0;
        this.Calificacion = 0;
        this.HoraInicio = LocalDateTime.now();
        this.HoraInicio = LocalDateTime.now();
        this.TiempoLimite = 0;
    }
    
    public Examen(String Tematica, int NumeroIntentos, double Calificacion, LocalDateTime HoraInicio, LocalDateTime HoraCierre, int TiempoLimite){
        this.Tematica = Tematica;
        this.NumeroIntentos = NumeroIntentos;
        this.Calificacion = Calificacion;
        this.HoraInicio = HoraInicio;
        this.HoraCierre = HoraCierre;
        this.TiempoLimite = TiempoLimite;
    }
    
}
