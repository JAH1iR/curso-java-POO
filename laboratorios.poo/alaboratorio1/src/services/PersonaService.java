package services;
import Model.PersonaModel; // Importamos el modelo para poder usarlo

// CONCEPTO: CLASE (Clase de servicio que contiene la lógica de negocio)
public class PersonaService {
    
    public boolean esMayorDeEdad(PersonaModel persona) {
        // CONCEPTO: MÉTODOS (Operaciones que actúan sobre los datos del objeto)
        return persona.getEdad() >= 18;
    }

    public boolean esMenorDeEdad(PersonaModel persona) {
        return persona.getEdad() < 18;
    }

    public boolean esAdultoMayor(PersonaModel persona) {
        return persona.getEdad() >= 60;
    }
}