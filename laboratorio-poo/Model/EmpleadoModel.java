package Model;

public class EmpleadoModel { // Cambiado a Mayúscula
    private String idEmpleado;
    private String nombre;
    private String puesto;
    private double salarioPorHora; // Cambiado a double (primitivo)
    private int horasTrabajadas;

    // Constructor lleno
    public EmpleadoModel(String idEmpleado, String nombre, String puesto, double salarioPorHora, int horasTrabajadas) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioPorHora = salarioPorHora;
        setHorasTrabajadas(horasTrabajadas); // Usamos el setter para validar
    }

    // Constructor vacío
    public EmpleadoModel() {
        this.idEmpleado = "sin registrar";
        this.nombre = "sin nombre";
        this.puesto = "sin nombrar";
        this.salarioPorHora = 0.0;
        this.horasTrabajadas = 0;
    }

    // Getters y Setters
    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalarioPorHora() { return salarioPorHora; }
    public void setSalarioPorHora(double salarioPorHora) { this.salarioPorHora = salarioPorHora; }

    public int getHorasTrabajadas() { return horasTrabajadas; }

    //  la validación 
    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas < 0) {
            this.horasTrabajadas = 0;
        } else {
            this.horasTrabajadas = horasTrabajadas;
        }
    }
}