import Model.EmpleadoModel;
import services.EmpleadoService;
import View.EmpleadoView;

public class EmpleadoMain {
    public static void main(String[] args) {
        // Usando lógica de constructor vacío y setters
        EmpleadoModel emp = new EmpleadoModel();
        emp.setIdEmpleado("6767");
        emp.setNombre("juan carlos bodoque");
        emp.setPuesto("bodegas");
        emp.setSalarioPorHora(12.0);
        emp.setHorasTrabajadas(80);

        EmpleadoService serv = new EmpleadoService();
        EmpleadoView view = new EmpleadoView();

        view.imprimirComprobante(emp, serv);
    }
}