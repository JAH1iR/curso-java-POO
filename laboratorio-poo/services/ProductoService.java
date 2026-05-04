package services;

import Model.ProductoModel;

public class ProductoService {
    public double calcularValorInventario(ProductoModel p) {
        return p.getPrecioUnitario() * p.getCantidadStock();
    }

    public boolean esBajoStock(ProductoModel p) {
        // Consideramos bajo stock si hay menos de 5 unidades
        return p.getCantidadStock() < 5;
    }
}
