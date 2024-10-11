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

    public String getCodigo(){
        return Codigo;}

    public void setCodigo(String Codigo){
        this.Codigo = Codigo;}

    public String getNombre(){
        return Nombre;}
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;}

    public int getEdad(){
        return Edad;}
    
    public void setEdad(int Edad){
        this.Edad = Edad;}
    
    public String getNombreAsignatura(){
        return NombreAsignatura;}

    public void setNombreAsignatura(String NombreAsignatura){
        this.NombreAsignatura = NombreAsignatura;}
    
    public void mostrarDatos(){
        System.out.println("Informacion del profesor");
        System.out.println("El codigo del profesor es: " + Codigo);
        System.out.println("El nombre del profesor es: " + Nombre);
        System.out.println("La edad del profesor es de: " + Edad);
        System.out.println("El Nombre de la asignatura que dicta el profesor es: " + NombreAsignatura);
    }
}
