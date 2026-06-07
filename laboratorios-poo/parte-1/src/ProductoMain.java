import Model.ProductoModel;
import services.ProductoService;
import View.ProductoView;

public class ProductoMain {
    public static void main(String[] args) {
        // 1. Instanciamos el modelo con datos (usando el constructor lleno)
        // Parámetros: codigo, descripcion, precioUnitario, cantidadStock, Producto
        ProductoModel prod = new ProductoModel(101, "Laptop de alto rendimiento", 1200.0, 3, "Laptop Pro");

        // 2. Instanciamos el servicio para la lógica y la vista para la salida
        ProductoService service = new ProductoService();
        ProductoView view = new ProductoView();

        // 3. Realizamos cálculos mediante el servicio
        double valorTotal = service.calcularValorInventario(prod);
        boolean bajoStock = service.esBajoStock(prod);

        // 4. Enviamos los datos procesados a la vista para imprimirlos
        view.mostrarDetalle(prod, valorTotal, bajoStock);
    }
}
