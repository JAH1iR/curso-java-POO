package Model;

// CONCEPTO: CLASE (El plano o diseño que describe qué es un Empleado)
// CONCEPTO: ABSTRACCIÓN (Solo incluimos datos necesarios para la nómina: id, salario, horas)
// CONCEPTO: HERENCIA (EmpleadoModel hereda de PersonaModel)
public class EmpleadoModel extends PersonaModel {
    
    // CONCEPTO: ATRIBUTOS (Las características que definen el estado de cada empleado)
    // CONCEPTO: ENCAPSULAMIENTO (Uso de 'private' para que nadie cambie el salario por fuera)
    // Nota: El 'nombre' ya no está aquí porque se hereda de PersonaModel
    private String idEmpleado;
    private String puesto;
    private double salarioPorHora;
    private int horasTrabajadas;

    // CONCEPTO: MÉTODOS (Comportamientos para construir o interactuar con el objeto)
    public EmpleadoModel() {
        super(); // Llama al constructor de PersonaModel
    } 

    /**
     * Constructor con parámetros usando Herencia
     * cedula (Heredado de Persona)
     * nombre (Heredado de Persona)
     * edad (Heredado de Persona)
     */
    public EmpleadoModel(String cedula, String nombre, int edad, String idEmpleado, String puesto, double salarioPorHora) {
        // 'super' pasa los datos comunes a la clase padre (PersonaModel)
        super(cedula, nombre, edad);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.salarioPorHora = salarioPorHora;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



    public double getSalarioPorHora() {
        return salarioPorHora;
    }



    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }



    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }



    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
}