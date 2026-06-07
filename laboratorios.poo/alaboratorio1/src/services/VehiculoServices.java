package services;
import Model.VehiculoModel;

public class VehiculoServices {
    public String definirCategoria(VehiculoModel v) {
        if (v.getAnio() < 2000) return "Clásico/Antiguo";
        if (v.getAnio() < 2015) return "Usado Moderno";
        return "Último Modelo";
    }
}