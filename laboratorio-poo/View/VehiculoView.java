package View;

import Model.VehiculoModel;

public class VehiculoView {
    // Solo dejamos el método que imprime de forma profesional
    public void mostrarFichaTecnica(VehiculoModel v, String categoria) {
        System.out.println("\n========================================");
        System.out.println("           FICHA TÉCNICA   ");
        System.out.println("========================================");
        System.out.println("PLACA:\t\t" + v.getPlaca());
        System.out.println("MARCA/MODELO:\t" + v.getMarca() + " " + v.getModelo());
        System.out.println("AÑO:\t\t" + v.getAñoFabricacion());
        System.out.println("----------------------------------------");
        System.out.println(" CATEGORÍA: " + categoria.toUpperCase());
        System.out.println("========================================\n");
    }
}