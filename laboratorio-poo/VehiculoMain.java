import Model.VehiculoModel;
import services.VehiculoServices;
import View.VehiculoView;

public class VehiculoMain {
    public static void main(String[] args) {
        // 1. Instanciamos los motores (solo se hace una vez)
        VehiculoServices srv = new VehiculoServices();
        VehiculoView view = new VehiculoView();

        // 2. DIFERENTES INSTANCIAS (Objetos con datos distintos)
        // Vehículo 1: El auto antiguo 
        VehiculoModel autoAntiguo = new VehiculoModel("ABC-123", "Toyota", "Corolla", 1990);
        
        // Vehículo 2: El auto nuevo 
        VehiculoModel autoNuevo = new VehiculoModel("XYZ-789", "Nissan", "Frontier", 2024);

        // 3. proceso y muestro ambos vehiculos 
        String cat1 = srv.definirCategoria(autoAntiguo);
        view.mostrarFichaTecnica(autoAntiguo, cat1);

    
        String cat2 = srv.definirCategoria(autoNuevo);
        view.mostrarFichaTecnica(autoNuevo, cat2);
    }
}