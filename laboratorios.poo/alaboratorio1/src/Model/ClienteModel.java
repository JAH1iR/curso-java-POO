package Model;

// CONCEPTO: HERENCIA (ClienteModel hereda de PersonaModel)
// Esto significa que un Cliente YA TIENE cédula, nombre y edad por ser una Persona.
public class ClienteModel extends PersonaModel {
    
    // Atributos específicos de Cliente
    // Nota: 'id' y 'nombre' ya no son necesarios aquí porque se heredan de PersonaModel
    private String correo;
    private double montoAcumuladoCompras;

    // CONCEPTO: Constructor Vacío - Llama al constructor de Persona para inicializar lo básico
    public ClienteModel() {
        super(); // Llama al constructor de PersonaModel
    }

    /**
     * CONCEPTO: Constructor con Parámetros (Uso de Herencia)
     *  cedula (Heredado de Persona)
     *  nombre (Heredado de Persona)
     *  edad (Heredado de Persona)
     *  correo (Propio de Cliente)
     *  montoAcumuladoCompras (Propio de Cliente)
     */
    public ClienteModel(String cedula, String nombre, int edad, String correo, double montoAcumuladoCompras) {
        // 'super' envía los datos comunes a la clase padre (PersonaModel)
        super(cedula, nombre, edad);
        this.correo = correo;
        this.montoAcumuladoCompras = montoAcumuladoCompras;
    }

    // CONCEPTO: Encapsulamiento - Métodos para acceder a los atributos propios de Cliente
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getMontoAcumuladoCompras() {
        return montoAcumuladoCompras;
    }

    public void setMontoAcumuladoCompras(double montoAcumuladoCompras) {
        this.montoAcumuladoCompras = montoAcumuladoCompras;
    }

    
}
