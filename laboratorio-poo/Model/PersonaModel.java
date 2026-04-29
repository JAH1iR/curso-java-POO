package Model;

public class PersonaModel { // Clase que representa a una persona con sus datos básicos y la primera letra en mayúscula, es una plantilla para crear objetos de tipo Persona
    
    private String cedula;// 1. Atributos (Privados para proteger los datos),esto sirve para que solo se pueda acceder a ellos a través de métodos específicos (getters y setters)
    private String nombre;
    private int edad;

    public PersonaModel (){}//contructor vacio

    // 2. Constructor llenos se debe llamar igual que la clase y se usa para crear objetos con datos iniciales
    public PersonaModel(String cedula, String nombre, int edad) {
        this.cedula = cedula;// "this" se refiere al objeto actual, se usa para diferenciar entre el atributo y el parámetro del constructor
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. Getters y Setters (Métodos para leer o cambiar los datos de forma segura),funcionan como intermediarios para acceder a los atributos privados, permitiendo controlar cómo se accede y modifica la información
    public String getCedula() { return cedula; }// El getter permite obtener el valor de la cédula, lo que es útil para mostrar la información de la persona o para realizar operaciones que requieran su identificación.

    public void setCedula(String cedula) { this.cedula = cedula; }// El setter permite cambiar el valor de la cédula después de que el objeto ha sido creado, lo que puede ser útil en casos donde la información de la persona pueda cambiar o corregirse. Sin embargo, es importante usarlo con precaución para evitar inconsistencias en los datos.

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}