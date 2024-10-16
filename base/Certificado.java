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
    
    public String getNombreEstudiante(){
        return NombreEstudiante;}

    public void setNombreEstudiante(String NombreEstudiante){
        this.NombreEstudiante = NombreEstudiante;}

    public String getNombrePrograma(){
        return NombrePrograma;}
    
    public void setNombrePrograma(String NombrePrograma){
        this.NombrePrograma = NombrePrograma;}
    
    public String getNombreInstitucion(){
        return NombreInstitucion;}

    public void setNombreInstitucion(String NombreInstitucion){
        this.NombreInstitucion = NombreInstitucion;}
    
    public int getTiempoDuracion(){
        return TiempoDuracion;}

    public void setTiempoDuracion(int TiempoDuracion){
        this.TiempoDuracion = TiempoDuracion;}

    public void mostrarDatos(){
        System.out.println("Informacion del certificado");
        System.out.println("El nombre del estudiante es: " + NombreEstudiante);
        System.out.println("El nombre del programa es: " + NombrePrograma);
        System.out.println("El nombre de la institucion academica es: " + NombreInstitucion);
        System.out.println("El tiempo de duracion del curso (Semestre): " + TiempoDuracion);
    }

}
