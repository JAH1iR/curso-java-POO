package View;
import Model.VehiculoModel;

public class VehiculoView {
    public void mostrarFichaTecnica(VehiculoModel v, String categoria) {
        System.out.println("--- FICHA TÉCNICA VEHÍCULO ---");
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Marca/Modelo: " + v.getMarca() + " " + v.getModelo());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Categoría: " + categoria);
        System.out.println("------------------------------");
    }
}