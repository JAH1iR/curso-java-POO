package services;
import Model.EmpleadoModel;

// CONCEPTO: CLASE (Clase especializada en lógica o "comportamiento" externo)
public class EmpleadoService {

    // CONCEPTO: MÉTODOS (Funciones que procesan la información de los objetos)
    public double calcularSalarioBruto(EmpleadoModel e) {
        return e.getHorasTrabajadas() * e.getSalarioPorHora();
    }

    public double calcularSeguroSocial(EmpleadoModel e) {
        return calcularSalarioBruto(e) * 0.0975; // 9.75%
    }

    public double calcularSeguroEducativo(EmpleadoModel e) {
        return calcularSalarioBruto(e) * 0.0125; // 1.25%
    }

    public double calcularSalarioNeto(EmpleadoModel e) {
        return calcularSalarioBruto(e) - calcularSeguroSocial(e) - calcularSeguroEducativo(e);
    }
}