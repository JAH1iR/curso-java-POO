package Model;

// CONCEPTO: CLASE (El plano o diseño que describe qué es un Empleado)
// CONCEPTO: ABSTRACCIÓN (Solo incluimos datos necesarios para la nómina: id, salario, horas)
public class EmpleadoModel {
    
    // CONCEPTO: ATRIBUTOS (Las características que definen el estado de cada empleado)
    // CONCEPTO: ENCAPSULAMIENTO (Uso de 'private' para que nadie cambie el salario por fuera)
    private String idEmpleado;
    private String nombre;
    private String puesto;
    private double salarioPorHora;
    private int horasTrabajadas;

    // CONCEPTO: MÉTODOS (Comportamientos para construir o interactuar con el objeto)
    public EmpleadoModel() {}

    public EmpleadoModel(String idEmpleado, String nombre, String puesto, double salarioPorHora, int horasTrabajadas) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioPorHora = salarioPorHora;
        this.setHorasTrabajadas(horasTrabajadas);
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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