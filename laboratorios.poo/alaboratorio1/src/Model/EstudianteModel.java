package Model;

/**
 * CONCEPTO: HERENCIA (EstudianteModel hereda de PersonaModel)
 * Esto significa que un Estudiante YA TIENE cédula, nombre y edad por ser una Persona.
 */
public class EstudianteModel extends PersonaModel {
    
    // Atributo específico de Estudiante
    private double nota;

    // CONCEPTO: Constructor Vacío - Llama al constructor de Persona para inicializar lo básico
    public EstudianteModel() {
        super(); // Llama al constructor de PersonaModel
    }

    /**
     * CONCEPTO: Constructor con Parámetros (Uso de Herencia)
     * param cedula (Heredado)
     * param nombre (Heredado)
     * param edad (Heredado)
     * param nota (Propio de Estudiante)
     */
    public EstudianteModel(String cedula, String nombre, int edad, double nota) {
        // 'super' envía los datos a la clase PersonaModel para que ella los maneje
        super(cedula, nombre, edad);
        this.nota = nota; // Asignamos el atributo que es exclusivo de Estudiante
    }

    // CONCEPTO: Encapsulamiento - Métodos para acceder a la nota de forma segura
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}