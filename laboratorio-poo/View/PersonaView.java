package View;
import Model.PersonaModel;
import services.PersonaService;

public class PersonaView {
    public void mostrarDatos(PersonaModel p, PersonaService s) {
        System.out.println("REPORTE DE PERSONA");
        System.out.println("Cédula: " + p.getCedula());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("¿Es mayor de edad?: " + s.esMayorDeEdad(p));
        System.out.println("¿Es menor de edad?: " + s.esMenorDeEdad(p));
        System.out.println("¿Es adulto mayor?: " + s.esAdultoMayor(p));
        System.out.println("-------------------------");
    }
}