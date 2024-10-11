public class Certificado {

    private String NombreEstudiante;
    private String NombrePrograma;
    private String NombreInstitucion;
    private int TiempoDuracion;

    public Certificado(){
        this.NombreEstudiante = "Nombre desconocido";  
        this.NombrePrograma = "Programa no asignado";
        this.NombreInstitucion = "Institucion desconocido";
        this.TiempoDuracion = 0;
    }
    
    public Certificado(String NombreEstudiante, String NombrePrograma, String NombreInstitucion, int TiempoDuracion){
        this.NombreEstudiante = NombreEstudiante;
        this.NombrePrograma = NombrePrograma;
        this.NombreInstitucion = NombreInstitucion;
        this.TiempoDuracion = TiempoDuracion;
    }
    
}
