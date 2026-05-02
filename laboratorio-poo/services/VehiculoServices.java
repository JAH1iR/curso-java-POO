package services;

// Importamos el modelo para poder usar el objeto Vehiculo
import Model.VehiculoModel;

public class VehiculoServices {

    // Método para calcular la antigüedad restando el año actual (2026)
    public int calcularAntiguedad(VehiculoModel v) {
        int anioActual = 2026;
        int anioFabricacion = v.getAñoFabricacion(); // Usamos el getter del modelo[cite: 7, 8]
        int antiguedad = anioActual - anioFabricacion;
        return antiguedad;
    }

    // Método para definir la categoría según la antigüedad calculada
    public String definirCategoria(VehiculoModel v) {
        // Primero calculamos la antigüedad usando el método de arriba
        int antiguedad = calcularAntiguedad(v);
        String categoria = "";

        // Lógica manual con condicionales básicos
        if (antiguedad > 25) {
            categoria = "Clásico";
        } else if (antiguedad < 5) {
            categoria = "Moderno";
        } else {
            categoria = "Estándar";
        }

        return categoria;
    }
}