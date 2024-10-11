public class Curso {

    private double CalificacionFinal;
    private String Nombre;
    private int NumeroUnidades;
    private String Profesor;

    public Curso(){
        this.CalificacionFinal = 0;  
        this.Nombre = "Nombre desconocido";
        this.NumeroUnidades = 0;
        this.Profesor = "Profesor no asignado";
    }
    
    public Curso(double CalificacionFinal, String Nombre, int NumeroUnidades, String Profesor){
        this.CalificacionFinal = CalificacionFinal;
        this.Nombre = Nombre;
        this.NumeroUnidades = NumeroUnidades;
        this.Profesor = Profesor;
    }
    
}
