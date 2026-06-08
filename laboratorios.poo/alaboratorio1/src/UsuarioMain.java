import Model.Administrador;
import services.UsuarioService;

/**
 * Clase Principal para probar la herencia de Usuario y Administrador.
 */
public class UsuarioMain {
    public static void main(String[] args) {
        
        // 1. Creamos un Administrador
        // Nota cómo enviamos datos para Persona (nombre, cedula), Usuario (correo, pass) 
        // y Administrador (nivel, area) en un solo constructor.
        Administrador admin = new Administrador(
            "8-888-888",           // Cédula (Persona)
            "Erick Administrador", // Nombre (Persona)
            25,                    // Edad (Persona)
            1,                     // ID (Usuario)
            "admin@empresa.com",   // Correo (Usuario)
            "12345",               // Contraseña (Usuario)
            "01/01/2024",          // Fecha Registro (Usuario)
            true,                  // Estado (Usuario)
            "Nivel Dios",          // Nivel Acceso (Administrador)
            "Sistemas",            // Área Responsable (Administrador)
            10                     // Usuarios gestionados (Administrador)
        );

        // 2. Instanciamos el servicio
        UsuarioService servicio = new UsuarioService();

        System.out.println("--- PRUEBA DE HERENCIA Y SERVICIOS ---");
        
        // 3. Probar cambio de estado (Usa un método de la clase abuela Persona: getNombre)
        servicio.cambiarEstado(admin, false);

        // 4. Probar validación (Login)
        // El servicio pedirá datos por consola y los comparará con el objeto 'admin'
        servicio.validarAdministrador(admin);

        System.out.println("\nFin de la prueba.");
    }
}