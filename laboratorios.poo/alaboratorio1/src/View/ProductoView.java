package View;
import Model.ProductoModel;

public class ProductoView {
    public void mostrarDetalle(ProductoModel p, double valorTotal, boolean bajoStock) {
        System.out.println("--- DETALLE DEL PRODUCTO ---");
        System.out.println("Producto: " + p.getProducto());
        System.out.println("Descripción: " + p.getDescripcion());
        System.out.println("Precio Unitario: $" + p.getPrecioUnitario());
        System.out.println("Cantidad: " + p.getCantidadStock());
        System.out.println("Valor Total Inventario: $" + valorTotal);
        System.out.println("¿Requiere reabastecimiento?: " + (bajoStock ? "SÍ" : "NO"));
        System.out.println("----------------------------");
    }
}