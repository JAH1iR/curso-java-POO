package Model;

/**
 * CONCEPTO: HERENCIA NIVEL 1
 * Usuario extiende de PersonaModel porque un usuario sigue siendo una persona.
 */
public class Usuario extends PersonaModel {
    // Atributos propios de un Usuario
    private int id;
    private String correo;
    private String contraseña;
    private String fechaRegistro;
    private boolean estado; // true = activo, false = inactivo

    // Constructor con todos los atributos (incluyendo los de Persona)
    public Usuario(String cedula, String nombre, int edad, int id, String correo, String contraseña, String fechaRegistro, boolean estado) {
        // 'super' envía la cédula, nombre y edad a PersonaModel
        super(cedula, nombre, edad);
        this.id = id;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}