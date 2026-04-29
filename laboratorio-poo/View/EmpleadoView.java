package View;
import Model.EmpleadoModel;
import services.EmpleadoService;

public class EmpleadoView {
    public void imprimirComprobante(EmpleadoModel e, EmpleadoService s) {
        System.out.println("REPORTE DE NÓMINA");
        System.out.println("ID: " + e.getIdEmpleado());
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Puesto: " + e.getPuesto());
        System.out.println("Salario Bruto: " + Math.round(s.calcularSalarioBruto(e) * 10.0) / 10.0);
        System.out.println("Deducción Seguro Social: " + Math.round(s.calcularSeguroSocial(e) * 10.0) / 10.0);
        System.out.println("Deducción Seguro Educativo: " + Math.round(s.calcularSeguroEducativo(e) * 10.0) / 10.0);
        System.out.println("TOTAL NETO: " + Math.round(s.calcularSalarioNeto(e) * 10.0) / 10.0);
        System.out.println("-------------------------");
    }
}