package Model;

/**
 * CLASE PERSONA - Modelo de Datos
 * 
 * Esta clase representa a una persona con sus datos básicos.
 * Utiliza encapsulación (atributos privados) para proteger la información.
 * 
 * Concepto de Encapsulación: Los atributos son PRIVADOS para que no se accedan directamente.
 * En lugar de eso, usamos GETTERS y SETTERS como "guardianes" de los datos.
 */
// CONCEPTO: CLASE (La plantilla o molde que define cómo será una persona)
// CONCEPTO: ABSTRACCIÓN (Simplificamos una persona real a solo 3 datos: cedula, nombre y edad)
public class PersonaModel {
    
    // ============ 1. ATRIBUTOS (Propiedades de la clase) ============
    // Son PRIVADOS: solo se acceden a través de getters/setters
    // CONCEPTO: ENCAPSULAMIENTO (Uso de 'private' para proteger los datos)
    private String cedula;   // Identificación única de la persona
    private String nombre;   // Nombre completo de la persona
    private int edad;        // Edad en años

    // CONCEPTO: MÉTODOS (Funciones que definen el comportamiento de la clase)
    // ============ 2. CONSTRUCTORES ============
    
    /**
     * Constructor VACÍO (sin parámetros)
     * Útil cuando queremos crear un objeto y luego asignar valores con setters
     * Ejemplo: PersonaModel p = new PersonaModel(); // crea objeto vacío
     */
    public PersonaModel() {}

    /**
     * Constructor LLENO (con parámetros)
     * Se usa para crear un objeto con datos iniciales
     * Ejemplo: PersonaModel p = new PersonaModel("1234567", "Juan Pérez", 25);
     * 
     * cedula - número de identificación
     * nombre - nombre completo de la persona
     * edad - edad en años
     */
    public PersonaModel(String cedula, String nombre, int edad) {
        // "this" = se refiere al objeto actual para no confundir con los parámetros
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
       
    }

   
