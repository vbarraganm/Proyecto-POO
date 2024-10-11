import java.time.LocalDateTime;

public class Principal {
    
public static void main(String[] args) {
        
        Profesor profesor1 = new Profesor();
        Examen examen1 = new Examen();
        Curso curso1 = new Curso();
        Certificado certificado1 = new Certificado();
        
        Profesor profesor2 = new Profesor("P4930", "Juan David Alzate", 33, "Álgebra");
        Examen examen2 = new Examen("Matrices", 2, 3.4, LocalDateTime.of(2024, 10, 10, 14,30), LocalDateTime.of(2024, 10, 10, 15, 30), 45);
        Curso curso2 = new Curso(4.3, "Álgebra", 5, "Juan David Alzate");
        Certificado certificado2 = new Certificado("Valentina Barragán", "Ingeniería de Software", "Universidad de Cataluña", 10);

        System.out.println("***** Plataforma 1 *****");
        System.out.println("");
        profesor1.mostrarDatos();
        System.out.println("");
        examen1.mostrarDatos();
        System.out.println("");
        curso1.mostrarDatos();
        System.out.println("");
        certificado1.mostrarDatos();
        
        System.out.println("");

        System.out.println("***** Plataforma 2 *****");
        System.out.println("");
        profesor2.mostrarDatos();
        System.out.println("");
        examen2.mostrarDatos();
        System.out.println("");
        curso2.mostrarDatos();
        System.out.println("");
        certificado2.mostrarDatos();
        System.out.println("");

}
}
