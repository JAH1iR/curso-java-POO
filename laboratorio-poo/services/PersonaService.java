package services;
import Model.PersonaModel; // Importamos el modelo para poder usarlo

public class PersonaService {
    
    public boolean esMayorDeEdad(PersonaModel persona) {
        return persona.getEdad() >= 18;
    }

    public boolean esMenorDeEdad(PersonaModel persona) {
        return persona.getEdad() < 18;
    }

    public boolean esAdultoMayor(PersonaModel persona) {
        return persona.getEdad() >= 60;
    }
}