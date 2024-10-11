public class Profesor {

    private String Codigo;
    private String Nombre;
    private int Edad;
    private String NombreAsignatura;

    public Profesor(){
        this.Codigo = "Codigo no asignado";  
        this.Nombre = "Nombre desconocido";
        this.Edad = 0;
        this.NombreAsignatura = "Asignatura no asignda";
    }
    
    public Profesor(String Codigo, String Nombre, int Edad, String NombreAsignatura){
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NombreAsignatura = NombreAsignatura;
    }
    
}
