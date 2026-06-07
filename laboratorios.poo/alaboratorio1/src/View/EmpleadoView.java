package View;
import Model.EmpleadoModel;
import services.EmpleadoService;

// CONCEPTO: CLASE (La clase encargada de la salida de datos hacia el usuario)
public class EmpleadoView {
    
    // CONCEPTO: MÉTODO (Un comportamiento de la vista para imprimir el reporte)
    // CONCEPTO: OBJETOS (Recibe 'e' de tipo EmpleadoModel y 's' de tipo EmpleadoService como parámetros)
    public void imprimirComprobante(EmpleadoModel e, EmpleadoService s) {
        System.out.println("REPORTE DE NÓMINA");
        // CONCEPTO: ENCAPSULAMIENTO (Accedemos a los ATRIBUTOS mediante getters, no directamente)
        System.out.println("ID: " + e.getIdEmpleado()); 
        System.out.println("Nombre: " + e.getNombre()); 
        System.out.println("Puesto: " + e.getPuesto());
        
        // EXPLICACIÓN: Estos cálculos son para redondear a 1 decimal
        System.out.println("Salario Bruto: " + Math.round(s.calcularSalarioBruto(e) * 10.0) / 10.0);
        System.out.println("Deducción Seguro Social: " + Math.round(s.calcularSeguroSocial(e) * 10.0) / 10.0);
        System.out.println("Deducción Seguro Educativo: " + Math.round(s.calcularSeguroEducativo(e) * 10.0) / 10.0);
        System.out.println("TOTAL NETO: " + Math.round(s.calcularSalarioNeto(e) * 10.0) / 10.0);
        System.out.println("-------------------------");
    }
}