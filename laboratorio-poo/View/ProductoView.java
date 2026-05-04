package View;

import Model.ProductoModel;

public class ProductoView {
    public void mostrarDetalle(ProductoModel p, double valorTotal, boolean bajoStock) {
        System.out.println("\n========== REPORTE DE PRODUCTO ==========");
        System.out.println("Producto:    " + p.getProducto());
        System.out.println("Código:      " + p.getCodigo());
        System.out.println("Descripción: " + p.getDescripcion());
        System.out.println("Precio Un.:  $" + p.getPrecioUnitario());
        System.out.println("Stock:       " + p.getCantidadStock());
        System.out.println("Total Valor: $" + valorTotal);
        System.out.println("Estado:      " + (bajoStock ? "ALERTA: STOCK BAJO" : "STOCK SUFICIENTE"));
        System.out.println("=========================================\n");
    }
}
