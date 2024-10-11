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

    public double getCalificacionFinal(){
        return CalificacionFinal;}

    public void setCalificacionFinal(double CalificacionFinal){
        this.CalificacionFinal = CalificacionFinal;}

    public String getNombre(){
        return Nombre;}
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;}
    
    public int getNumeroUnidades(){
        return NumeroUnidades;}

    public void setNumeroUnidades(int NumeroUnidades){
        this.NumeroUnidades = NumeroUnidades;}
    
     public String getProfesor(){
        return Profesor;}

    public void setProfesor(String Profesor){
        this.Profesor = Profesor;}
    
}
