import java.time.LocalDateTime;

public class Principal {
     public static void main(String[] args) {
        
        PlataformaEducativa plataforma1 = new PlataformaEducativa();
        Profesor profesor1 = new Profesor();
        Foro foro1 = new Foro();
        Examen examen1 = new Examen();
        Evaluacion evaluacion1 = new Evaluacion();
        Estudiante estudiante1 = new Estudiante();
        Curso curso1 = new Curso();
        Certificado certificado1 = new Certificado();
        
        PlataformaEducativa plataforma2 = new PlataformaEducativa("Universidad de Cataluña", "www.unicataluna.edu.es");
        Profesor profesor2 = new Profesor("P4930", "Juan David Alzate", 33, "Álgebra");
        Foro foro2 = new Foro("Matrices", "Exploraremos los tipos de matrices", "Buenos días, alumnos, este foro es para socializar sus conocimientos basesen matrices.");
        Examen examen2 = new Examen("Matrices", 2, 3.4, LocalDateTime.of(2024, 10, 10, 14,30), LocalDateTime.of(2024, 10, 10, 15, 30), 45);
        Evaluacion evaluacion2 = new Evaluacion("Evaluación final 1er corte", LocalDateTime.of(2024, 10, 14, 20, 30), 5.0, 3.5);
        Estudiante estudiante2 = new Estudiante("Valentina Barragán", "E3802", "vbarragan@unicataluna.edu.es", 4.2);
        Curso curso2 = new Curso(4.3, "Álgebra", 5, "Juan David Alzate");
        Certificado certificado2 = new Certificado("Valentina Barragán", "Ingeniería de Software", "Universidad de Cataluña", 10);

        System.out.println("***** Plataforma 1 *****");
        System.out.println("");
        plataforma1.mostrarDatos();
        System.out.println("");
        profesor1.mostrarDatos();
        System.out.println("");
        foro1.mostrarDatos();
        System.out.println();
        examen1.mostrarDatos();
        System.out.println("");
        evaluacion1.mostrarDatos();
        System.out.println("");
        estudiante1.mostrarDatos();
        System.out.println("");
        curso1.mostrarDatos();
        System.out.println("");
        certificado1.mostrarDatos();
        
        System.out.println("");

        System.out.println("***** Plataforma 2 *****");
        System.out.println("");
        plataforma2.mostrarDatos();
        System.out.println();
        profesor2.mostrarDatos();
        System.out.println("");
        foro2.mostrarDatos();
        System.out.println();
        examen2.mostrarDatos();
        System.out.println("");
        evaluacion2.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos();
        System.out.println("");
        curso2.mostrarDatos();
        System.out.println("");
        certificado2.mostrarDatos();
        System.out.println("");
    }
}
