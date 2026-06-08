package Model;

/**
 * CONCEPTO: HERENCIA NIVEL 2 (Multinivel)
 * Administrador extiende de Usuario.
 * Automáticamente hereda TODO lo de Usuario y PersonaModel.
 */
public class Administrador extends Usuario {
    // Atributos específicos del Administrador
    private String nivelAcceso;
    private String areaResponsable;
    private int cantidadUsuariosGestionados;

    // Constructor que invoca al padre (Usuario)
    public Administrador(String cedula, String nombre, int edad, int id, String correo, String contraseña, 
                         String fechaRegistro, boolean estado, String nivelAcceso, 
                         String areaResponsable, int cantidadUsuariosGestionados) {
        
        // super envía todos estos datos al constructor de Usuario
        super(cedula, nombre, edad, id, correo, contraseña, fechaRegistro, estado);
        
        // Inicializamos lo propio del admin
        this.nivelAcceso = nivelAcceso;
        this.areaResponsable = areaResponsable;
        this.cantidadUsuariosGestionados = cantidadUsuariosGestionados;
    }

    // Getters y Setters propios
    public String getNivelAcceso() { return nivelAcceso; }
    public void setNivelAcceso(String nivelAcceso) { this.nivelAcceso = nivelAcceso; }

    public String getAreaResponsable() { return areaResponsable; }
    public void setAreaResponsable(String areaResponsable) { this.areaResponsable = areaResponsable; }

    public int getCantidadUsuariosGestionados() { return cantidadUsuariosGestionados; }
    public void setCantidadUsuariosGestionados(int cantidadUsuariosGestionados) { this.cantidadUsuariosGestionados = cantidadUsuariosGestionados; }
}