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

    public String getematica(){
        return Tematica;}

    public void setematica(String Tematica){
        this.Tematica = Tematica;}

    public int getNumeroIntentos(){
        return NumeroIntentos;}
    
    public void setNumeroIntentos(int NumeroIntentos){
        this.NumeroIntentos = NumeroIntentos;}

    public double getCalificacion(){
        return Calificacion;}
        
    public void setCalificacion(double Calificacion){
        this.Calificacion = Calificacion;}

    public LocalDateTime getHoraInicio(){
        return HoraInicio;}
            
    public void setHoraInicio(LocalDateTime HoraInicio){
        this.HoraInicio = HoraInicio;}

    public LocalDateTime getHoraCierre(){
        return HoraCierre;}
                
    public void setHoraCierre(LocalDateTime HoraCierre){
        this.HoraCierre = HoraCierre;}

    public int getTiempoLimite(){
        return TiempoLimite;}
                    
    public void setTiempoLimite(int  TiempoLimite){
        this.TiempoLimite = TiempoLimite;}
    
    public void mostrarDatos(){
        System.out.println("Informacion del Examen");
        System.out.println("La tematica del examen va hacer: " + Tematica);
        System.out.println("Los intentos permitidos para realizar el examen son: " + NumeroIntentos);
        System.out.println("La calificacion del examen es: " + Calificacion);
        System.out.println("La hora que inicia el examen es a las: " + HoraInicio);
        System.out.println("La hora que cierra el examen es a las: " + HoraCierre);
        System.out.println("El tiempo limite para realizar el examen es de (Minutos): " + TiempoLimite);
    }

}
