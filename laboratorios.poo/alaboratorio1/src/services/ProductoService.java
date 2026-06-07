package services;
import Model.ProductoModel;

public class ProductoService {
    public double calcularValorInventario(ProductoModel p) {
        return p.getPrecioUnitario() * p.getCantidadStock();
    }

    public boolean esBajoStock(ProductoModel p) {
        return p.getCantidadStock() < 5;
    }
}