import Model.EmpleadoModel;
import View.EmpleadoView;
import services.EmpleadoService;

public class EmpleadoMain {
    public static void main(String[] args) {
        // Usando lógica de constructor vacío y setters
        // CONCEPTO: INSTANCIA (El uso de 'new' crea un espacio único en memoria para este empleado)
        // CONCEPTO: OBJETO (La variable 'emp' es un objeto real, con nombre "juan carlos bodoque")
        EmpleadoModel emp = new EmpleadoModel();
        emp.setIdEmpleado("6767");
        emp.setNombre("juan carlos bodoque");
        emp.setPuesto("bodegas");
        emp.setSalarioPorHora(15.0);
        emp.setHorasTrabajadas(8);

        EmpleadoService serv = new EmpleadoService();
        EmpleadoView view = new EmpleadoView();

        view.imprimirComprobante(emp, serv);
    }
}