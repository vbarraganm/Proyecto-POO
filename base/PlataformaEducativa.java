public class PlataformaEducativa {
    
    // Propiedades
    private String nombrePlataforma;
    private String url;

    // Constructor por defecto
    public PlataformaEducativa() {
        this.nombrePlataforma = "Nombre de plataforma desconocido";
        this.url = "URL desconocido";
    }

    // Constructor con parámetros
    public PlataformaEducativa(String nombrePlataforma, String url) {
        this.nombrePlataforma = nombrePlataforma;
        this.url = url;
    }

    // Getters y setters
    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Método para mostrar los datos
    public void mostrarDatos(){
        System.out.println("Información de la plataforma:");
        System.out.println("Nombre de la plataforma: " + nombrePlataforma);
        System.out.println("URL: " + url);
    }   
}
